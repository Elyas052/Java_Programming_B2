package day25_methods;

import my_utilities.ArrayUtil;

public class UsingArrayUtil {

    public static void main(String[] args) {

        int[] a = {3, 1, 6, 12, 7, 1, 20};

        System.out.println(ArrayUtil.minInArray(a));
        System.out.println(ArrayUtil.maxInArray(a));

        System.out.println(ArrayUtil.containsInArray(a, 12));
        System.out.println(ArrayUtil.containsInArray(a, 5));


    }
}
