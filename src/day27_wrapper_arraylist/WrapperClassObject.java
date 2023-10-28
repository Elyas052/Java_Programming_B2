package day27_wrapper_arraylist;

import java.util.Scanner;

public class WrapperClassObject {
    public static void main(String[] args) {

        int a = 5;
        // We can assign a new value / reassign
        // a.method() --- ? we CANNOT do this

        //Scanner input = new Scanner(System.in);  // input is an object reference
        Integer a1 = new Integer(10);  // This will make it an object direct --> DEPRECATED (NOT IN USE)
        // How can I convert this primitive data type into an object a type?

        Integer a2 = 20;  // a2 is an Object reference
        // Every whole number in Java in
        // Line 18 - takes the int 20 and AUTO-BOXES it into Integer Wrapper class

        // The below example is to explain the same logic behind CASTING which similar to AUTOBOXING
        //double d = 10;
        //.out.println(d); //10.0

        int a3 = a2; // UNBOXING - > converting Integer into int

        byte b = 4;
        Byte b1 = b;   // AUTOBOXING
        Byte b2 = 20;  // AUTOBOXING
    }
}
