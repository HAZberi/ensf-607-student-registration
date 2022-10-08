package viewController;

import model.*;
import java.util.ArrayList;

public class App {
    private CourseCat catalog;
    private ArrayList<Student> studentList;
    private KeyboardReader reader;
    private int selectedMenuItem;

    public App() {
        this.reader = new KeyboardReader(); // initialize keyboard reader input
        this.catalog = new CourseCat(DataLoader.loadCoursesFromDataBase());
        this.studentList = DataLoader.loadStudentsFromDatabase();
    }

    public void printCatalog() {
        System.out.println(catalog);
    }

    public void searchCatalog() {
        System.out.print("\n" + "-".repeat(40) + "\n");
        System.out.print(" ".repeat(13) + "Search Catalog" + "\n" + "-".repeat(40) + "\n");
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

    public void printMenu() {
        System.out.println("\n" + "-".repeat(22) + " Menu " + "-".repeat(22));
        System.out.println("1. Search for the course catalogue.");
        System.out.println("2. Add course to student courses.");
        System.out.println("3. Remove course from student courses.");
        System.out.println("4. View All courses in the catalogue.");
        System.out.println("5. View all courses taken by the student.");
        System.out.println("6. Quit.");
    }

    public void setMenuItem() {
        while (true) {
            try {
                System.out.println("-".repeat(50));
                System.out.print("Please select a menu item: ");
                int mitem = reader.getKeyboardInteger();

                if (mitem < 7 && mitem > 0) {
                    this.selectedMenuItem = mitem;
                    return;
                }

            } catch (NumberFormatException e) {
            }

            System.out.println("Please select a valid menu item (1-6)");
        }
    }

    public void menuSwitchBoard() {
        switch (this.selectedMenuItem) {
            case 1:
                this.searchCatalog();
                break;
            case 2:
                System.out.println("To be implemented.");
                break;
            case 3:
                System.out.println("To be implemented.");
                break;
            case 4:
                this.printCatalog();
                break;
            case 5:
                System.out.println("To be implemented.");
                break;
            case 6:
                System.exit(0);
        }
    }

    public void init() {
        while (true) {
            printMenu();
            setMenuItem();
            menuSwitchBoard();
        }
    }

}
