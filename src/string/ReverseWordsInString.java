package string;

public class ReverseWordsInString {
    public static String reverseWords(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word: words){
            String reversed = new StringBuilder(word).reverse().toString();
            result.append(reversed).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "hello world from java";
        String result = reverseWords(sentence);
        System.out.println(sentence);
        System.out.println(result);
    }
}
