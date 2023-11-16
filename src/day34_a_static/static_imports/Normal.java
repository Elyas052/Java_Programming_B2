package day34_a_static.static_imports;

// Imports entire StringUtil class from my util package.
import my_utilities.StringUtil;

// Imports entire Arrays class from java util package.
import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {

        int [] a = {2, 30, 5, 65, 7};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(StringUtil.reverse("java"));

        System.out.println(Math.PI);
    }
}