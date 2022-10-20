package controller;

import view.AddCourseView;

import model.*;

import db.DataLoader;

public class AddCourseController extends AppController {

    private AddCourseView view;

    public AddCourseController() {
        this.view = new AddCourseView();

        view.addCourse.addActionListener(e -> addCourseToCurrStudent());
        view.quit.addActionListener(e -> quit(this.view));
        view.mainMenu.addActionListener(e -> mainMenu(this.view));
    }

    private void addCourseToCurrStudent(){
        String courseName = view.getCourseName();
        int courseId = view.getCourseId();
        int section = view.getSection();

        Course c = getCourse(courseId);
        if(c == null){
            view.setMessage(courseName + "-" + courseId + " does not exist.");
            return;
        }

        Offering of = getOffering(section, c);
        if(of == null){
            view.setMessage("Section " + section + " does not exist.");
            return;
        }

        Student st = DataLoader.currStudent;

        if(st == null){
            new StudentInfoController();
            return;
        }

        st.registerForCourse(cat, courseName, courseId, section);
        view.setMessage(courseName + "-" + courseId + " successfully registered.");
        updateStudent(st);
    }

}
