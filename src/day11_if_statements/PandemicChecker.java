package day11_if_statements;

import java.util.Scanner;

public class PandemicChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year you want to check:");
        int year = input.nextInt();
        // int year = 2022;
        String pandemic;

        if (year >= 1346 && year <= 1353) {
            pandemic = "The Black Death";
        } else if (year >= 1665 && year <= 1666) { // year == 1665 || year == 1666
            pandemic = "Great Plague of London";
        } else if (year >= 1770 && year <= 1772) {
            pandemic = "Russian plague";
        } else if (year >= 1889 && year <= 1890) {
            pandemic = "Flu pandemic";
        } else if (year == 1916) {
            pandemic = "American polio epidemic";
        } else if (year >= 1918 && year <= 1920) {
            pandemic = "Spanish flu";
        } else if (year >= 2009 && year <= 2010) {
            pandemic = "H1N1 Swine Flu pandemic";
        } else if (year >= 2014 && year <= 2016) {
            pandemic = "West African Ebola epidemic";
        } else if (year >= 2019 && year <= 2022) {
            pandemic = "COVID-19";
        } else {
            pandemic = "No Pandemic";
        }

        System.out.println(pandemic);

    }
}
