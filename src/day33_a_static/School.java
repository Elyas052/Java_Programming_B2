package day33_a_static;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {

        LoopcampStudents student1 = new LoopcampStudents("Sergii", 3);
        System.out.println(student1);

        LoopcampStudents student2 = new LoopcampStudents("Nihad", 3);
        System.out.println(student2);

        System.out.println();
        LoopcampStudents.printInfo();

        // can you get me the just name of the teachers in this course
        System.out.println("Teachers Name: " + Arrays.toString(LoopcampStudents.teachers));
        System.out.println("Teachers Name: " + Arrays.toString(student1.teachers));
        System.out.println("Teachers Name: " + Arrays.toString(student2.teachers));

    }
}