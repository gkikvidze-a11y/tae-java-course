package homework8;

public class NullCheck {
    public static int safeLength(String s) {
        try {
            return s.length();
        } catch (NullPointerException e) {
            System.out.println("null სტრიქონი");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("სტრიქონის სიგრძე: " + safeLength("Hello"));
        System.out.println("Null-ის შემთხვევა: " + safeLength(null));
    }
}