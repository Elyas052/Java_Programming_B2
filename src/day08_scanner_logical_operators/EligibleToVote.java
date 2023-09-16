package day08_scanner_logical_operators;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "James Bond";
        boolean isCitizen = true;
        boolean hasCriminalBackground = true;
        int age = 49;

                                     // true && true && (!false -> true)
        boolean isEligibleToVote = age >= 18 && isCitizen && !hasCriminalBackground;
        System.out.println(name + " is eligible to vote: " + isEligibleToVote);

        // !true -> false
    }
}
