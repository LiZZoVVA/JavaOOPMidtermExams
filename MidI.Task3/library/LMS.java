package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class LMS {
    private final List<Book> storage;

    // Constructor
    public LMS() {
        this.storage = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        Objects.requireNonNull(book, "Book cannot be null");
        if (!storage.contains(book)) {
            storage.add(book);
            System.out.println("Added: " + book);
        } else {
            System.out.println("Book already exists: " + book);
        }
    }

    // Method to remove a book from the library
    public boolean removeBook(Book book) {
        Objects.requireNonNull(book, "Book cannot be null");
        boolean removed = storage.remove(book);
        if (removed) {
            System.out.println("Removed: " + book);
        } else {
            System.out.println("Book not found: " + book);
        }
        return removed;
    }

    // Method to print all books in the library
    public void printStorage() {
        System.out.println("\nLibrary Inventory");
        System.out.println("=================");
        
        if (storage.isEmpty()) {
            System.out.println("The library is currently empty.");
        } else {
            for (int i = 0; i < storage.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, storage.get(i));
            }
        }
        
        System.out.println("=================");
        System.out.printf("Total books: %d%n%n", storage.size());
    }
}