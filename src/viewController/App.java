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

    // private Offering getCourseOffering(Course c) {

    //     ArrayList<Offering> temp = new ArrayList<Offering>();

    //     for(Offering of: this.allOfferings){
    //         if(of.getCourse().getCourseId() == c.getCourseId()){
    //             temp.add(of);
    //         }
    //     }

    //     for(Offering of: temp){
    //         if(of.numberOfStudents() < 8){
    //             return of;
    //         }
    //     }

    //     return temp.get(0);

    // }

    private Student getStudent() {
        while (true) {
            System.out.println("1. Select existing student.");
            System.out.println("2. Create new student.");
            System.out.println("-".repeat(40));
            System.out.print("Please select a menu item: ");
            int option = reader.getKeyboardInteger();

            if (option == 1) {
                System.out.print("Please enter a Student ID: ");
                int id = reader.getKeyboardInteger();

                for (Student st : this.studentList) {
                    if (st.getId() == id)
                        return st;
                }

                System.out.println("Student " + id + " not found.");
            }

            if (option == 2) {
                System.out.print("Please enter the student name : ");
                String name = reader.getKeyboardInput();

                System.out.print("Please enter the student id (Any integer value): ");
                int id = reader.getKeyboardInteger();

                Student student = new Student(name, id);

                this.studentList.add(student);

                return student;
            }
        }
    }

    private Course getCourse(){
        while(true){
            System.out.print("Please enter the course id : ");
            int courseId = reader.getKeyboardInteger();

            for (Course c: this.catalog.getCourseList()) {
                if (c.getCourseId() == courseId)
                    return c;
            }

            System.out.println("Cannot find any course with " + courseId + ".");
        }
    }

    private Offering getSection(Course c){
        while(true){
            System.out.print("Please enter the section number : ");
            int section = reader.getKeyboardInteger();

            for (Offering of: c.getOfferingList()) {
                if (of.getSection() == section)
                    return of;
            }

            System.out.println("Cannot find any offering for Course: " + c.getCourseId() + " Section: " + section + ".");
        }
    }

    public void addCourse() {
        System.out.print("\n" + "-".repeat(40) + "\n");
        System.out.print(" ".repeat(13) + "Add Courses" + "\n" + "-".repeat(40) + "\n");
        
        Student s = getStudent();
        
        Course c = getCourse();
        
        Offering of = getSection(c);
        
        System.out.print("-".repeat(40) + "\n");
        s.registerForCourse(this.catalog, c.getCourseName(), c.getCourseId(), of.getSection());
        System.out.print("-".repeat(40) + "\n");

        s.printCourseList();
        
    }

    public void printMenu() {
        System.out.println("\n" + "-".repeat(22) + " Menu " + "-".repeat(22));
        System.out.println("1. Search for the course catalogue.");
        System.out.println("2. Add course to student courses.");
        System.out.println("3. Remove course from student courses.");
        System.out.println("4. View All courses in the catalogue.");
        System.out.println("5. View all courses taken by the student.");
        System.out.println("6. Quit.");
        System.out.println("7. End Enrollment.");
    }

    public void setMenuItem() {
        while (true) {
            try {
                System.out.println("-".repeat(50));
                System.out.print("Please select a menu item: ");
                int mitem = reader.getKeyboardInteger();

                if (mitem < 8 && mitem > 0) {
                    this.selectedMenuItem = mitem;
                    return;
                }

            } catch (NumberFormatException e) {
            }

            System.out.println("Please select a valid menu item (1-7)");
        }
    }

    public void viewAllCourses(){
        Student s = getStudent();
        
        s.printCourseList();
    }

    public void endEnrollment(){
        System.out.println("-".repeat(25) + "Enrollment Status" + "-".repeat(25));
        for (Course c: this.catalog.getCourseList()) {
            c.validateOffering();
        }
        System.out.println("-".repeat(67));
    }

    public void menuSwitchBoard() {
        switch (this.selectedMenuItem) {
            case 1:
                this.searchCatalog();
                break;
            case 2:
                this.addCourse();
                break;
            case 3:
                System.out.println("To be implemented.");
                break;
            case 4:
                this.printCatalog();
                break;
            case 5:
                this.viewAllCourses();
                break;
            case 6:
                System.exit(0);
                break;
            case 7:
                this.endEnrollment();
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
