public class oopsBannerAppuc4 {

    public static void main(String[] args) {

        String gap = "   ";

        // UC4: Store banner lines in String array
        String[] banner = new String[7];

        banner[0] = String.join(gap, " *** ", " *** ", " ***** ", " ***** ");
        banner[1] = String.join(gap, "**   **", "**   **", "**   **", "**   **");
        banner[2] = String.join(gap, "**   **", "**   **", "**   **", "**   **");
        banner[3] = String.join(gap, "**   **", "**   **", " ***** ", " ***** ");
        banner[4] = String.join(gap, "**   **", "**   **", "**      ", "     **");
        banner[5] = String.join(gap, "**   **", "**   **", "**      ", "**   **");
        banner[6] = String.join(gap, " *** ", " *** ", "**      ", " ***** ");

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}