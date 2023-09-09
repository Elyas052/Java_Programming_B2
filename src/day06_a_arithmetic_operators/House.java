package day06_a_arithmetic_operators;

public class House {
    public static void main(String[] args) {
            String houseType = "Single House";
            int numberOfBedroom = 5;
            int numberOfBathroom = 3;
            int numberOfKitchen = 2;
            boolean hasBasement = true;
            boolean hasAttic = false;
            boolean isOnSale = false;
            double price = 9_999_999.99; // 9,999,999.99
            String address = "123 Central Park, NY";
            int zipcode = 12321;
            boolean hasPark = true;
            double rating = 4.9;

            String result = "The " + houseType + " on " + address + ", " + zipcode + " costs $" + price + ". \nThe " + houseType + " has " + numberOfBedroom + " bedrooms, has " + numberOfBathroom + " bathrooms, and has " + numberOfKitchen + " kitchen. \nIt also includes a basement: " + hasBasement + ", has an attic: " + hasAttic + " and, has a park: " + hasPark + ", is on sale: " + isOnSale + "\nThe schools in the area have a rating of " + rating;

            System.out.println(result);
        }
    }