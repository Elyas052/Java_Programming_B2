package day07_relational_operators;

public class Pizza {

    public static void main(String[] args) {

        String typeOfPizza = "Cheese";
        int numOfSlices = 18;
        int numOfPeople = 4;

        int slicesPerPerson = numOfSlices / numOfPeople;  // 10 / 4 ---  > 2
        int slicesLeftOver = numOfSlices % numOfPeople;  // 10 % 4 ---- > 2

        String report = "\nWe ordered " + typeOfPizza + " pizza with the " + numOfSlices + " slices.\n" + numOfPeople + " people ate " + slicesPerPerson + " for each. There were " + slicesLeftOver + " slices left";

        System.out.println(report);

    }
}
