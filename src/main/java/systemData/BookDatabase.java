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
        books.add(new Book("Java Basics", "John", "B1", 3));
        books.add(new Book("DSA", "Mike", "B2", 3));
        books.add(new Book("Algorithms", "Sara", "B3", 3));
        books.add(new Book("Database", "Kim", "B4", 3));
        books.add(new Book("Networking", "Lee", "B5", 3));
        books.add(new Book("Operating System", "Ken", "B6", 3));
        books.add(new Book("AI Intro", "Anna", "B7", 3));
        books.add(new Book("Web Dev", "Paul", "B8", 3));
        books.add(new Book("Security", "Mark", "B9", 3));
        books.add(new Book("Software Eng", "Tom", "B10", 3));

    }

}
