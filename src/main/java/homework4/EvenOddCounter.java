package homework4;

public class EvenOddCounter {
    public static void main(String[] args) {
        int birthyear = 1989;
        int lastTwoDigits = 89;
        int even = 0;
        int odd = 0;
        String evenNumber = "";
        String oddNumber = "";
        for (int i = 1; i <= lastTwoDigits; i++) {
            if (i % 2 == 0) {
                even ++;
                evenNumber += i + " ";
            }else  {
                odd++;
            oddNumber += i + " ";
            }
        }
        System.out.println("ლუწი: " + even + "; " + evenNumber);
        System.out.println("კენტი: " + odd + "; " +  oddNumber);
    }


}
