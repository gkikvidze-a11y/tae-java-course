ppackage homework10;

import java.util.Comparator;
import java.util.function.Predicate;

public class LambdaBasics {
    public static void main(String[] args) {
        // 1. Runnable Lambda
        Runnable r = () -> System.out.println("Hello Lambda");
        r.run();

        // 2. Predicate Lambda
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 6 even? " + isEven.test(6));
        System.out.println("Is 5 even? " + isEven.test(5));

        // 3. Comparator Lambda
        Comparator<String> byLength = (a, b) -> Integer.compare(a.length(), b.length());
        System.out.println("Comparing 'apple' and 'banana' by length: " + byLength.compare("apple", "banana"));
    }
}