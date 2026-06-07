package homework6;

public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double averageGrade() {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public String getStatus() {
        if (averageGrade() >= 60) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Student student = new Student("გიორგი", new int[]{85, 92, 78});
        System.out.println(student.getStatus());
    }
}