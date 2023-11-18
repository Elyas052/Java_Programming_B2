package day36_inheritance.app;

// It is a RUNNER class meaning I am running my code from this class.
public class AppStore {

    public static void main(String[] args) {

        Instagram objIns = new Instagram(4.0);
        objIns.download();
        objIns.follow();

        System.out.println();

        YouTube objYou = new YouTube(3.4);
        objYou.download();
        objYou.subscribe();
    }
}