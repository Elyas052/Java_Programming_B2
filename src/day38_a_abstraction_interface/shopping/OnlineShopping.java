package day38_a_abstraction_interface.shopping;

public abstract class OnlineShopping extends Shopping implements Shipping {

    public abstract void viewCart();
}

// If I have a child class which is CONCRETE, how many methods it has to implement