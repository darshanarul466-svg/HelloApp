class CompanyEmployeeRecord {
    String name;
    String empId;
    Employee employee;
    ParkingSlot slot;

    static int totalRecords = 0;

    public CompanyEmployeeRecord(String name, String empId, Employee employee, ParkingSlot slot) {
        this.name = name;
        this.empId = empId;
        this.employee = employee;
        this.slot = slot;
        totalRecords++;
    }

    public String fullProfile() {
        double pay;
        if (employee instanceof ManagerEmployee) {
            pay = ((ManagerEmployee) employee).effectiveSalary();
        } else if (employee instanceof InternEmployee) {
            pay = ((InternEmployee) employee).effectiveSalary();
        } else {
            pay = employee.getSalary();
        }

        String slotStr = (slot != null) ? slot.getSlotNo() : "no parking assigned";
        return name + " | Pay: Rs " + pay + " | Slot: " + slotStr;
    }
}

public class Week3Problem5 {
    public static void main(String[] args) {
        ManagerEmployee mgr = new ManagerEmployee(101, "Divya", 70000.0, 8000.0);
        Employee plain = new Employee(102, "Karan", 40000.0);
        InternEmployee intern = new InternEmployee(103, "Meera", 12000.0, 10000.0);

        ParkingSlot slot1 = new ParkingSlot("A1", 4, 3);
        ParkingSlot slot2 = new ParkingSlot("A2", 5, 4);

        slot1.allot("TN09AB1234");
        slot2.allot("TN09AB5678");

        CompanyEmployeeRecord r1 = new CompanyEmployeeRecord("Divya", "E101", mgr, slot1);
        CompanyEmployeeRecord r2 = new CompanyEmployeeRecord("Karan", "E102", plain, slot2);
        CompanyEmployeeRecord r3 = new CompanyEmployeeRecord("Meera", "E103", intern, null);

        System.out.println(r1.fullProfile());
        System.out.println(r2.fullProfile());
        System.out.println(r3.fullProfile());
        System.out.println("Total records: " + CompanyEmployeeRecord.totalRecords);
    }
}
