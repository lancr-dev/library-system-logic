// import packages
package systemData;
import java.util.ArrayList;

// create FormDatabase
public class FormDatabase {
    
    // create Form model
    public static class Form {
        // create variables for date, student id, and course
        public String date;
        public int studentId;
        public String courseYear;
        
        // create a new Form object with date, student id, and course | runs whenever a new Form object is created
        public Form(String d, int id,String cy) {
            date = d;
            studentId = id;
            courseYear = cy;
        }
    }
    
    // create an array list for Form as temporary database
    public static ArrayList<Form> forms = new ArrayList<>();
    
    // create addForm() method to store in array list
    public static void addForm(String d, int id, String cy) {
        forms.add(new Form(d, id, cy));
    }
}
