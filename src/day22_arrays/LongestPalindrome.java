package day22_arrays;

/**
 * [IQ] Longest Palindrome
 * Given a String array. Find the longest Palindrome String in your array.
 * Ex:
 * Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
 * Output: racecar
 * Ex:
 * Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
 * Output: No palindrome
 */

public class LongestPalindrome {
    public static void main(String[] args) {

        // Reference array.
        String[] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        // I need to loop through to get each of them.
        // Then reverse.
        // Next, compare if them match.
        // Then compare which one is longest.

        // With this OUTER loop, I am getting each element of the arrays.
        for (int i = 0; i < arr.length; i++) {

            // On each cycle, here I am assigning the values of the specific index of an array to String eachWord.
            String eachWord = arr[i];

            // On each cycle, I am declaring a new String reversed with and "" - empty value.
            String reversed = "";

            // On each OUT loop cycle, amd also creating a new loop.
            // With this INNER Loop. I am getting each character of 'eachWord' starting from an end.
            for (int j = eachWord.length() - 1; j >= 0; j--) {

                // I am adding each character into this String reversed.
                reversed += "" + eachWord.charAt(j);
            }

            // On each cycle of OUTER loop, I am comparing if eachWord is equal to the reversed to see if it is PALINDROME.
            if (eachWord.equals(reversed)) {

                // If it's PALINDROME, I am comparing the length of the longestPalindrome with the eachWord.
                if (eachWord.length() > longestPalindrome.length()) {

                    // If eachWord length is bigger, then re-assign it to the longestPalindrome.
                    longestPalindrome = eachWord;
                }

            }
        }

        System.out.println(longestPalindrome);

    }
}
