package day14;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your message");
        String msg = input.nextLine(); // input.nextLine().toLowerCase().trim();
        msg = msg.toLowerCase();
        msg = msg.trim();

        if(msg.contains("java is bad") || msg.contains("quit") || msg.contains("have fun") || msg.contains("crying")){
            System.out.println("Message failed to send");
        } else {
            System.out.println("\"" + msg +  "\"" + " was sent");
        }

    }
}
