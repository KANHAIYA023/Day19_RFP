package Com.Day19_RFP;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UC3 {
    static Scanner scanner = new Scanner(System.in);
    public static void validEmail() {
        System.out.println("Enter E-mail:");
        String email = scanner.next();
        String regex = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(email);
        boolean r0 = match.matches();
        if (r0)
            System.out.println("valid email address");
        else
            System.out.println("email address is invalid");
    }
}
