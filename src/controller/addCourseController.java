package controller;

import view.addCourse;

import model.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addCourseController {

    private addCourse addCourse;
    private CourseCat cat;
    private Student student;
    
    public addCourseController(CourseCat cat, Student student)
    {
        this.addCourse = new addCourse();
        this.cat = cat;
        this.student = student;

        addCourse.add.addActionListener(new addListener());
        addCourse.quit.addActionListener(new QuitListener());
        addCourse.mainMenu.addActionListener(new MainListener());
    }
    
    class addListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            addCourse.setMessage("Course Succesfully Added!");
         }
    }

    class MainListener implements ActionListener{
        @Override
		public void actionPerformed(ActionEvent e) {
            mainViewController main = new mainViewController(cat, student);
            addCourse.setVisible(false);
        }
    }

    class QuitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			addCourse.setVisible(false);
		}
		
	}

    
}
