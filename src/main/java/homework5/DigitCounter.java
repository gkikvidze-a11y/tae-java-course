package homework5;

public class DigitCounter {
    public static int countDigits(int n) {
        int math = Math.abs(n);
        if (math == 0){
            return 1;
        }
        int count = 0;
        while (math > 0){
            count++;
            math /= 10;
        }
        return count;


    }
    public static void main(String[] args) {
        int birthYear = 1989;
        System.out.println("დაბადების წელში ციფრების რაოდენობა (" +birthYear+ "): "+ countDigits(birthYear));
        System.out.println("ციფრების რაოდენობა -135: " + countDigits(135));
        System.out.println("ციფრების რაოდენობa 0: " + countDigits(0));
    }

}
