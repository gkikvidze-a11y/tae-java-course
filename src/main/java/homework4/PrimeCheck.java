package homework4;

import java.io.PrintStream;

public class PrimeCheck {
    public static void main(String[] args) {
        int age = 37;
        boolean prime = true;

        for (int i = 2; i < age; i++) {
            if (age % 2 == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println(age + " არის მარტივი რიცხვი. ");
        } else {
            System.out.println( age + " არ არის მარტივი რიცხვი");
        }





    }
}
