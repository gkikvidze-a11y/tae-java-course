package homework4;

public class nestedfor {
    public static void main(String[] args) {
       String name = "Gvantsa";
       int height = name.length();

       for (int i = 1; i <= height; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();

       }

    }
}
