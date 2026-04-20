// IMPORT PACKAGES
package systemData;

import java.util.ArrayList;

// CREATE BOOK DATABASE
public class BookDatabase {

    public static boolean removeCopies(String code, int quantity) {
        for (Book book : books) {

        if (book.code.equalsIgnoreCase(code)) {

            // Check if enough copies exist
            if (quantity <= 0) return false;

            if (book.copies >= quantity) {
                book.copies -= quantity;
                return true;
            } else {
                return false; // Not enough copies
            }
        }
    }

    return false; // Book not found
    }

    public static boolean addBook(String title, String author, String code, int copies) {
        // Basic validation
        if (title == null || title.isEmpty() ||
            author == null || author.isEmpty() ||
            code == null || code.isEmpty() ||
            copies <= 0) {
            return false;
        }

        // Prevent duplicate book codes
        for (Book book : books) {
            if (book.code.equalsIgnoreCase(code)) {
                return false;
            }
        }

        // Add new book
        books.add(new Book(title, author, code, copies));
        return true;
    }

    public static boolean addCopies(String code, int quantity) {
        for (Book book : books) {

            if (book.code.equalsIgnoreCase(code)) {

                if (quantity <= 0) return false;

                book.copies += quantity;
                return true;
            }
        }

        return false; // Book not found
    }

    public static boolean removeBook(String code) {
        if (code == null || code.trim().isEmpty()) return false;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).code.equalsIgnoreCase(code)) {
                books.remove(i);
                return true;
            }
        }

        return false; // Book not found
    }

    public static class Book {
        // CREATE MODEL / VARIABLES FOR title, author, code, copies
        public String title;
        public String author;
        public String code;
        public int copies;
        
        // THIS RUNS WHENEVER A NEW BOOK OBJECT IS CREATED
        public Book(String t, String a, String c, int n) {
            title = t;
            author = a;
            code = c;
            copies = n;
        }
    }
    
    // CREATE ARRAY LIST AS STORAGE/DATABASE
    public static ArrayList<Book> books = new ArrayList<>();


    // CREATE LOADBOKS METHOD
    public static void loadBooks() {
        
        // PREVENTS ADDING THE SAME SET OF BOOKS MULTIPLE TIMES
        // BECAUSE IF YOU RUN OR USE loadBooks() AGAIN, IT WILL DUPLICATE THE COLLECTION
        if (!books.isEmpty()) return; 
        
        // BOOKS COLLECTION
        books.add(new Book("Java Basics", "Lance", "B1", 10));
        books.add(new Book("DSA", "Miguel", "B2", 10));
        books.add(new Book("Algorithms", "Sevi", "B3", 10));
        books.add(new Book("Database", "Rhowanne", "B4", 10));
        books.add(new Book("Networking", "Charles", "B5", 10));
        books.add(new Book("Operating System", "Aldrin", "B6", 10));
        books.add(new Book("AI Intro", "Jayson", "B7", 10));
        books.add(new Book("Web Dev", "Paul", "B8", 10));
        books.add(new Book("Security", "Mark", "B9", 10));
        books.add(new Book("Software Eng", "John", "B10", 10));

    }

}
