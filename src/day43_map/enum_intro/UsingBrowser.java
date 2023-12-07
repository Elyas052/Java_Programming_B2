package day43_map.enum_intro;

public class UsingBrowser {

    public static void main(String[] args) {

        Browser browser = Browser.EDGE;

        switch (browser) {

            case EDGE:
                System.out.println("Opening EDGE");
                break;
            case CHROME:
            case SAFARI:
                System.out.println("Opening CHROME or SAFARI");
        }
    }
}