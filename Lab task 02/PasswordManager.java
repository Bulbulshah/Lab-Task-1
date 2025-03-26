import java.util.*;

class PM {
    private String password;
    
    PM(String password) {
        this.password = password;
    }
    
    void change(String old, String newpass) {
        if (old.equals(password)) {
            password = newpass;
            System.out.println("Password changed successfully");
        } else {
            System.out.println("Incorrect old password - password not changed");
        }
    }
    
    void validatePass(String input) {
        if (password.equals(input)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}

public class PasswordManager {
    public static void main(String[] args) {
        PM pm = new PM("123");
        Scanner scan = new Scanner(System.in);
        int choice;
        
        while (true) {  // Added loop to keep program running
            System.out.println("\nPassword Manager Menu:");
            System.out.println("1. Change Password");
            System.out.println("2. Validate Password");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            choice = scan.nextInt();
            scan.nextLine();  // Consume newline
            
            if (choice == 1) {
                System.out.print("Enter old password: ");
                String oldPass = scan.nextLine();
                System.out.print("Enter new password: ");
                String newPass = scan.nextLine();
                pm.change(oldPass, newPass);
                
            } else if (choice == 2) {
                System.out.print("Enter password to validate: ");
                String input = scan.nextLine();
                pm.validatePass(input);
                
            } else if (choice == 3) {
                System.out.println("Exiting program...");
                break;
                
            } else {
                System.out.println("Invalid choice! Please enter 1, 2, or 3");
            }
        }
        
        scan.close();
    }
}