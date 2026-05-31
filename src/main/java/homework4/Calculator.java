package homework4;

public class Calculator {
    public static void main(String[] args) {
        double a = 10;
        double b = 3;
        char operator = '-';//'+','/','*'


        switch (operator) {
            case '/':
                System.out.println(a/b);
                break;
            case '*':
                System.out.println("შედეგი: " + (a * b));
                break;
            case '+':
                System.out.println("შედეგი: " + (a + b));
                break;
            case '-':
                System.out.print("შედეგი: " + (a - b));
                break;

        }
    }
}
