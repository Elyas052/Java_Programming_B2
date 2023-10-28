package day27_wrapper_arraylist;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 2, 123, 234};
        int num = 45;

        System.out.println(   Arrays.toString(   arr  )  );
        System.out.println(   Arrays.toString(   addElementInArr(arr, num)   )   );

        System.out.println("---------------------------");
        String [] words = {"loop", "array", "methods", "softskills"};
        System.out.println( Arrays.toString(  words  ));

        String [] updatedWords = addElementInArr( words, "database");
        System.out.println(   Arrays.toString(     updatedWords       )     );
    }

    // Can you write a code that takes two parameters (int array, an int num) and returns you a new int an array?
    public static int [] addElementInArr (int [] originalArr, int num) {
        int [] newArr = Arrays.copyOf(originalArr, originalArr.length+1 ); // [1, 3, 5, 2, 123, 234, _ ]
        newArr[newArr.length-1] = num;
        return newArr;
    }

    public static String [] addElementInArr (String [] originalArr, String str) {  // ["java", "loop"]
        String [] newArr = new String [originalArr.length + 1]; // [ _, _, _, ........ ]
        for (int i = 0; i < originalArr.length; i++) {
            newArr[i] = originalArr [i];
        }
        // [ "java", "loop", null]
        newArr [newArr.length - 1] = str;
        return newArr;
    }
}
