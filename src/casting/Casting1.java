package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = (long) intValue; //int -> long
        System.out.println("longValue = " + longValue); //가능

        doubleValue = (double) intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue); //가능

        doubleValue = 20L; //long -> double
        System.out.println("doubleValue2 = " + doubleValue); //가능
    }
}
