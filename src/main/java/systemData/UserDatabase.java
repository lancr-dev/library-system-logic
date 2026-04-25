// import packages
package systemData;
import java.util.ArrayList;

// create UserDatabase
public class UserDatabase {
    
    // create User model
    public static class User {
        // create variables for username, email, password, course, and studen id
        public String username;
        public String email;
        public String password;
        public String course;
        public int studentId;
        
        // create a new object with username, email, password, course, and studen id | runs when a new user is added or created
        public User(String u, String e, String p, String c, int id) {
            username = u;
            email = e;
            password = p;
            course = c;
            studentId = id;
        }
    }
    
    // create an array list ofr Users as temporary database
    public static ArrayList<User> users = new ArrayList<>();


    // create an addUser() method to add user
    public static void addUser(String u, String e, String p, String c, int id) {
        users.add(new User(u, e, p, c, id));
    }


    // this will validate and check if username password is exist 
    public static boolean validate(String u, String p) {
        
        // loop through registered users
        for (User user : users) {
            // if username is equal to username and password is equal to password > return true / proceed
            if (user.username.equals(u) && user.password.equals(p)) {
                return true;
            }
        }

        return false; // otherwise return false
    }
    
    // create default accounts by creating loadDefaultUsers() method
    public static void loadDefaultUsers() {
        
        // this will help to prevent duplicate default users from being added again
        if (!users.isEmpty()) return;
        
        // add default accoun (especially admins)
        users.add(new User("Admin", "--", "12345", "--", 00000000));
        users.add(new User("Student", "student@cvsu.edu.ph", "12345", "BSCS", 123456789));

    }
}
