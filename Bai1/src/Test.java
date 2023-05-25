import java.util.regex.Pattern;

public class Test {
    public static boolean isValidClassName(String className) {
        String regex = "^[CAP][0-9]{4}[GHIK]$";
        return Pattern.matches(regex, className);
    }

    public static void main(String[] args) {
        String className1 = "C0223G";
        String className2 = "A0323K";
        String className3 = "M0318G";
        String className4 = "P0323A";
        System.out.println(className1 + " is valid: " + isValidClassName(className1));
        System.out.println(className2 + " is valid: " + isValidClassName(className2));
        System.out.println(className3 + " is valid: " + isValidClassName(className3));
        System.out.println(className4 + " is valid: " + isValidClassName(className4));
    }
}
