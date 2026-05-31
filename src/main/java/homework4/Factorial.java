package homework4;

public class Factorial {
    public static void main(String[] args) {
        int birthMonth = 3;
        long factorial = 1;
        for (int i = 1; i <= birthMonth; i++) {
            factorial *= i;
        }
        System.out.println(birthMonth + "! = " + factorial);

    }
}
