package day36_inheritance.access.a;

// DIFFERENT class but the SAME package.
public class Second {
    public static void main(String[] args) {

        First obj = new First();

        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
        //System.out.println(obj.four);
        // Four is not accessible because it is private.
        // Private make is visible ONLY in the SAME CLASS.

        // This is just a separate class that does not have any instance variables.
//        Second sec = new Second();
//
//        System.out.println(sec.one);
//        System.out.println(sec.two);
//        System.out.println(sec.three);
//        System.out.println(sec.four);
    }
}