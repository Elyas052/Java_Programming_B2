package day33_a_static;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopcampStudents {

    String name;
    int groupNumber;

    static int batchNumber;

    static String[] teachers;

    static String schoolName;

    static {
        batchNumber = 2;
        teachers = new String[]{"Nadir", "Feyruz"};
        schoolName = "Loopcamp";
        printInfo();
    }

    public LoopcampStudents(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public static void printInfo() {
        System.out.println("School Info");
        System.out.println("\tSchool Name: " + schoolName);
        System.out.println("\tBatch Number: " + batchNumber);
        System.out.println("\tTeachers: " + Arrays.toString(teachers));
        System.out.println();
    }

    @Override
    public String toString() {
        return "Loopcamp Students Info" +
                "\n\tName: " + name +
                "\n\tGroup Number: " + groupNumber;
        //+ "\n\tBatch Number: " + batchNumber;
    }
}