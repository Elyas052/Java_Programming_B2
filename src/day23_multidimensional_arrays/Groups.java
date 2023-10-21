package day23_multidimensional_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] groups = new String[4][];
        //String [][] groups = new String[4][3];
        //[[null, null, null], [null, null, null], [null, null, null], [null, null, null]] --> 4 inner arrays that each have a size of 3
        System.out.println(Arrays.deepToString(groups));

        String [] groupOne = {"Emre", "Yasir", "Eda"};
        groups[0] = groupOne;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("adding group 2");

        String [] groupTwo = {"Basri", "Demet", "Shina", "Ismayil"};
        groups[1] = groupTwo;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("adding group 3");
        groups[2] = new String[]{"Mustafa", "Lima"};  // syntax to create an array without a reference
        System.out.println(Arrays.deepToString(groups));

        System.out.println("same group 3 as group 4");
        groups[3] = groups[2];
        System.out.println(Arrays.deepToString(groups));

        System.out.println();

        for(String [] innerArray : groups){  // loops through the 2d array, groups

            for(String eachWord : innerArray){ // loops through every String element in each 1d inner array
                System.out.println(eachWord);
            }

        }
    }
}
