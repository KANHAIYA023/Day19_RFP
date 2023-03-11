package Com.Day19_RFP;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UC1 {
    static Scanner scanner = new Scanner(System.in);
    public static void validFirstName() {

        System.out.println("Enter First Name:");
        String fName = scanner.next();
        String regex = "^[A-Z]{1}[a-z]*";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(fName);
        boolean r0 = match.matches();

        if (r0)
            System.out.println("valid first name: ");
        else
            System.out.println("invalid first name: ");

    }
}
