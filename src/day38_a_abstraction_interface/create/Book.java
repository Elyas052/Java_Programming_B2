package day38_a_abstraction_interface.create;

public class Book implements Create {

    @Override
    public void read() {
        System.out.println("Reading a Book");
    }

    @Override
    public void write() {
        System.out.println("Writing a Book");
    }
}