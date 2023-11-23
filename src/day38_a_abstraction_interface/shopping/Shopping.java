package day38_a_abstraction_interface.shopping;

// Abstract class - cannot instantiate
// Can have an abstract method
// Cant have all the other instance and static members.
// Can have constructor
public abstract class Shopping {

    public double price;

    public abstract void buyItem();

    public abstract void returnItem();
}