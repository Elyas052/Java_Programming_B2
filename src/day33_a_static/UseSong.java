package day33_a_static;

class UseSong {
    public static void main(String[] args) {

        // Call 1st Constructor.
        Song s1 = new Song("Waka Waka");
        System.out.println(s1);

        // Call 2nd Constructor.
        Song s2 = new Song("Waka Waka", 3.5);
        System.out.println(s2);

        // Call 3rd Constructor.
        Song s3 = new Song("Waka Waka", 3.5, "Shakira");
        System.out.println(s3);

        // Call 4th Constructor.
        Song s4 = new Song("Waka Waka", 3.5, "Shakira", "Pop");
        System.out.println(s4);
    }
}