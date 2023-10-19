package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {

        /** 9 - 14 */
        String str = "monday,tuesday,wednesday,thursday,friday";
        String[] days = str.split(",");
        for (String eachElem : days) {
            System.out.println(eachElem);
        }
        System.out.println();

        /** 17 - 20 */
        String[] days2 = str.split("day");
        for (String each : days2) {
            System.out.println(each);
        }

        System.out.println("----------------------------------------");

        /** 24 - 34 */
        String months = "jan-feb-mar-apr-may-jun-jul-avg-sep-oct-nov-dec";
        // Can you get the month
        // The code below is going to be a really long code which is NOT useful!
        String month1 = months.substring(0, months.indexOf("-"));
        // Print out the first month till first dash sign
        System.out.println(month1);
        months = months.replaceFirst(month1 + "-", "*");
        System.out.println(months);
        String month2 = months.substring(0, months.indexOf("-"));
        System.out.println(month2);

        /** 37 - 41 */
        // We can use split() method
        String[] allMonth = months.split("-");
        for (String eachMonth : allMonth) {
            System.out.println(eachMonth);
        }

        System.out.println("-----------------");

        /** 46 - 50 */
        // "*feb-mar-apr-may-jun-jul-avg-sep-nov-oct-dec";
        String[] arr2 = months.split("y-");
        for (String eachPart : arr2) {
            System.out.println(eachPart);
        }

        // Output with out Loop
        // ["*feb-mar-apr-ma", "jun-jul-avg-sep-nov-oct-dec"]
        System.out.println(Arrays.toString(arr2));

        // "*feb-mar-apr-may-jun-jul-avg-sep-nov-oct-dec";

        System.out.println("-----------------");

        /** 60 - 65 */
        // ["*", "f", "e", "b", "-", "m".............]
        String[] arr3 = months.split("");
        for (String eachElem : arr3) {
            System.out.println(eachElem);
        }

        // "*feb-mar-apr-may-jun-jul-avg-sep-nov-oct-dec";
        System.out.println("-----------------");

        String[] arr4 = months.split("java");
        for (String each : arr4) {
            System.out.println(each);
        }
        System.out.println(arr4.length);
        // ["*feb-mar-apr-may-jun-jul-avg-sep-nov-oct-dec"]
        System.out.println(Arrays.toString(arr4));
        System.out.println(arr4[0]);

    }
}
