package day34_b_encapsulation.traffic;
public class Road {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("green");
        //light.color = "red";
        // Since my instance variable is PRIVATE, I do NOT have direct access to it outside the class.

        // How can I give INDIRECT ACCESS to RED?
        System.out.println(light.getColor());

        TrafficLight light2 = new TrafficLight("yellow");
        System.out.println(light2.getColor());

        System.out.println();

        // Can you change and reassign the color for the objects?
        light.setColor("red");

        // Since we have some condition in setColor() method, this will not get assigned to a color instance variable fo light object
        light2.setColor("pink");

        System.out.println();
        System.out.println(light.getColor());
        System.out.println(light2.getColor());

    }
}