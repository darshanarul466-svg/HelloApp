public class WeekOneProblemTwo {

    public static void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int total = original.length();
        int firstMismatchPos = -1;
        char origChar = ' ';
        char typedChar = ' ';

        for (int i = 0; i < total; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1;
                origChar = original.charAt(i);
                typedChar = typed.charAt(i);
            }
        }

        double accuracy = ((double) matched / total) * 100.0;
        String accuracyStr = String.format("%.2f%%", accuracy);

        if (firstMismatchPos != -1) {
            System.out.println("Matched: " + matched + "/" + total + " | Accuracy: " + accuracyStr + " | First Mismatch at position " + firstMismatchPos + " ('" + origChar + "' vs '" + typedChar + "')");
        } else {
            System.out.println("Matched: " + matched + "/" + total + " | Accuracy: " + accuracyStr + " | No Mismatches");
        }
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
        checkTypingAccuracy("coding", "coding");
    }
}
