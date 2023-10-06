package day15_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the url: ");
        String url = input.next(); // www.google.com
        //012345678910

        String website = url.substring(4, url.length() - 4);
        System.out.println(website);

        // url.substring(4, 10); doesn't work for all inputs, because 10 is hardcoded

    }
}
