package homework10;

import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Beka", "Cita");

        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(uppercaseNames);
        System.out.println(nameLengths);
    }
}