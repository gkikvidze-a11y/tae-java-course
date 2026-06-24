package homework10;

import java.util.List;
import java.util.Optional;

public class ReduceSum {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        Optional<Integer> max = numbers.stream()
                .reduce(Integer::max);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Max: " + max.orElse(0)); // 5
    }
}