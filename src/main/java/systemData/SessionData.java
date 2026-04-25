// import packages
package systemData;
import java.util.ArrayList;

// create SessionData
public class SessionData {
    
    // this will store the username of the current logged in user
    public static String currentUser = null; // NULL BECAUSE IN DEFAULT, NO USER LOGGED IN YET
    
    // create array list for selectedBooks of the user that will track selected books 
    public static ArrayList<String> selectedBooks = new ArrayList<>();
    
    // create an array list to store user borrowed books | this will track user borrowed books specifically on where it belongs
    public static ArrayList<UserBorrowedBooksDatabase> borrowedBooks = new ArrayList<>();
}
