/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// IMPORTS
package systemData;
import java.util.ArrayList;

// CREATE PUBLIC CLASS OF USER DATABASE
public class UserDatabase {
    
    // MODEL CLASS
    public static class User {
        public String username;
        public String email;
        public String password;
        
        // THIS CODE RUNS WHEN CREATING A NEW USER
        public User(String u, String e, String p) {
            username = u;
            email = e;
            password = p;
        }
    }
    
    // ARRAY TO STORE USERS
    public static ArrayList<User> users = new ArrayList<>();


    // ADD USER
    public static void addUser(String u, String e, String p) {
        users.add(new User(u, e, p));
    }


    // VALIDATE USER | THIS CHECKS IF USERNAME AND PASSWORD EXIST
    public static boolean validate(String u, String p) {

        for (User user : users) {
            if (user.username.equals(u) &&
                user.password.equals(p)) {
                return true;
            }
        }

        return false;
    }
    
    // CREATE ACCOUNT FOR ADMINISTRATOR
    public static void loadDefaultUsers() {

        if (!users.isEmpty()) return;

        users.add(
            new User(
                "admin",
                "admin@gmail.com",
                "1234"
            )
        );

    }
}
