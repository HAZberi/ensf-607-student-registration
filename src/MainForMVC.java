import controller.*;
import model.*;
import view.*;
import java.util.ArrayList;


public class MainForMVC {

    public static void main (String[] args)
    {
        System.out.println("Hello world!");

        studentInfo theView = new studentInfo();

        CourseCat cat = new CourseCat(DataLoader.loadCoursesFromDataBase()); //model

        studentInfoController theController = new studentInfoController(theView, cat);


    }
    
}
