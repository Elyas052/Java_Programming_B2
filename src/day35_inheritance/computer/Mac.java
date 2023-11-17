package day35_inheritance.computer;

public class Mac extends Computer {

    public Mac(int memory) {
        // super() - since there is no default constructor, I need to call the matching constructor from SUPER class
        super("macOS", memory);
    }
}