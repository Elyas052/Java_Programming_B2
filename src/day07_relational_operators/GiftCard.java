package day07_relational_operators;

public class GiftCard {
    public static void main(String[] args) {

        double giftCardBalance = 200;
        double secondItem = 50;
        System.out.println("Buy item 1 for $100");
        giftCardBalance -= 100;
        System.out.println("Buy item 2 for $" + secondItem);
        giftCardBalance -= secondItem; // giftCardBalance = giftCardBalance - secondItem;

        System.out.println("Your gift card balance is now: " + giftCardBalance);

    }
}
