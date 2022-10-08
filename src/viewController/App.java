package viewController;

import model.*;

import java.io.IOException;
import java.util.ArrayList;

public class App {
    private CourseCat catalog;
    private ArrayList<Student> studentList;
    private KeyboardReader reader;

    public App() {
        this.reader = new KeyboardReader(); // initialize keyboard reader input
        this.catalog = new CourseCat(DataLoader.loadCoursesFromDataBase());
        this.studentList = DataLoader.loadStudentsFromDatabase();
    }

    public void printCatalog() {
        System.out.println(catalog);
    }

    public void searchCatalog() {
        System.out.print("-".repeat(40) + "\n");
        System.out.print("\nSearch Catalog" + "\n" + "-".repeat(40) + "\n");
        System.out.print("Please enter the course name : ");
        String courseName = reader.getKeyboardInput();

        System.out.print("Please enter the course id : ");
        int courseId = reader.getKeyboardInteger();

        System.out.print("-".repeat(40) + "\n");
        System.out.print("-".repeat(10) + "\n");
        System.out.println("Results:");
        System.out.print("-".repeat(10) + "\n");

        Course c = this.catalog.searchCat(courseName, courseId);

        if (c == null) {
            System.out.println(courseName + "-" + courseId + " does not exist.");
            System.out.print("-".repeat(40) + "\n");
            return;
        }

        System.out.println(c);
        System.out.print("-".repeat(40) + "\n");
    }

    
}
