package homework5;

public class VowelCounter {
    public static int countVowels(String s){
        int count = 0;
        for(int i=0;i<s.length();i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            switch (ch) {
                case 'ა':
                case 'ე':
                case 'ი':
                case 'ო':
                case 'უ':
                    count++;
                    break;
                default:
                    break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String fullName= "გვანცა კიკვიძე";
        System.out.println("ხმოვნების რაოდენობა სახელსა და გვარში ' " + fullName + " ' : " + countVowels(fullName));
    }
}
