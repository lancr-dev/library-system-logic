/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemData;

/**
 *
 * @author Admin
 */
public class UserBorrowedBooks {
    // STORES the username of the person who borrowed the book
    public String username;

    // STORES the title of the borrowed book
    public String title;

    // STORES the unique code of the borrowed book
    public String code;

    /**
     * CONSTRUCTOR
     * 
     * This runs whenever a new BorrowRecord object is created.
     * It initializes all the required fields.
     * 
     * @param username - the current logged-in user
     * @param title    - the title of the book
     * @param code     - the unique book code
     */
    public UserBorrowedBooks(String username, String title, String code) {
        this.username = username;
        this.title = title;
        this.code = code;
    }
}
