package controller;

import view.StudentCoursesView;
import model.*;

import db.DataLoader;

public class AllStudentCoursesController extends AppController{

    private StudentCoursesView view;
    
    public AllStudentCoursesController()
    {
        this.view = new StudentCoursesView();

        view.setMessage(setList());
        view.quit.addActionListener(e -> quit(this.view));
        view.mainMenu.addActionListener(e -> mainMenu(this.view));
    }

    private String setList(){
        Student st = DataLoader.currStudent;
        if(st == null){
            new StudentInfoController();
            this.view.setVisible(false);
            return "";
        }

        return st.printCourseList();
    }

    
}
