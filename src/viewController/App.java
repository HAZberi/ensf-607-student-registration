package viewController;
import model.*;

import java.util.ArrayList;

public class App {
    private ArrayList<Course> courseList;
    private ArrayList<Student> studentList;
    
    public App() {
        this.courseList = DataLoader.loadCoursesFromDataBase();
        this.studentList = DataLoader.loadStudentsFromDatabase();
    }

    
}
