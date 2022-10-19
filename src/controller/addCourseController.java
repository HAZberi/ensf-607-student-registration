package controller;

import view.addCourse;

import model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddCourseController extends AppController {

    private addCourse addCourse;

    public AddCourseController() {
        this.addCourse = new addCourse();

        addCourse.add.addActionListener(new addListener());
        addCourse.quit.addActionListener(new QuitListener());
        addCourse.mainMenu.addActionListener(new MainListener());
    }

    class addListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            addCourse.setMessage("Course Succesfully Added!");
        }
    }

    class MainListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MainViewController main = new MainViewController();
            addCourse.setVisible(false);
        }
    }

    class QuitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            addCourse.setVisible(false);
        }

    }

}
