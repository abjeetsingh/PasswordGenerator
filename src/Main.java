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

    public static String generatePassword(int length, int complexity) {
        Random rand = new Random();
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_+-=";

        String characters = lowercase;
        if (complexity >= 2) {
            characters += uppercase;
        }
        if (complexity >= 3) {
            characters += numbers + symbols;
        }

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

}