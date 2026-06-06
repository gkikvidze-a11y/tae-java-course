package homework5;

public class GradeCalculator {
    public static String getGrade(int score){
        if(score < 0 || score >100){
            return "Invalid";
        } else if (score>=90) {
            return "A";
        } else if (score>=80) {
            return "B";
        } else if (score>=70) {
            return "C";
        }else if (score>=60) {
            return "D";
        }else {
            return "F";
        }
    }
    public static void main(String[] args) {
        System.out.println(getGrade(100));
        System.out.println(getGrade(95));
        System.out.println(getGrade(85));
        System.out.println(getGrade(80));
        System.out.println(getGrade(70));
        System.out.println(getGrade(60));
        System.out.println(getGrade(55));
        System.out.println(getGrade(101));
        System.out.println(getGrade(-1));

    }
}
