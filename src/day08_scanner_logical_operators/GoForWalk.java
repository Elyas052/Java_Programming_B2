package day08_scanner_logical_operators;

public class GoForWalk {
    public static void main(String[] args) {

        boolean isRaining = false;
        int temperature = 80;

        System.out.println("\nGo for walk - " + (!isRaining && temperature > 70)); // !false -> true

    }
}
