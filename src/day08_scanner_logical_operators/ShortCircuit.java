package day08_scanner_logical_operators;

public class ShortCircuit {
    public static void main(String[] args) {

        /*
               &&
               ------------------------
               True && True --- > True
               True && False -- > False
               False && True -- > False   --- >  if the first part is False, 2nd part I do not care
               False && False - > False   --- >  if the first part is False, 2nd part I do not care
        */

        int a1 = 10;
        System.out.println(false && (a1++ > 11));
        System.out.println(false & (a1++ > 11));

        /*
               ||
               ------------------------
               False || False --- > False
               False || True -- > True
               True || False -- > True --- > if the first part is True, 2nd part I do not care
               True || True - > True   --- > if the first part is True, 2nd part I do not care

               ****NOTE
               IF we want to still execute the 2nd EXPRESSION (2nd side), instead of &&, || --- >  we can use &, |
         */

        // System.out.println(5 / 0);

        System.out.println(true || 5 / 0 == 0);
        //System.out.println(true | 5/ 0 == 0); error

        System.out.println(false && 5 / 0 == 0);
        //System.out.println(false & 5/0 == 0); error

        int a = 0;
        System.out.println(false && a++ == 5);
        System.out.println(a);

        int b = 0;
        System.out.println(false & b++ == 5);
        System.out.println(b);

    }
}
