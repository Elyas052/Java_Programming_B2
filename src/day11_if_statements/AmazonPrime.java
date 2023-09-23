package day11_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {

        double price = 20.0;
        boolean hasPrime = false;
        String message = "";
        if (!hasPrime) {
            message = "Eligible for 2 day shipping";
        } else {
            if (price >= 25) {
                message = "Eligible for regular free shipping";
            } else {
                message = "Not eligible for free shipping. Shipping fee: 3.99";
            }
        }
        System.out.println(message);

        System.out.println("-----------------------------");

        if (hasPrime) {
            message = "Eligible for 2 day shipping";
        } else if (!hasPrime && price >= 25) {
            message = "Eligible for regular free shipping";
        } else if (!hasPrime && price < 25) {
            message = "Not eligible for free shipping. Shipping fee: 3.99";
        }
        System.out.println(message);
    }
}