public class WeekOneProblemFour {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;

        for (int q : sectionA) {
            totalA += q;
        }
        for (int q : sectionB) {
            totalB += q;
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        int highestQuantity = Integer.MIN_VALUE;
        String highestSection = "";
        int highestItemNumber = -1;

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                highestSection = "Section A";
                highestItemNumber = i + 1;
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                highestSection = "Section B";
                highestItemNumber = i + 1;
            }
        }

        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB + " | Status: " + status + " | Highest Quantity: " + highestQuantity + " (" + highestSection + ", Item " + highestItemNumber + ")");
    }

    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};
        analyzeInventory(sectionA, sectionB);
    }
}
