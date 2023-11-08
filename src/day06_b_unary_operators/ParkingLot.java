package day06_b_unary_operators;

public class ParkingLot {
    public static void main(String[] args) {

        int cars = 10;
        System.out.println("\n2 cars drive into the parking lot");
        // Approach 1:

        cars = cars + 2;
        System.out.println(cars);

        System.out.println("\n2 more cars drive in");

        // Approach 2:
        cars++;
        cars++;
        System.out.println(cars);

        System.out.println("\n5 cars left");

        cars = cars - 5;
        System.out.println(cars);

    }
}
