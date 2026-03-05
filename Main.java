import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. List Books");
            System.out.println("6. List Members");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(bookId, title, author));
                }

                case 2 -> {
                    System.out.print("Member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    library.addMember(new Member(memberId, name));
                }

                case 3 -> {
                    System.out.print("Enter Book ID to borrow: ");
                    library.borrowBook(scanner.nextInt());
                }

                case 4 -> {
                    System.out.print("Enter Book ID to return: ");
                    library.returnBook(scanner.nextInt());
                }

                case 5 -> library.listBooks();

                case 6 -> library.listMembers();

                case 7 -> {
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}