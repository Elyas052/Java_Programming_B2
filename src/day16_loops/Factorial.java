package day16_loops;

public class Factorial {
    public static void main(String[] args) {

        int n = 5;
        int result = 1;

        // 5 * 4 * 3 * 2 * 1
        // Repeated action: multiply the numbers by one less than it
        // Stopping point: number gets to 1

        while (n > 1) {
            System.out.println(result + " * " + n);
            result *= n; // result = result * n
            n--;
        }

        System.out.println(result);

    }
}
