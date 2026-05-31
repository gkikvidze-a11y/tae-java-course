package homework4;

public class GradeCalculator {
    public static void main(String args[]) {
        int birthMonth = 3;
        String grade = "";

        if (birthMonth == 12) {
            grade = "A";
        } else if (birthMonth >=9 && birthMonth <= 11) {
            grade = "B";
        } else if (birthMonth >=6 && birthMonth <= 8) {
            grade = "C";
        } else if (birthMonth >=3 && birthMonth <= 5) {
            grade = "D";
        } else if (birthMonth >=1 && birthMonth <= 2) {
            grade = "F";

        }
        System.out.println("შეფასება: " + grade);

    }
}
