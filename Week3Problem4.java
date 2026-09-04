class BrokenLibraryMember {
    static String name;
    static String memberId;
    static int booksIssued;

    public BrokenLibraryMember(String n, String id, int books) {
        name = n;
        memberId = id;
        booksIssued = books;
    }

    public void printName() {
        System.out.println(name);
    }
}

/*
 * Marking name, memberId, and booksIssued as static is incorrect because static fields belong to the class
 * and are shared across all instances. Each library member must have their own unique state. Marking them static
 * causes the data of existing members to be overwritten whenever a new member is instantiated.
 */
class LibraryMember {
    private String name;
    private String memberId;
    private int booksIssued;

    private static String libraryName = "City Central Library";
    private static int memberCount = 0;

    public LibraryMember(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
        memberCount++;
        this.memberId = "LM-" + (1000 + memberCount);
    }

    public void printMemberCard() {
        System.out.println(name + " | " + memberId);
    }

    public static void printTotalMembers() {
        System.out.println("Total members: " + memberCount);
    }
}

public class Week3Problem4 {
    public static void main(String[] args) {
        System.out.println("Broken version:");
        BrokenLibraryMember m1 = new BrokenLibraryMember("Aditi", "LM-1001", 2);
        BrokenLibraryMember m2 = new BrokenLibraryMember("Rohan", "LM-1002", 1);
        m1.printName();
        m2.printName();

        System.out.println("\nFixed version:");
        LibraryMember member1 = new LibraryMember("Aditi", 2);
        LibraryMember member2 = new LibraryMember("Rohan", 1);
        member1.printMemberCard();
        member2.printMemberCard();
        LibraryMember.printTotalMembers();
    }
}
