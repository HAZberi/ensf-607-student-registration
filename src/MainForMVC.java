import controller.*;
import db.DataLoader;
import model.*;
import java.util.ArrayList;


public class MainForMVC {

    public static void main (String[] args)
    {
        //Load Existing Model Data from Data Loader(database)
        ArrayList<Student> studentList= DataLoader.loadStudentsFromDatabase();
        CourseCat cat = new CourseCat(DataLoader.loadCoursesFromDataBase());

        AppController app = new AppController(cat, studentList);

        app.init();

    }
    
}
