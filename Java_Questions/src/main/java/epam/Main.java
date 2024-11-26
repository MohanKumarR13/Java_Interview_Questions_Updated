package epam;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    // HashSet to store already entered usernames and prevent duplicates
    static HashSet<String> usernames = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for user input
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Validate the username
        if (isValidUsername(username)) {
            if (usernames.contains(username)) {
                System.out.println("Invalid: Username is already taken.");
            } else {
                // Add the username to the HashSet and mark as valid
                usernames.add(username);
                System.out.println("Valid: Username has been registered.");
            }
        } else {
            System.out.println("Invalid: Username contains special characters, spaces, or is not alphanumeric.");
        }

        scanner.close();
    }

    // Method to check if the username is alphanumeric and does not contain spaces or special characters
    public static boolean isValidUsername(String username) {
        // Check if the username contains only letters and digits
        return username.matches("[a-zA-Z0-9]+");
    }
}
