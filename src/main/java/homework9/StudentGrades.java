package homework9;

import java.util.ArrayList;
import java.util.Arrays; // დაემატა Arrays-ის იმპორტი
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGrades {

    // მეთოდი ცალკეული სტუდენტის საშუალო ქულის გამოსათვლელად
    public static double averageFor(Map<String, List<Integer>> gradesMap, String name) {
        if (!gradesMap.containsKey(name)) {
            return 0.0;
        }
        List<Integer> grades = gradesMap.get(name);
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        // შექმენი HashMap<String, List<Integer>>
        Map<String, List<Integer>> studentGrades = new HashMap<>();

        // დაამატე 3 სტუდენტი თითო 4 ქულით (გასწორებული Arrays.asList-ით)
        List<Integer> annaGrades = new ArrayList<>(Arrays.asList(85, 92, 78, 90));
        List<Integer> bekaGrades = new ArrayList<>(Arrays.asList(70, 65, 80, 75));
        List<Integer> cikaGrades = new ArrayList<>(Arrays.asList(95, 98, 92, 100));

        studentGrades.put("Anna", annaGrades);
        studentGrades.put("Beka", bekaGrades);
        studentGrades.put("Cika", cikaGrades);

        // დაბეჭდე ყველა სტუდენტი + მათი საშუალო
        for (String student : studentGrades.keySet()) {
            List<Integer> grades = studentGrades.get(student);
            double avg = averageFor(studentGrades, student);
            System.out.println(student + ": " + grades + " avg = " + avg); // [cite: 75]
        }
    }
}