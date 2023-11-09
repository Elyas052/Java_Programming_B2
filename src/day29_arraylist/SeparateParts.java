package day29_arraylist;

import java.util.*;

public class SeparateParts {
    public static void main(String[] args) {

        String s = "ABCD123$%#@&456EFG!";

        // How can I store all the Characters into and arraylist?
        ArrayList <String> list = new ArrayList<>(Arrays.asList( s.split(""))  );
        System.out.println(list);

        // This is doing the same thing as above.
//        for (int i = 0; i < s.length(); i++) {
//            list.add( "" + s.charAt(i));
//        }


        // Create a new ArrayList that will have only the numbers.
        ArrayList <String> numbers = new ArrayList<>(list); // I made a copy of the list into numbers
        numbers.retainAll(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8","9"));
        System.out.println(numbers);

        // Create a new ArrayList that will have only the SPECIAL CHARACTERS.
        ArrayList <String> special = new ArrayList<>(list); // I made a copy of the list into special
        special.retainAll( Arrays.asList("!", "@", "#", "$","%", "^", "&", "*", "(", ")") );
        System.out.println(special);

        ArrayList <String> letters = new ArrayList<>(list); // I made a copy of the list into letters
        letters.removeAll(numbers);
        letters.removeAll(special);
        System.out.println(letters);
    }
}
