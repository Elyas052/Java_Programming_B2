package day15_string;

public class CharMethod {
    public static void main(String[] args) {

        String s = "java";
        //          0123
        System.out.println(s.length());

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        // System.out.println(s.charAt(4));

        // Dynamic length
        int lastIndex = s.length() - 1; // 4 - 1 = 3
        System.out.println("last char: " + s.charAt(lastIndex)); // This is the same as line 13, but line 13 is hardcoded

        int secondToLastIndex = s.length() - 2;
        char secondToLastChar = s.charAt(secondToLastIndex); // This is the same as line 12
        System.out.println("second to last character: " + secondToLastChar);

    }
}
