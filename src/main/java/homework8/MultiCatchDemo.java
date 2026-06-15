package homework8;

public class MultiCatchDemo {
    public static void processInput(String input) {
        try {
            int result = Integer.parseInt(input);
            int[] arr = {10, 20};
            int division = arr[result] / result;
            System.out.println("შედეგი: " + division);
        } catch (NumberFormatException e) {
            System.out.println("დაფიქსირდა NumberFormatException: შეყვანილი ტექსტი არ არის რიცხვი!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("დაფიქსირდა ArrayIndexOutOfBoundsException: ინდექსი გასცდა მასივის საზღვრებს!");
        } catch (ArithmeticException e) {
            System.out.println("დაფიქსირდა ArithmeticException: ნულზე გაყოფა შეუძლებელია!");
        }
    }

    public static void main(String[] args) {
        processInput("abc");
        processInput("0");
        processInput("99");
    }
}