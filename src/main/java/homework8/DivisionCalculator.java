package homework8;

public class DivisionCalculator {
    public static int safeDivide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("ნულზე გაყოფა");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("სტანდარტული გაყოფა (10 / 2): " + safeDivide(10, 2));
        System.out.println("ნულზე გაყოფა (5 / 0): " + safeDivide(5, 0));
    }
}