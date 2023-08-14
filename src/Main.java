import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the password: ");
        int length = input.nextInt();

        System.out.print("Enter the complexity of the password (1-3): ");
        int complexity = input.nextInt();

        String password = generatePassword(length, complexity);
        System.out.println("Your password is: " + password);
    }
}