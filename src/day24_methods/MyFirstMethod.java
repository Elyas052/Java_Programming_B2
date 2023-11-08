package day24_methods;

import java.util.Arrays;

public class MyFirstMethod {

    public static void helloWorld() { // void method: DOES the action. DOES NOT RETURN anything.
        System.out.println("Hello World!");
    }

//    // In the same class, we cannot have two same method names with the exact same parenthesis.
//    public static void helloWorld (){
//    }

    public static void helloWorld10() {
        for (int i = 0; i < 10; i++) {
            //System.out.println("Hello World");
            helloWorld();
        }
    }

    public static void main(String[] args) {
        helloWorld();  // I am calling the method with its name
        helloWorld();
        System.out.println("----------------");

        helloWorld10();
        helloWorld10();

    }
}
