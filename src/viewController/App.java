package viewController;
import model.*;

import java.util.ArrayList;

public class App {
    private CourseCat catalog;
    private ArrayList<Student> studentList;
    
    public App() {
        this.catalog = new CourseCat(DataLoader.loadCoursesFromDataBase());
        this.studentList = DataLoader.loadStudentsFromDatabase();
    }

    public void printCatalog(){
        System.out.println(catalog);
    }


}
