package day26_methods;

import my_utilities.ArrayUtil;

public class SumOfElements {
    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 2};
        // Since I am using the method from the same class, I can call it with just the method name.
        System.out.println(sumOfArray(arr));

        // Since I am using the method from different package,
        // i need to import the package first, then use the class name to call method which is inside the class.
        System.out.println(ArrayUtil.sumOfArray(arr));

        System.out.println(sumOfArray(4, 5, 6, 7));
    }

    // This parameter is called VAR ARGS -- > which is the same data type of elements - > same as an array.
    public static int sumOfArray(int... arr) {
        int sum = 0;

        for (int eachNum : arr) {
            sum += eachNum;
        }
        return sum;
    }
}
