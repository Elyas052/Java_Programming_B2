package day25_methods;

import java.util.Scanner;

public class Greeting {

    // Parameterized void method. | String name = "Nadir";
    public static void hello(String name) {
        System.out.println("Hello " + name + ", how are you?");
    }

    public static void main(String[] args) {

        // hello(); // You can not call it like this with NOT argument because the method was not declared like that.
        hello("Nadir");  // ARGUMENT --> it is the data that we are passing when we are calling parameterized method.
        hello("Ramiz");
        hello("Parvana");

        //hello(10);  // Data type has to match what the method accepts as parameter.
        //hello(true);

        System.out.println("----------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        hello(name);

    }
}
