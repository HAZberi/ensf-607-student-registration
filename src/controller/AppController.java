package controller;

import model.*;
import view.AppView;

import java.util.ArrayList;

public class AppController {
    protected CourseCat cat;
    protected ArrayList<Student> studentList;

    public AppController() {
        this.studentList = null;
        this.cat = null;
    }

    public AppController(CourseCat cat, ArrayList<Student> stdList) {
        this.studentList = stdList;
        this.cat = cat;
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
    }

    protected void mainMenu(AppView view){
        view.setVisible(false);
        new MainViewController();
    }
}
