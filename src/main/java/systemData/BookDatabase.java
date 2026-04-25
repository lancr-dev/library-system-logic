// import necessary packages
package systemData;
import java.util.ArrayList;

// create BookDatabase
public class BookDatabase {
    
    // create removeCopies() method
    public static boolean removeCopies(String code, int quantity) {
        for (Book book : books) {

        if (book.code.equalsIgnoreCase(code)) {

            // check if enough copies exist
            if (quantity <= 0) return false;
            
            // this will perform to decrease copies of the book
            if (book.copies >= quantity) {
                book.copies -= quantity;
                return true;
            } else {
                return false; // not enough copies
            }
        }
    }

    return false; // book not found
    }
    
    // create addBook() method
    public static boolean addBook(String title, String author, String code, int copies) {
        
        // if title or title or author or code is equals to null or empty > return false
        if (title == null || title.isEmpty() || author == null || author.isEmpty() || code == null || code.isEmpty() || copies <= 0) {
            return false;
        }

        // this will prevent duplicate book codes
        for (Book book : books) {
            if (book.code.equalsIgnoreCase(code)) {
                return false;
            }
        }

        // add the new book with details
        books.add(new Book(title, author, code, copies));
        return true;
    }
    
    // create addCopites() method
    public static boolean addCopies(String code, int quantity) {
        // loop through books
        for (Book book : books) {

            if (book.code.equalsIgnoreCase(code)) {

                if (quantity <= 0) return false; // if quantity is negative > prevent from adding copies

                book.copies += quantity; // this will add copies if valid
                return true;
            }
        }

        return false; // book not found
    }
    
    // create a boolean removeBook() method
    public static boolean removeBook(String code) {
        // if code is equal to null or empty > prevent
        if (code == null || code.trim().isEmpty()) return false;
        
        // loob through books to find the code of the book before removing
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).code.equalsIgnoreCase(code)) {
                books.remove(i);
                return true;
            }
        }

        return false; // book not found
    }
    
    // create Book class or model of the book
    public static class Book {
        // create variables for title, author, code and copies
        public String title;
        public String author;
        public String code;
        public int copies;
        
        // create a new Book object with given title, author, code, and copies | runs whenever a new Book object is created
        public Book(String t, String a, String c, int n) {
            title = t;
            author = a;
            code = c;
            copies = n;
        }
    }
    
    // create array list as temporary database for Books
    public static ArrayList<Book> books = new ArrayList<>();

    // create loadBooks() method
    public static void loadBooks() {
        
        // prevents adding the same set of books multiple times
        // because if you run or use loadBooks again, it will duplicate the whole book collection
        if (!books.isEmpty()) return; 
        
        // book collection (already stored in array list)
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
