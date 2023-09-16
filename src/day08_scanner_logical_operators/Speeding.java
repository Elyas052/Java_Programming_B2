package day08_scanner_logical_operators;

public class Speeding {
    public static void main(String[] args) {

        int currentSpeed = 58;
        int speedLimit = 55;

        boolean isSpeeding = currentSpeed > speedLimit;

        System.out.println("\nAre you speeding: " + isSpeeding);
    }
}
