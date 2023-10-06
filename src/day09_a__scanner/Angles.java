package day09_a__scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        System.out.println("Enter three angle degree/number: ");

        Scanner input = new Scanner(System.in);
        double angleOne = input.nextDouble();
        double angleTwo = input.nextDouble();
        double angleThree = input.nextDouble();

        double total = angleOne + angleTwo + angleThree;

        boolean isTriangle = total == 180;
        boolean isCircle = total == 360;

        System.out.println("It is a triangle: " + isTriangle);
        System.out.println("It is a circle: " + isCircle);

        /*
          if the number is dividable by 2

          13 -- ?

          13 / 2 = 6
          13 % 2 = 1 == 0
         */

    }
}
