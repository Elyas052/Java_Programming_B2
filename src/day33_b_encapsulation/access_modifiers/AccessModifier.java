package day33_b_encapsulation.access_modifiers;

public class AccessModifier {

    // Public access modifier
    public int a;

    // Default access modifier
    int b;

    // Private access modifiers
    private int c;

    public static int x;
    static int y;
    private static int z;

    /**
     * In the SAME CLASS.
     */

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);  // CAN ACCESS
        System.out.println(obj.b);  // CAN ACCESS
        System.out.println(obj.c);  // CAN ACCESS

        System.out.println(AccessModifier.x); // CAN ACCESS
        System.out.println(AccessModifier.y); // CAN ACCESS
        System.out.println(AccessModifier.z); // CAN ACCESS

        /**
         * All are accessible in the SAME class.
         */
    }
}