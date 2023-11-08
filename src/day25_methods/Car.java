package day25_methods;

public class Car {

    // Create a method then unlocks the door.
    public static void unlockCar() {  // non-parameterized void method - > meaning nothing inside parenthesis
        System.out.println("Unlocking the car.");
    }

    public static void openDoor() {
        System.out.println("Opening the door");
    }

    public static void sitInCar() {
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }

    public static void getReadyToGo() {
        System.out.println("Putting on seatbelt");
        System.out.println("Check the mirrors");
        System.out.println("Put music on");
        System.out.println("Put the navigation on");
    }

    public static void driveAndGo() {
        System.out.println("Put into drive mode");
        System.out.println("And go.....");
    }

    public static void startCar() {
        System.out.println("Starting the car");
    }

    // I am in a hurry. So, we need to do only a few methods.
    public static void driveInRush() {
        unlockCar(); // Calling a method. - This is not a method declaration.
        sitInCar();
        startCar();
        driveAndGo();
    }

    public static void main(String[] args) {

        unlockCar();  // Calling a method --> This is not a method declaration.
        openDoor();
        sitInCar();
        startCar();
        getReadyToGo();
        driveAndGo();

        System.out.println();
        driveInRush();
        driveInRush();

    }
}
