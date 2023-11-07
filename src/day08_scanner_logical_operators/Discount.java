package day08_scanner_logical_operators;

public class Discount {
    public static void main(String[] args) {

        boolean isWeekend = false;
        boolean isTeacher = false;
        boolean isPoliceOfficer = true;
        boolean isFireFighter = false;

        boolean getDiscount = isWeekend &&
                (isTeacher || isPoliceOfficer || isFireFighter);

        System.out.println(getDiscount);

    }
}
