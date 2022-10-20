package controller;

import view.RemoveCourseView;

import db.DataLoader;

import model.*;

public class RemoveCourseController extends AppController {

    private RemoveCourseView view;

    public RemoveCourseController() {
        this.view = new RemoveCourseView();

        view.drop.addActionListener(e -> dropCourse());
        view.quit.addActionListener(e -> quit(this.view));
        view.mainMenu.addActionListener(e -> mainMenu(this.view));
    }

    private void dropCourse(){
        int courseId = view.getCourseId();
        Course course = getCourse(courseId);
        Student st = DataLoader.currStudent;
        if(st == null){
            new StudentInfoController();
            this.view.setVisible(false);
            return;
        }
        view.setMessage(st.removeCourse(course));
        updateStudent(st);
    }
}
