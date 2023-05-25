import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String phonePattern = "\\(\\d{2}\\)-\\(0\\d{9}\\)";
        Pattern pattern = Pattern.compile(phonePattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String phoneNumber1 = "(84)-(0978489648)";
        String phoneNumber2 = "(a8)-(22222222)";
        String phoneNumber3 = "(84)-(22b22222)";
        String phoneNumber4 = "(84)-(9978489648)";
        System.out.println(isValidPhoneNumber(phoneNumber1));
        System.out.println(isValidPhoneNumber(phoneNumber2));
        System.out.println(isValidPhoneNumber(phoneNumber3));
        System.out.println(isValidPhoneNumber(phoneNumber4));
    }
}