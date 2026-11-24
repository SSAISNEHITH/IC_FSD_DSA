class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title) {
        this(bookId, title, "Unknown Author");
    }

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author);
    }
}

public class d2t32 {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Clean Code");
        Book b2 = new Book(102, "Effective Java", "Joshua Bloch");

        b1.displayBook();
        b2.displayBook();
    }
}