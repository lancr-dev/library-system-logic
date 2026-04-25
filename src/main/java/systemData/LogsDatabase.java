// import packages
package systemData;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// create LogsDatabase
public class LogsDatabase {
    
    // create Log model
    public static class Log {
        // create variables for username, action, book title, date, and isLate
        public String username;
        public String action;
        public String bookTitle;
        public String date;
        public boolean isLate; 
        
        // create a new Log object with username, action, book title, date, and isLate | runs whenever a new Log object is created
        public Log(String u, String a, String b, String d, boolean late) {
            username = u;
            action = a;
            bookTitle = b;
            date = d;
            isLate = late;
        }
    }
    
   // create an array list for Logs as temporary database
    public static ArrayList<Log> logs = new ArrayList<>();

    // create addLog() method to add new log
    public static void addLog(String user, String action, String book, boolean isLate) {
        
        // this will get current date 
        LocalDateTime now = LocalDateTime.now();
        
        // this will format the date to make it readable
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");

        String date = now.format(formatter);
        
        // this will create new log
        logs.add(new Log(user, action, book, date, isLate));
    }
    
    // this addLog() method will add new log to store in array list
    public static void addLog(String user, String action, String book) {
        addLog(user, action, book, false); // default: not late
    }

}
