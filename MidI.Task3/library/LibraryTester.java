package library;

public class LibraryTester {
    public static void main(String[] args) {
        // Create Library instance
        LMS library = new LMS();

        // Test empty Library
        library.printStorage();

        // Add some books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("1984", "George Orwell"));
        
        // Try to add duplicate
        library.addBook(new Book("1984", "George Orwell"));
        
        // Print Library contents
        library.printStorage();
        
        // Remove a book
        Book toRemove = new Book("1984", "George Orwell");
        library.removeBook(toRemove);
        
        // Try to remove non-existent book
        library.removeBook(new Book("Unknown", "Anonymous"));
        
        // Print updated Library contents
        library.printStorage();
    }
}