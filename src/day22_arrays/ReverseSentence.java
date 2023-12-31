package day22_arrays;

/**
 * today is java
 * <p>
 * java is today
 */

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "today is java";

        // I need to get each word and concatenate it starting from an end.
        String[] words = sentence.split(" ");  // [today, is, java]
        System.out.println(words.length); //

        // Return each word
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println("--------------------");

        // Return reverse sentence.
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {

            result += words[i] + " ";
            // System.out.println(words[i]);
        }

        System.out.println(result.trim());

    }
}
