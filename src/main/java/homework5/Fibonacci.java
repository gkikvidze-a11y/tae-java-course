package homework5;

public class Fibonacci {
    public static long fib(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        long number2=0;
        long number1=1;
        long number3=0;
        for (int i = 2; i <= n; i++) {
            number3 = number1 + number2;
            number2 = number1;
            number1 = number3;

        }
        return number3;
    }
    public static void main(String[] args) {
        int age =37;
        System.out.println("ფიბონაჩის რიცხვი " + age + " წლის ასაკისთვის არის: " + fib(age));
    }
}
