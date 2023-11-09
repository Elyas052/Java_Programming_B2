package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {
        ArrayList <String> drinks = new ArrayList<>();
        System.out.println(drinks.size());

        // We just called this method from different class but in the same package. So, no need to import the package.
        //ShoppingList.showListItems(drinks);

        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("energy drink");
        drinks.add("soda");
        System.out.println(drinks);

        ArrayList <String> drinks2 = new ArrayList<>(drinks);
        System.out.println(drinks2);

        String [] allDrinks = {"cola", "monster", "red bull", "sarikiz"};
        // This is NOT OK. Because an array is not a VALID argument.
        //ArrayList <String> drinks4 = new ArrayList<>( allDrinks );

        // Here is OK. We converted Array into ArrayList - which Collection data type.
        ArrayList <String> drinks3 = new ArrayList<>( Arrays.asList(allDrinks) );
        System.out.println(drinks3);

        ArrayList <String> drinks5 = new ArrayList<>( Arrays.asList( "Water", "Dovga", "Ayran" ));
        System.out.println(drinks5);

        drinks.addAll(Arrays.asList("Water", "Su", "Voda"));
        System.out.println(drinks);

        drinks.addAll(0, Arrays.asList("Virgin Drink", "Fanta", "Sprite"));
        System.out.println(drinks);

        ShoppingList.showListItems(drinks);
        ShoppingList.removeItem(drinks, 0);
        System.out.println(drinks);
    }
}
