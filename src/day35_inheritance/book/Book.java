package day35_inheritance.book;

public class Book {

    String title;
    String genre;
    int chapters;
    double price;
    boolean hasMovie;
    Author author;
    // I have an object reference as instance variable
    // When I call this instance variable to assign a value,
    // since its data type is Author class, I need to assign an object to it.
}