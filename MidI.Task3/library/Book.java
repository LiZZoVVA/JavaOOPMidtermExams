package library;

import java.util.Objects;

class Book {
    private final String title;
    private final String author;

    // Constructor
    public Book(String title, String author) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        this.title = title.trim();
        this.author = author.trim();
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Proper equals and hashCode methods for correct book comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equalsIgnoreCase(book.title) && 
               author.equalsIgnoreCase(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase(), author.toLowerCase());
    }

    // Method to display book information
    @Override
    public String toString() {
        return String.format("\"%s\" by %s", title, author);
    }
}