package my_utilities;

import day33_b_encapsulation.access_modifiers.AccessModifier;

public class AccessOutsidePackage {

    /**
     * In the DIFFERENT PACKAGE and In the DIFFERENT CLASS
     */

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);  // CAN ACCESS
        //System.out.println(obj.b);  // CANNOT  ACCESS
        //System.out.println(obj.c);  // CANNOT ACCESS

        System.out.println(AccessModifier.x); // CAN ACCESS
        //System.out.println(AccessModifier.y); // CANNOT ACCESS
        //System.out.println(AccessModifier.z); // CANNOT ACCESS

        /**
         * 'c' and 'z' are NOT ACCESSIBLE outside the class.
         * Because they have PRIVATE modifiers
         *
         *
         * 'b' and 'y' are NOT ACCESSIBLE outside the package
         * Because they have DEFAULT modifiers
         */
    }
}