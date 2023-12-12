package day45_a_stream.functions;

public class CallPredicateMethods {
    public static void main(String[] args) {

        boolean result = UsePredicate.isPalindrome.test("anna");
        System.out.println(result);
        System.out.println(  UsePredicate.isPalindrome.test("hello")   );

        System.out.println();
        System.out.println(UsePredicate.isPrime.test(5));
        System.out.println(UsePredicate.isPrime.test(6));



    }
}