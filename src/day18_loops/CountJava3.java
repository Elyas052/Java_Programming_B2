package day18_loops;

public class CountJava3 {

        /*

        java is a language
        012345

        java 0, 4    i, i + 4
        ava  1, 5    i,  i + 4
        va i 2, 6
     */

    public static void main(String[] args) {

        String str = "java is a java language.java";
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) { // i <= str.length() - 4;

            String everyFour = str.substring(i, i + 4);
//            System.out.println(everyFour);
            if (everyFour.equals("java")) {
                count++;
            }

        }

        System.out.println(count);

        /*
               we did substring( i , i + 4) to read every four characters in the String

               doing i + 4 causes the program to be out of bounds

                so to fix it, we tried i < str.length() - 4
                but -4 skipped the last four characters in the String

                so either you had to do:
                    i <= str.length() - 4
                    or
                    i < str.length() - 3

               because the second number in substring is not included in the result

         */

    }
}
