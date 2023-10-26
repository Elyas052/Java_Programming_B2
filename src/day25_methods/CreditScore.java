package day25_methods;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore(); // The value is not being used.
        int score = getCreditScore();  // The value is being stored into score variable
        System.out.println(score); // Score variable is being used in a print statement.
        System.out.println(getCreditScore());
        System.out.println(getCreditScore() + 50);

        System.out.println("--------------------");

        System.out.println(isGoodCreditScore(600));
        System.out.println(isGoodCreditScore(720));

        System.out.println("---------------------");

        System.out.println(isGoodCreditScore(getCreditScore()));

        System.out.println("----------------------");

        System.out.println(isGoodCreditScore(500) ? "Is GOOD score" : "Is NOT GOOD score");

    }

    public static int getCreditScore() {  // Non-parameterized return type method
        return 800;
    }

    // Create a method to check if it is a good or not.
    // Good if bigger or equal 700.
    // Not good at least.
    public static boolean isGoodCreditScore(int score) {

        if (score >= 700) {
            return true;
        } else {
            return false;
        }

        // This is doing the same as above.
        // Return score >= 700;

        //System.out.println("hello");  // This line will never be reached in this specific code.
    }
}
