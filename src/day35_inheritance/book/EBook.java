package day35_inheritance.book;

// EBook IS-A Book
public class EBook extends Book {

    int pages;

    public void read() {
        System.out.println("Reading a digital copy of " + title + " which has " + pages + " pages.");
    }
}