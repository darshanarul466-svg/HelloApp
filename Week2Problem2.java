public class Week2Problem2 {

    public static String reverseEachWord(String sentence) {
        if (sentence == null) {
            return "";
        }
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder revWord = new StringBuilder(words[i]);
            revWord.reverse();
            result.append(revWord);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("hello club"));
    }
}
