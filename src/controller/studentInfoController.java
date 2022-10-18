package controller;


import model.*;
import view.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studentInfoController {
    
    private studentInfo view;
    private CourseCat cat;

    public studentInfoController(studentInfo view, CourseCat cat)
    {
        this.view = view;
        this.cat = cat;

        view.quit.addActionListener(new QuitListener());
        view.newStudent.addActionListener(new newListener());
        view.existingStudent.addActionListener(new existingListener());

    }

    class QuitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			view.setVisible(false);
		}
		
	}

    class newListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String studentName = view.getCourseName();
            int studentId = view.getStudentId();

            //need to implement
            Student newStudent = new Student(studentName, studentId);
            mainViewController main = new mainViewController(cat, newStudent);
            view.setVisible(false);
		}
		
	}

    class existingListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String studentName = view.getCourseName();
            int studentId = view.getStudentId();

            Student newStudent = new Student(studentName, studentId);
            mainViewController main = new mainViewController(cat, newStudent);
            view.setVisible(false);
		}
		
	}


}
