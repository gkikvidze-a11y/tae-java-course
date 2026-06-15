package homework8;

public class AgeValidator {
    public static void validate(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("ასაკი არ არის ვალიდური: " + age);
        }
        System.out.println("ასაკი ვალიდურია: " + age);
    }

    public static void main(String[] args) {
        int[] testAges = {25, -5, 200};

        for (int age : testAges) {
            try {
                validate(age);
            } catch (InvalidAgeException e) {
                System.out.println("დაიჭირა Custom Exception: " + e.getMessage());
            }
        }
    }
}