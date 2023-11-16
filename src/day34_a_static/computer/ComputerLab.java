package day34_a_static.computer;

public class ComputerLab {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Computer comp1 = new Computer("HP", 600.00, "Silver");
        Computer.hasBattery = false;
        System.out.println(Computer.hasBattery);

        System.out.println(comp1.brand);
        System.out.println(comp1.color);

        // NOT RECOMMENDED
        System.out.println(comp1.hasBattery);
        // We still can access the static members with the object reference bur it IS NOT RECOMMENDED.

        // CANNOT DO THIS
        //System.out.println(Computer.brand);
        // To access to INSTANCE VARIABLES, we HAVE TO crate an OBJECT of class.

    }
}
