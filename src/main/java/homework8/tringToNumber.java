package homework8;
public class tringToNumber {
    public static int parseSafe(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("არ არის რიცხვი: " + s);
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("ვალიდური სტრიქონი: " + parseSafe("42"));
        System.out.println("ტექსტური სტრიქონი: " + parseSafe("abc"));
        System.out.println("ცარიელი სტრიქონი: " + parseSafe(""));
    }
}