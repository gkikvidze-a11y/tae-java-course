package homework5;

public class MultiplicationTable {
    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
    public static void main(String[] args) {
        int birthMonth = 3;
        System.out.println("გaმრავლება დაბდების თვეზე " + birthMonth + ": ");
        printTable(birthMonth);


    }

}
