package homework10;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCounterStream {
    public static void main(String[] args) {
        String text = "java git java oop java git python";
        String[] words = text.split(" ");

        Map<String, Long> counts = Arrays.stream(words)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println(counts);
    }
}