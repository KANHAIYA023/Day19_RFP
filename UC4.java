package Com.Day19_RFP;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UC4 {
    static Scanner scanner = new Scanner(System.in);
    public static void validMobileNumber() {

        System.out.print("Enter your Mobile Number : ");
        String phoneNo = scanner.nextLine();
        String regex = "(91|0)?\\s?[6-9][0-9]{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(phoneNo);
        boolean r0 = match.matches();
        if (r0)
            System.out.println("valid phone number");
        else
            System.out.println("invalid phone number");
    }
}
