package controller;

import view.viewAllCat;

import model.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewAllStudentController {

    private viewAllCat viewAllCat;
    private CourseCat cat;
    private Student student;
    
    public viewAllStudentController(CourseCat cat, Student student)
    {
        this.viewAllCat = new viewAllCat();
        this.cat = cat;
        this.student = student;

        viewAllCat.setMessage(student.printCourseList());

        viewAllCat.quit.addActionListener(new QuitListener());
        viewAllCat.mainMenu.addActionListener(new MainListener());
    }

    class MainListener implements ActionListener{
        @Override
		public void actionPerformed(ActionEvent e) {
            viewAllCat.setVisible(false);
            mainViewController main = new mainViewController(cat, student);
        }
    }

    class QuitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			viewAllCat.setVisible(false);
		}
		
	}

    
}
