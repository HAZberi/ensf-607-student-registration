package controller;

import view.removeCourse;

import model.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class removeCourseController {

    private removeCourse removeCourse;
    private CourseCat cat;
    private Student student;
    
    public removeCourseController(CourseCat cat, Student student)
    {
        this.removeCourse = new removeCourse();
        this.cat = cat;
        this.student = student;

        removeCourse.drop.addActionListener(new dropListener());
        removeCourse.quit.addActionListener(new QuitListener());
        removeCourse.mainMenu.addActionListener(new MainListener());
    }
    
    class dropListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            String courseName = removeCourse.getCourseName();
            int courseId = removeCourse.getCourseId();


            Course myCourse = cat.searchCat(courseName, courseId);

            if (myCourse == null) {
              removeCourse.setMessage("You are not currently registered for that course!");
            }

            student.removeCourse(myCourse);
            removeCourse.setMessage("You have succesfully dropped that course!");
         }
    }

    class MainListener implements ActionListener{
        @Override
		public void actionPerformed(ActionEvent e) {
            removeCourse.setVisible(false);
            mainViewController main = new mainViewController(cat, student);
        }
    }

    class QuitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			removeCourse.setVisible(false);
		}
		
	}

    
}
