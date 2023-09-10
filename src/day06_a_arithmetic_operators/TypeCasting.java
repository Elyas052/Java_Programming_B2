package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 40;
        int i = b;  // the byte value is automatically CONVERTED to int, because byte is smalled than int
        // We are not changing the data type of b, we are changing the data type of the value we are assigning to i taking i from b

        System.out.println(b);
        System.out.println(i);

        int i2 = 100;
        byte b2 = (byte) i2;  // int is bigger than byte, so we MUST CAST it. We can the int type - i2 to a byte type using (byte)

        System.out.println(i2);
        System.out.println(b2);

        int i3 = 500;
        long l1 = i3;  // I am going from small --- > big. int is smaller than long, so it will AUTOMATICALLY CAST

        long l2 = 200;
        int i4 = (int) l2;

        System.out.println(l2);
        System.out.println(i4);

        double d = 50;  //System.out.println(d); // 50.0
        int i5 = (int) d;
        System.out.println(d);
        System.out.println(i5);

        double d2 = 40;
        byte b3 = (byte) d2;
        System.out.println(d2);
        System.out.println(b3);
        System.out.println();

        // With the numbers outside the range. DATA LOSS
        int i6 = 404;
        byte b4 = (byte) i6;
        System.out.println(i6);
        System.out.println(b4);

        System.out.println();
        double d3 = 45.56;
        int i7 = (int) d3;
        System.out.println(d3);
        System.out.println(i7);

        /*byte b = 40;
        int i = b; // the byte value is automatically converted to int, because byte is smaller than int

        int i2 = 100;
        byte b2 = (byte) i2; // int is bigger than byte, so we must cast. We cast the int type - i2 to a byte type using (byte)

        int i3 = 500;
        long l1 = i3; // int is smaller than long, so it will automatically cast

        long l2 = 200;
        int i4 = (int)l2; // im trying to go from long to int. long is bigger than int, so i must cast it

        long l3 = 10000000000000L;

        double d = 50;
        int i5 = (int)d; // trying to go from double type to int type. double is bigger, so i need to cast

        System.out.println(d);
        System.out.println(i5);

        double d2 = 40;
        byte b3 = (byte)d2;*/


    }
}
