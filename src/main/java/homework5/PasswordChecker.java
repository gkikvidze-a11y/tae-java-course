package homework5;

public class PasswordChecker {
    public static boolean isStrong(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpper = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigit = true;
             }
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }

        }
        return hasDigit && hasUpper;
    }

    public static void main (String[] args){
        System.out.println("jandaba? " + isStrong("jandaba"));
    }
}

