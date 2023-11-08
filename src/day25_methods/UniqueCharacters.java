package day25_methods;

import my_utilities.StringUtil;

public class UniqueCharacters {

    /**
     * Unique Characters
     * <p>
     * create a method that will accept a word (String) and return a String with all the unique characters.
     * A character is unique if it only appears in the String once.
     * <p>
     * Hint: use your frequency method to do some of the work
     * <p>
     * Ex:
     * Input:
     * aaaaabcccdeeff
     * <p>
     * Output:
     * bd
     */

    public static String uniqueCharacters(String str) {

        String unique = "";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {

            if (checked.contains("" + str.charAt(i))) {
                continue;
            }

            int count = StringUtil.frequencyOfCharacters(str, str.charAt(i));
            checked += str.charAt(i);

            if (count == 1) {
                unique += str.charAt(i);
            }
        }

        return unique;
    }

    public static String uniqueCharacters2(String str) {

        String unique = "";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {

            if (!checked.contains("" + str.charAt(i))) {
                int count = StringUtil.frequencyOfCharacters(str, str.charAt(i));
                checked += str.charAt(i);

                if (count == 1) {
                    unique += str.charAt(i);
                }
            }
        }

        return unique;
    }
}


/**
 * aaaaabcccdeeff
 * int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
 * <p>
 * int i = 0
 * StringUtil.frequencyOfCharacter(str, str.charAt(0));
 * StringUtil.frequencyOfCharacter(aaaaabcccdeeff, a);
 * --> 5
 * ...
 * i = 5
 * StringUtil.frequencyOfCharacter(str, str.charAt(5));
 * StringUtil.frequencyOfCharacter(aaaaabcccdeeff, b);
 * -> 1
 */
