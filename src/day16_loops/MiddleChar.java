package day16_loops;

public class MiddleChar {
    public static void main(String[] args) {

        String s = "abcdef";
        //  012345

        int mid = s.length() / 2;

        if (s.length() % 2 == 0) {
            // Our word is even length
            // length / 2 => 6 / 2 = 3

            char firstMiddle = s.charAt(mid - 1);
            char secondMiddle = s.charAt(mid);
            System.out.println("With charAt: " + firstMiddle + secondMiddle);
            System.out.println("With substring: " + s.substring(mid - 1, mid + 1));

        } else {
            // Our word is odd length
            char middle = s.charAt(mid);
            System.out.println("With charAt: " + middle);
            System.out.println("With substring: " + s.substring(mid, mid + 1));

        }
    }
}
