package day33_a_static;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {

        LoopCampStudents student1 = new LoopCampStudents("Sergei", 3);
        System.out.println(student1);

        LoopCampStudents student2 = new LoopCampStudents("Nihad", 3);
        System.out.println(student2);

        System.out.println();
        LoopCampStudents.printInfo();

        // Can you get me the just name of the teachers in this course?
        System.out.println("Teachers Name: " + Arrays.toString(LoopCampStudents.teachers));
        System.out.println("Teachers Name: " + Arrays.toString(student1.teachers));
        System.out.println("Teachers Name: " + Arrays.toString(student2.teachers));

    }
}