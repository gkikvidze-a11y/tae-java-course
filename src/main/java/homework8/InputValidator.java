package homework8;

public class InputValidator {
    public static int processAge(String input) throws NumberFormatException, IllegalArgumentException {
        int age = Integer.parseInt(input);

        if (age < 0) {
            throw new IllegalArgumentException("ასაკი არ შეიძლება იყოს უარყოფითი!");
        }

        return age * 12; // აბრუნებს თვეების რაოდენობას
    }

    public static void main(String[] args) {
        String[] inputs = {"20", "-5", "not_a_number"};

        for (String input : inputs) {
            try {
                int months = processAge(input);
                System.out.println("შეტანილი: " + input + " -> ასაკი თვეებში: " + months);
            } catch (NumberFormatException e) {
                System.out.println("დაიჭირა NumberFormatException ტექსტზე: " + input);
            } catch (IllegalArgumentException e) {
                System.out.println("დაიჭირა IllegalArgumentException: " + e.getMessage());
            }
        }
    }
}