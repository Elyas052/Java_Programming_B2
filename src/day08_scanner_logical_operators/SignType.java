package day08_scanner_logical_operators;

public class SignType {
    public static void main(String[] args) {

        int num = 0;

        boolean isNegative = num < 0;
        boolean isPositive = num > 0;
        boolean isZero = num == 0;
        boolean isNotZero = num != 0;

        System.out.println("\n" + num + " is negative: " + isNegative);
        System.out.println(num + " is positive: " + isPositive);
        System.out.println(num + " is zero:\t   " + isZero);
        System.out.println(num + " is not zero: " + isNotZero);

    }
}
