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
        books.add(new Book("Introduction to Programming", "Paul Deitel", "CS101", 20));
        books.add(new Book("Object-Oriented Programming in Java", "Cay S. Horstmann", "CS102", 20));
        books.add(new Book("Data Structures Fundamentals", "Michael Goodrich", "CS103", 20));
        books.add(new Book("Algorithms Unlocked", "Thomas H. Cormen", "CS104", 20));
        books.add(new Book("Computer Organization and Design", "David A. Patterson", "CS105", 20));

        books.add(new Book("Operating System Concepts", "Abraham Silberschatz", "CS106", 20));
        books.add(new Book("Database System Design", "Raghu Ramakrishnan", "CS107", 20));
        books.add(new Book("Computer Networks", "Andrew S. Tanenbaum", "CS108", 20));
        books.add(new Book("Software Engineering Principles", "Ian Sommerville", "CS109", 20));
        books.add(new Book("Artificial Intelligence Basics", "Stuart Russell", "CS110", 20));

        books.add(new Book("Web Development Essentials", "Jon Duckett", "IT101", 20));
        books.add(new Book("Mobile App Development", "Meier Jeffrey", "IT102", 20));
        books.add(new Book("System Analysis and Design", "Kendall & Kendall", "IT103", 20));
        books.add(new Book("Human Computer Interaction", "Alan Dix", "IT104", 20));
        books.add(new Book("Cybersecurity Fundamentals", "William Stallings", "IT105", 20));

        books.add(new Book("Discrete Mathematics", "Kenneth Rosen", "MATH101", 20));
        books.add(new Book("Calculus I", "James Stewart", "MATH102", 20));
        books.add(new Book("Calculus II", "James Stewart", "MATH103", 20));
        books.add(new Book("Linear Algebra", "Gilbert Strang", "MATH104", 20));
        books.add(new Book("Probability and Statistics", "Ronald Walpole", "MATH105", 20));

        books.add(new Book("General Physics I", "Serway & Jewett", "SCI101", 20));
        books.add(new Book("General Physics II", "Hugh Young", "SCI102", 20));
        books.add(new Book("Modern Physics", "Kenneth Krane", "SCI103", 20));
        books.add(new Book("Basic Chemistry", "Zumdahl", "SCI104", 20));
        books.add(new Book("Organic Chemistry", "Paula Bruice", "SCI105", 20));

        books.add(new Book("Principles of Economics", "N. Gregory Mankiw", "BUS101", 20));
        books.add(new Book("Microeconomics", "Paul Krugman", "BUS102", 20));
        books.add(new Book("Macroeconomics", "Olivier Blanchard", "BUS103", 20));
        books.add(new Book("Accounting Principles", "Jerry Weygandt", "BUS104", 20));
        books.add(new Book("Business Management", "Stephen Robbins", "BUS105", 20));

        books.add(new Book("Technical Writing", "Sharon Gerson", "ENG101", 20));
        books.add(new Book("Engineering Mechanics", "Beer & Johnston", "ENG102", 20));
        books.add(new Book("Engineering Drawing", "N. D. Bhatt", "ENG103", 20));
        books.add(new Book("Thermodynamics", "Yunus Çengel", "ENG104", 20));
        books.add(new Book("Electrical Circuits", "Alexander & Sadiku", "ENG105", 20));

        books.add(new Book("Psychology Fundamentals", "David Myers", "PSY101", 20));
        books.add(new Book("Cognitive Psychology", "E. Bruce Goldstein", "PSY102", 20));
        books.add(new Book("Abnormal Psychology", "Ronald Comer", "PSY103", 20));
        books.add(new Book("Social Psychology", "Aronson Wilson", "PSY104", 20));
        books.add(new Book("Developmental Psychology", "John Santrock", "PSY105", 20));

        books.add(new Book("Philippine History", "Teodoro Agoncillo", "HUM101", 20));
        books.add(new Book("World History", "William McNeill", "HUM102", 20));
        books.add(new Book("Ethics and Morality", "Immanuel Kant (compiled)", "HUM103", 20));
        books.add(new Book("Logic and Critical Thinking", "Irving Copi", "HUM104", 20));
        books.add(new Book("Communication Arts", "Julia Wood", "HUM105", 20));

    }

}
