package homework5;

public class NumberClassifier {
    public static String classify(int n) {
        if (n > 0) return "Positive";
        if (n < 0) return "Negative";
        return "Zero";
    }
    public static String classify(double n) {
        String numberN = "";
        if (n > 0) {
            numberN = "Positive";
        } else if (n < 0) {
            numberN = "Negative";
        } else {
            numberN = "Zero";
        }
        if (n == Math.floor(n)) {
            String string = numberN + " მთელი რიცხვი";
            return string;

        } else {
            return numberN + " ათწილადი";
        }

    }
    public static void main(String[] args) {
        System.out.println(classify(-100));
        System.out.println(classify(7.7777));
        System.out.println(classify(8848));

    }
}