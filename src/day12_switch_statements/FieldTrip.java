package day12_switch_statements;

public class FieldTrip {
    public static void main(String[] args) {

        int gradeLevel = 5;  // input.nextInt();
        String location = ""; // empty string
        int numOfGroups = 0;
        String teacher = "";

        if (gradeLevel >= 1 && gradeLevel <= 6) {
            if (gradeLevel == 1) {
                location = "Apple orchard";
                numOfGroups = 2;
                teacher = "Ms. Smith";

            } else if (gradeLevel == 2) {
                location = "Zoo";
                numOfGroups = 3;
                teacher = "Ms. Tom";

            } else if (gradeLevel == 3) {
                location = "Aquarium";
                numOfGroups = 4;
                teacher = "Ms. Jerry";

            } else if (gradeLevel == 4) {
                location = "Movie";
                numOfGroups = 2;
                teacher = "Ms. VinniePu";

            } else if (gradeLevel == 5) {
                location = "Museum";
                numOfGroups = 3;
                teacher = "Ms. Carl";

            } else { // gradeLevel = 6;
                location = "Loopcamp";
                numOfGroups = 3;
                teacher = "Ms. Academy";
            }

            System.out.println("Field trip information for grade " + gradeLevel);
            System.out.println("\tLocation: " + location);
            System.out.println("\tNumber of groups: " + numOfGroups);
            System.out.println("\tTeacher in charge: " + teacher);
        } else {
            System.out.println("Grade must be between 1-6");
        }
    }
}