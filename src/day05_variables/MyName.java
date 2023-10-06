package day05_variables;

public class MyName {
    public static void main(String[] args) {

        char first = 'E';
        char second = 'l';
        char three = 'y';
        char four = 'a';
        char five = 's';

        System.out.println(first);
        System.out.println(second);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);

        System.out.println(first + second + three + four + five);
        System.out.println("My name is: " + first + second + three + four + five);

        String myName = "" + first + second + three + four + five;
        System.out.println("My name is: " + myName);

    }
}
