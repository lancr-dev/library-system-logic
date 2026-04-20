/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemData;
import java.util.ArrayList;

public class SessionData {
    
    // THIS STORES THE USERNAME OF THE LOGGED-IN USER
    public static String currentUser = null; // NULL BECAUSE IN DEFAULT, NO USER LOGGED IN YET
    
    // THIS STORES BOOKS, THE USER SELECTED BEFORE CHECKOUT (TO SHOW THE BORROWED BOOKS IN THE CHEKOUT PAGE)
    public static ArrayList<String> selectedBooks = new ArrayList<>();
    // WHY ARRAY STRINGS? BECAUSE WE ONLY STORE BOOK NAMES, NOT FULL OBJECT
    
    public static ArrayList<UserBorrowedBooksDatabase> borrowedBooks = new ArrayList<>();
}
