import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Add a member
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    // Borrow a book
    public void borrowBook(int bookId) {
        Book book = findBookById(bookId);
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    // Return a book
    public void returnBook(int bookId) {
        Book book = findBookById(bookId);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    // Find book by ID
    private Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    // List all books
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    // List all members
    public void listMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
        } else {
            for (Member m : members) {
                System.out.println(m);
            }
        }
    }
}