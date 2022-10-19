package controller;


import model.*;
import view.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentInfoController extends AppController{
    
    private studentInfo view;

    public StudentInfoController()
    {
        this.view = new studentInfo();

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

    /**
     * Need Reimplementation
     */
    class newListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String studentName = view.getCourseName();
            int studentId = view.getStudentId();

            //need to implement
            Student newStudent = new Student(studentName, studentId);
            MainViewController main = new MainViewController();
            view.setVisible(false);
		}
		
	}

    class existingListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String studentName = view.getCourseName();
            int studentId = view.getStudentId();

            Student newStudent = new Student(studentName, studentId);
            MainViewController main = new MainViewController();
            view.setVisible(false);
		}
		
	}


}
