// import packages
package systemData;
import java.time.LocalDateTime;

// create UserBorrowedBooksDatabase
public class UserBorrowedBooksDatabase {
    // create variables for username, title, code, and borrow date
    public String username;
    public String title;
    public String code;
    public LocalDateTime borrowDate;
    
    // create a new object with username, title, code, and borrow date | runs when user checkout book
    public UserBorrowedBooksDatabase(String username, String title, String code, LocalDateTime date) {
        this.username = username;
        this.title = title;
        this.code = code;
        borrowDate = date;
    }
}
