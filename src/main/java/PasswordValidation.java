import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidation {

    public Scanner scanner = new Scanner(System.in);

    private String password = scanner.nextLine();

    //copied regex and removed the following modules (?=.*[A-Z])(?=\S+$) because the condition doesn't require uppercase and blank spaces.
    static String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=]).{8,}$";

    public PasswordValidation(){
    }

    public void validatePassword(){
        if(password.matches(regex)){
            System.out.println("The password is valid.");
        }else {
            System.out.println("The password is not valid.");
        }
    }
}
