package systemData;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// ACTIVITY HISTORY STORAGE
public class LogsDatabase {

    public static class Log {
        // DATA MODEL / VARIABLES
        public String username;
        public String action;
        public String bookTitle;
        public String date;
        
        // THIS RUNS WHEN A NEW LOG IS CREATED
        public Log(String u, String a, String b, String d) {
            username = u;
            action = a;
            bookTitle = b;
            date = d;
        }
    }
    
    // ARRAY | WHERE TO STORE LOGS DATA
    public static ArrayList<Log> logs = new ArrayList<>();

    // THIS IS THE METHOD TO ADD NEW LOG
    public static void addLog(String user, String action, String book) {
        
        // GET CURRENT DATE AND FORMAT THE DATE
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");

        String date = now.format(formatter);
        
        // CREATE NEW LOG AND STORE TO LOG ARRAY LIST
        logs.add(new Log(user, action, book, date));
    }

}
