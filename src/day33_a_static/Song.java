package day33_a_static;

/**
 * Built a structure that I can make an object which will have 4 fields / instance variables.
 * -name, length, artist, genre
 * <p>
 * Make couple options for object creation.
 * -instantiating $name
 * -instantiating $name, $length
 * -instantiating $name, $length, artist
 * -instantiating $name, $length, artist, genre
 * <p>
 * Make it possible to see the object information.
 */

public class Song {

    // Instance variable
    String name;
    double length;
    String artist;
    String genre;

    // Create a Constructor with name parameters.
    public Song(String name) {

        // Object reference
        this.name = name;
    }

    // Create a Constructor with name and length parameters.
    public Song(String name, double length) {

        // Object reference
        // Call another Constructor in that class.
        this(name);
        this.length = length;
    }

    // Create a Constructor with name, length and artist parameters.
    public Song(String name, double length, String artist) {

        // Object reference
        // Call another Constructor in that class.
        this(name, length);
        this.artist = artist;
    }

    // Create a Constructor with name, length, artist and genre parameters.
    public Song(String name, double length, String artist, String genre) {

        // Object reference
        // Call another Constructor in that class.
        this(name, length, artist);
        this.genre = genre;
    }

    @Override
    // For print Object directly we crated toString.
    public String toString() {

        //String lengthResult = length != 0.0 ? length +"": "There is not length for this object";
        return "Song: " +
                "\n\tname: " + name +
                "\n\tlength: " + (length != 0.0 ? length : "There is not length for this object") +
                "\n\tartist: " + artist +
                "\n\tgenre: " + genre;
    }
}