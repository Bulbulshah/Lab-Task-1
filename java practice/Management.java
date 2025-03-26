import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false; // Initialize book as not issued
    }

    public void issueBook() {
        if (!isIssued) {
            System.out.println("Book \"" + title + "\" has been issued.");
            isIssued = true;
        } else {
            System.out.println("Book \"" + title + "\" is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            System.out.println("Book \"" + title + "\" has been returned.");
            isIssued = false;
        } else {
            System.out.println("Book \"" + title + "\" was not issued.");
        }
    }

    public void showStatus() {
        if (isIssued) {
            System.out.println("Book \"" + title + "\" is currently issued.");
        } else {
            System.out.println("Book \"" + title + "\" is available for issue.");
        }
    }
}

public class Management {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String bookTitle = scan.nextLine();
        System.out.print("Enter Author Name: ");
        String bookAuthor = scan.nextLine();

        Book bookInfo = new Book(bookTitle, bookAuthor);
        int choice;

        do {
            System.out.println("\nChoose an option (1-4):");
            System.out.println("1. Issue Book");
            System.out.println("2. Return Book");
            System.out.println("3. Show Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    bookInfo.issueBook();
                    break;
                case 2:
                    bookInfo.returnBook();
                    break;
                case 3:
                    bookInfo.showStatus();
                    break;
                case 4:
                    System.out.println("Exiting Program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        scan.close(); // Close scanner to prevent memory leak
    }
}
