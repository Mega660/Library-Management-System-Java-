public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (!isAvailable) {
            System.out.println("Book is already borrowed!");
        } else {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author +
                ", Available: " + (isAvailable ? "Yes" : "No");
    }
}