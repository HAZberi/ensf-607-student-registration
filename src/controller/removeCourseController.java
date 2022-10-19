package controller;

import view.removeCourse;

import model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveCourseController extends AppController {

    private removeCourse removeCourse;

    public RemoveCourseController() {
        this.removeCourse = new removeCourse();

        removeCourse.drop.addActionListener(new dropListener());
        removeCourse.quit.addActionListener(new QuitListener());
        removeCourse.mainMenu.addActionListener(new MainListener());
    }

    /**
     * Re-Implement this - TEMPORARY FIX
     */
    class dropListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String courseName = removeCourse.getCourseName();
            int courseId = removeCourse.getCourseId();

            Course myCourse = cat.searchCat(courseName, courseId);

            if (myCourse == null) {
                removeCourse.setMessage("You are not currently registered for that course!");
            }

            studentList.get(0).removeCourse(myCourse);
            removeCourse.setMessage("You have succesfully dropped that course!");
        }
    }

    class MainListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            removeCourse.setVisible(false);
            MainViewController main = new MainViewController();
        }
    }

    class QuitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            removeCourse.setVisible(false);
        }

    }

}
