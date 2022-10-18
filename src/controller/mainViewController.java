package controller;


import model.*;
import view.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainViewController {
    
    private mainView view;
    private CourseCat cat;
    private Student student;

    public mainViewController(CourseCat cat, Student student)
    {
        this.student = student;
        this.cat = cat;
        this.view = new mainView();

        view.quit.addActionListener(new QuitListener());
        view.addCourse.addActionListener(new addListener());
        view.searchCourse.addActionListener(new searchListener());
        view.removeCourse.addActionListener(new removeListener());
        view.viewAllCourses.addActionListener(new viewAllCatListener());
        view.viewCourses.addActionListener(new viewAllStudentListener());
        view.login.addActionListener(new loginListener());

    }

    class QuitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			view.setVisible(false);
		}
		
	}

    class addListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
            new addCourseController(cat, student);
			view.setVisible(false);
		}
		
	}

    class searchListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
            new searchCourseController(cat, student);
			view.setVisible(false);
		}
		
	}

    class removeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
            new removeCourseController(cat, student);
			view.setVisible(false);
		}
		
	}

    class viewAllCatListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
            new viewAllCatController(cat, student);
			view.setVisible(false);
		}
		
	}

    class viewAllStudentListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
            new viewAllStudentController(cat, student);
			view.setVisible(false);
		}
		
	}

    class loginListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			studentInfo theView = new studentInfo();
            new studentInfoController(theView,cat);
			view.setVisible(false);
			theView.setVisible(true);
		}
		
	}



}
