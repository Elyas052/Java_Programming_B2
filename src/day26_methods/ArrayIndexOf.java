package day26_methods;

public class ArrayIndexOf {

    public static void main(String[] args) {

        int[] arr = {12, 5, 1, 5, 2, 6, 5};
        System.out.println(indexOf(arr, 2));
        System.out.println(indexOf(arr, 20));
        System.out.println(indexOf(arr, 5));

        String[] words = {"java", "apple", "water", "hello"};
        System.out.println(indexOf(words, "hello"));
    }

    public static int indexOf(String[] str, String element) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    public static int indexOf(int[] num, int element) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] == element) {
                return i;
            }
        }

        return -1;
    }
}
