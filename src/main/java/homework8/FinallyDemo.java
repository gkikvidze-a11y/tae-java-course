package homework8;

public class FinallyDemo {
    public static int readNumber(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("შეცდომა: ფორმატი არასწორია.");
            return -1;
        } finally {
            System.out.println("დასრულდა readNumber");
        }
    }

    public static void main(String[] args) {
        System.out.println("ტესტი 1:");
        System.out.println("დაბრუნებული მნიშვნელობა: " + readNumber("100"));

        System.out.println("\nტესტი 2:");
        System.out.println("დაბრუნებული მნიშვნელობა: " + readNumber("xyz"));
    }
}