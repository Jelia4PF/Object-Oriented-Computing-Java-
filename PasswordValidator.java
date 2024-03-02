import java.util.Scanner; // Import the Scanner class

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        
        System.out.println("Enter your password: ");
        String password = scanner.nextLine(); // Read user input
        
        if (validatePassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
        
        scanner.close(); // Close the scanner
    }
    
    public static boolean validatePassword(String password) {
        // Check password length
        if (password.length() < 8 || password.length() > 16) {
            return false;
        }
        
        // Initialize counters for each category
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int numberCount = 0;
        int specialCharCount = 0;
        
        // Define special characters string
        String specialCharacters = "~!@#$%^&*()-=+_";
        
        // Iterate through each character of the password
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            
    
            if (Character.isLowerCase(ch)) {
                lowerCaseCount = 1;
            } else if (Character.isUpperCase(ch)) {
                upperCaseCount = 1;
            } else if (Character.isDigit(ch)) {
                numberCount = 1;
            } else if (specialCharacters.indexOf(ch) >= 0) {
                specialCharCount = 1;
            }
        }
        
        
        if (lowerCaseCount + upperCaseCount + numberCount + specialCharCount >= 3) {
            return true;
        } else {
            return false;
        }
    }
}
