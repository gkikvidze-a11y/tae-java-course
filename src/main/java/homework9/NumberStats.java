package homework9;

import java.util.ArrayList;
import java.util.List;

public class NumberStats {

    // მაქსიმალურის პოვნა
    public static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int num : list) { // [cite: 41]
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // მინიმალურის პოვნა
    public static int findMin(List<Integer> list) {
        int min = list.get(0);
        for (int num : list) { // [cite: 41]
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // საშუალოს გამოთვლა
    public static double average(List<Integer> list) {
        double sum = 0;
        for (int num : list) { // [cite: 41]
            sum += num;
        }
        return sum / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // შექმენი ArrayList 5 რიცხვით [cite: 42]
        numbers.add(10);
        numbers.add(25);
        numbers.add(4);
        numbers.add(18);
        numbers.add(33);

        // გამოიძახე სამივე მეთოდი და დაბეჭდე
        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + findMin(numbers));
        System.out.println("Average: " + average(numbers));
    }
}