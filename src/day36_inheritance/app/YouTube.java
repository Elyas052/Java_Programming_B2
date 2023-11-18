package day36_inheritance.app;

public class YouTube extends App {

    public YouTube(double version) {
        super("YouTube", version);
    }

    public void subscribe() {
        System.out.println("Subscribed to Youtube channel");
    }
}