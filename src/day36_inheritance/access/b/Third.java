package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

//DIFFERENT class, DIFFERENT package.
public class Third {
    public static void main(String[] args) {

        First obj = new First();

        System.out.println(obj.one);
        //System.out.println(obj.two);
        //System.out.println(obj.three);
        //System.out.println(obj.four);

        // Four is not accessible because it is private (visible SAME CLASS).
        // Three is not accessible because it is defaulted (visible same PACKAGE).
        // Two is not accessible because it is protected - (visible in different package if there is INHERITANCE relation).
    }
}