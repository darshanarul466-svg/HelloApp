public class oopsBannerAppuc5 {

    public static void main(String[] args) {

        String gap = "   ";

        // UC5: Inline Array Initialization with String.join()
        String[] banner = {
            String.join(gap, " *** ", " *** ", " ***** ", " ***** "),
            String.join(gap, "**   **", "**   **", "**   **", "**   **"),
            String.join(gap, "**   **", "**   **", "**   **", "**   **"),
            String.join(gap, "**   **", "**   **", " ***** ", " ***** "),
            String.join(gap, "**   **", "**   **", "**      ", "     **"),
            String.join(gap, "**   **", "**   **", "**      ", "**   **"),
            String.join(gap, " *** ", " *** ", "**      ", " ***** ")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}