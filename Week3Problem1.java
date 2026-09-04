class BookIssue {
    String title;
    String borrowerName;
    int daysOverdue;

    public BookIssue(String title, String borrowerName, int daysOverdue) {
        this.title = title;
        this.borrowerName = borrowerName;
        this.daysOverdue = daysOverdue;
    }

    public double fineAmount() {
        if (daysOverdue > 0) {
            return daysOverdue * 5.0;
        }
        return 0.0;
    }

    public boolean isSeverelyOverdue() {
        return daysOverdue > 14;
    }

    /*
     * totalFineCollected is static because it operates over an array/collection of multiple BookIssue objects
     * as a utility operation belonging to the class as a whole. fineAmount is an instance method because it
     * calculates the fine for a specific BookIssue instance based on its individual daysOverdue state.
     */
    public static double totalFineCollected(BookIssue[] issues) {
        double total = 0;
        for (BookIssue issue : issues) {
            total += issue.fineAmount();
        }
        return total;
    }
}

public class Week3Problem1 {
    public static void main(String[] args) {
        BookIssue[] books = {
            new BookIssue("Clean Code", "Student1", 18),
            new BookIssue("Effective Java", "Student2", 5),
            new BookIssue("Refactoring", "Student3", 0),
            new BookIssue("DSA Handbook", "Student4", 21),
            new BookIssue("Design Patterns", "Student5", 9)
        };

        for (BookIssue book : books) {
            String status = book.isSeverelyOverdue() ? "Severely overdue" : "OK";
            System.out.println(book.title + " - " + book.daysOverdue + " days - " + status);
        }

        System.out.println("Total fine collected: Rs " + BookIssue.totalFineCollected(books));
    }
}
