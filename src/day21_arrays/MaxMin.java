package day21_arrays;

public class MaxMin {
    public static void main(String[] args) {

        int[] nums = {23, 23, 65, 786, 6, 67, 7886};
        int min = nums[0];
        int max = nums[0];

        // Loop through and get each element
        // then compare that to see if it is bigger or less
        for (int i = 0; i < nums.length; i++) {

            int eachElement = nums[i];

            if (eachElement < min) {
                min = eachElement;
            }

            if (eachElement > max) {
                max = eachElement;
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
