package controller;

import model.*;
import view.AppView;

import java.util.ArrayList;

import db.DataLoader;

public class AppController {
    protected CourseCat cat;
    protected ArrayList<Student> studentList;

    public AppController() {
        this.studentList = DataLoader.loadStudentsFromDatabase();
        this.cat = new CourseCat(DataLoader.loadCoursesFromDataBase());
    }

    public void loadData(CourseCat cat, ArrayList<Student> stdList) {
        this.studentList = stdList;
        this.cat = cat;
    }

    public void init() {
       new MainViewController();
    }

    protected void quit(AppView view) {
        view.setVisible(false);
        view.dispose();
        System.exit(0);
    }

    protected void mainMenu(AppView view){
        view.setVisible(false);
        new MainViewController();
    }
}
