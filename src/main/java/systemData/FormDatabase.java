// IMPORT PACKAGES
package systemData;
import java.util.ArrayList;

// CREATE FORM DATABASE
public class FormDatabase {

    public static class Form {
        // CREATE MODEL / VARIABLES FOR DATE, STUDENT ID, AND COURSE
        public String date;
        public int studentId;
        public String courseYear;
        
        // THIS CODE RUNS WHEN USER SUBMIT THE FORM
        public Form(String d, int id,String cy) {
            date = d;
            studentId = id;
            courseYear = cy;
        }
    }
    
    // CREATE ARRAY LIST AS STORAGE TO STORE FORM INFORMATION THAT USER SUBMITTED
    public static ArrayList<Form> forms = new ArrayList<>();
    
    // METHOD TO GET THE FORM DETAILS AND STORE TO ARRAY LIST FORM
    public static void addForm(String d, int id, String cy) {
        forms.add(new Form(d, id, cy));
    }
}
