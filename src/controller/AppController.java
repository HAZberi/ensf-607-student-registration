package controller;

import model.*;
import view.AppView;

import java.util.ArrayList;

import db.DataLoader;

public class AppController {
    protected CourseCat cat;
    protected ArrayList<Student> studentList;

    public AppController() {
        this.studentList = DataLoader.students;
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

    protected void addStudent(Student student){
        DataLoader.students.add(student);
        this.studentList.add(student);
    }

    protected Student getStudent(int id){
        for (Student st : this.studentList) {
            if (st.getId() == id)
                return st;
        }
        return null;
    }

    protected void updateStudent(Student student){
        for (Student st : this.studentList) {
            if (st.getId() == student.getId()){
                this.studentList.set(DataLoader.students.indexOf(student), student);
            }
        }

        for (Student st : DataLoader.students) {
            if (st.getId() == student.getId()){
                DataLoader.students.set(DataLoader.students.indexOf(student), student);
            }
        }
    }

    protected Course getCourse(int id){
        for (Course c: this.cat.getCourseList()) {
            if (c.getCourseId() == id)
                return c;
        }
        return null;
    }

    protected Offering getOffering(int section, Course c){
        for (Offering of: c.getOfferingList()) {
            if (of.getSection() == section)
                return of;
        }
        return null;
    }

    protected void setCurrentStudent(Student student){
        DataLoader.currStudent = student;
    }

    protected Student getCurrentStudent(){
        return DataLoader.currStudent;
    }
}
