package day08_scanner_logical_operators;

public class OperatorPractice {
    public static void main(String[] args) {

        int w = 78 / 2 * 2 + 3 - 5 % 5; // 81
        // 78 / 2 = 39 * 2 = 78
        // 5 % 5 = 0
        // 78 + 3 = 81 - 0 = 81

        System.out.println(w + "\n");

        int a = 8;
        int b = a--;
        System.out.println(a);
        System.out.println(b + "\n");

        int l = 50;  // 49, 50, 49, 50
        int p = --l + l++ + l-- + l++;
        //       49 + 49  + 50  + 49 ==== > 197
        System.out.println(l); //50
        System.out.println(p + "\n"); //197

        int r = 20; // 19, 20, 19, 18
        int k = -r-- + r++ + --r * r-- % 2;
        /*      -20  + 19  + 19  * 19  % 2
                -20  + 19  +    361    % 2
                -20  + 19  +       1
                    -1     +       1
                           0
         */
        System.out.println(r);
        System.out.println(k);
    }
}
