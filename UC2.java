package Com.Day19_RFP;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UC2 {
    static Scanner scanner = new Scanner(System.in);
    public static void validLastName()
    {

        System.out.println("enter the last name:");
        String lName = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(lName);
        boolean r0 = match.matches();
        if (r0)
            System.out.println("valid last name:");
        else
            System.out.println("invalid last name:");

    }
}
