class ParkingSlot {
    private String slotNo;
    private int capacity;
    private int occupiedCount;

    public ParkingSlot(String slotNo, int capacity, int occupiedCount) {
        this.slotNo = slotNo;
        this.capacity = capacity;
        this.occupiedCount = occupiedCount;
    }

    public String getSlotNo() {
        return slotNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getOccupiedCount() {
        return occupiedCount;
    }

    public boolean allot(String vehicleNo) {
        if (occupiedCount < capacity) {
            occupiedCount++;
            return true;
        }
        return false;
    }

    /*
     * Passing the ParkingSlot array into these methods passes copies of object references, not copies of the slot objects.
     * Both the method parameters and the array reference the exact same ParkingSlot objects in heap memory, so any state changes
     * (like occupiedCount incrementing) directly modify the original ParkingSlot instances.
     */
    public static ParkingSlot findAvailableSlot(ParkingSlot[] slots) {
        for (ParkingSlot slot : slots) {
            if (slot.getOccupiedCount() < slot.getCapacity()) {
                return slot;
            }
        }
        return null;
    }

    public static void safeAllot(ParkingSlot[] slots, String vehicleNo) {
        ParkingSlot available = findAvailableSlot(slots);
        if (available != null) {
            available.allot(vehicleNo);
            System.out.println(vehicleNo + " allotted to slot " + available.getSlotNo());
        } else {
            System.out.println("No slots available for " + vehicleNo);
        }
    }
}

public class Week3Problem3 {
    public static void main(String[] args) {
        ParkingSlot[] slotsWithFreeSpace = {
            new ParkingSlot("A1", 4, 3),
            new ParkingSlot("A2", 5, 5)
        };
        ParkingSlot.safeAllot(slotsWithFreeSpace, "TN09AB1234");

        ParkingSlot[] fullSlots = {
            new ParkingSlot("A1", 4, 4),
            new ParkingSlot("A2", 5, 5)
        };
        ParkingSlot.safeAllot(fullSlots, "TN09AB1234");
    }
}
