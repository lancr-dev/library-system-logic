// IMPORT PACKAGES
package systemData;

import java.util.ArrayList;

// CREATE BOOK DATABASE
public class BookDatabase {

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
