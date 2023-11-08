package day25_methods;

/**
 * Create a method that accepts currency type and amount.
 * Return the correct converted amount.
 * <p>
 * 100 - euro
 * <p>
 * 1$ = 0.95 Euro
 * 1$ = 150.23 Yen
 * 1$ = 28.15 Lira
 * 1$ = 83.17 Rupees
 */

public class CurrencyConverter {
    public static double convert(String currencyType, double amount) {

        switch (currencyType.toLowerCase()) {  //
            case "euro":
                return amount * 0.95;
            case "yen":
                return amount * 150.23;
            case "lira":
                return amount * 28.15;
            case "rupee":
                return amount * 83.17;
            default:
                return amount * 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(convert("Euro", 100.0));
        System.out.println(convert("LIRA", 100.0));

        double convertedAmount = convert("RUPEE", 100.0);
        System.out.println("With " + convertedAmount + " you can buy somethings. ");

    }
}
