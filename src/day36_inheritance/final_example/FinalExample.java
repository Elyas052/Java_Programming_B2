package day36_inheritance.final_example;

public final class FinalExample {

    final int a = 5;

    //final int b;
    // Whenever it is final, we must give the value to it
    int b;

    public static final String PLANET = "Earth"; // CONSTANT VARIABLES

    public FinalExample() {
    }

    // If we did not have the constructor above, we do NOT have to five the value directly to the final variable.

    public FinalExample(int b) {
        this.b = b;
    }
}