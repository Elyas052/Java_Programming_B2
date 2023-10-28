package day27_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/*
    .add(parameter)
    .get(index)
    .size()
 */

public class ArrayListExample {
    public static void main(String[] args) {

        //Scanner input = new Scanner( System.in);

        //All Collection Classes works ONLY with OBJECT data type
        //ArrayList <int> numbers = new ArrayList<>(); - > NOT GOOD

        ArrayList<Integer> numbers = new ArrayList<>(); // In the memory, it allocated size of 10
        System.out.println(numbers.size());  // But with help of .size() method it does not show it as 10. It is just in the memory that much space allocated.
        // Comparing to ARRAY< we can directly print the ARRAYLIST
        System.out.println(numbers);

        numbers.add(100); // .add(x) - > add the element to the END
        System.out.println(numbers);

        numbers.add(-200);
        System.out.println(numbers); //.add(x) - > add the element to the END

        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);

        // How do I ge the total number of the elements in the ArrayList?
        System.out.println(numbers.size());

        // How do we get the element in the specific index
        // Similar array, the arraylist index starts form 0 as well.
        // arr[index]
        System.out.println(numbers.get(0)); //[100, -200, 10, 20]
        System.out.println(numbers.get(1)); //[100, -200, 10, 20]
        System.out.println(numbers.get(2)); //[100, -200, 10, 20]
        System.out.println(numbers.get(3)); //[100, -200, 10, 20]
        // System.out.println(  numbers.get(4)  ); //[100, -200, 10, 20]  // IndexOutOfBoundsException
    }
}