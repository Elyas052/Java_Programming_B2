package day16_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        int n = 2;
        while (n <= 20) {
            System.out.print(n + " ");
            n += 2;
        }

        System.out.println("\n");
        // Approach 2:
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\n");


        // Odd numbers
        int a = 1;

        while (a <= 100) {
            System.out.print(a + " ");
            a += 2; // a = a + 2;
        }

        System.out.println("\n");
        // Approach 2
        int b = 0;

        while (b++ < 100) {
            if (b % 2 == 1) {
                System.out.print(b + " ");
            }
        }

        /*
            flow:
            b = 0
            b++ <= 100 --> 0 <= 100 --> loop runs and b increments to 1
             if (b % 2 == 1) --> 1 % 2 == 1 --> true -> prints number

             while(b++ <= 100) --> 1 <= 100 --> loop runs and b increments to 2
             if (b % 2 == 1) --> 2 % 2 == 1 --> false -> nothing happens

              while(b++ <= 100) --> 2 <= 100 -> loop runs and b increments to 3
         */

    }
}
