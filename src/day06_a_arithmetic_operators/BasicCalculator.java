package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 4;

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + remainder);

        // Parenthesis have higher in action.
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }
}
