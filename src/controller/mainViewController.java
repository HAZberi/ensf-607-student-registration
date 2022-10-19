package controller;

import model.*;
import view.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainViewController extends AppController {

	private MainView view;

	public MainViewController() {
		this.view = new MainView();

		view.quit.addActionListener(new QuitListener());
		view.addCourse.addActionListener(new addListener());
		view.searchCourse.addActionListener(new searchListener());
		view.removeCourse.addActionListener(new removeListener());
		view.viewAllCourses.addActionListener(new viewAllCatListener());
		view.viewCourses.addActionListener(new viewAllStudentListener());
		view.login.addActionListener(new loginListener());

	}

	class QuitListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			view.setVisible(false);
		}

	}

	class addListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddCourseController();
			view.setVisible(false);
		}

	}

	class searchListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new SearchCourseController();
			view.setVisible(false);
		}

	}

	class removeListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new RemoveCourseController();
			view.setVisible(false);
		}

	}

	class viewAllCatListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new ViewAllCatController();
			view.setVisible(false);
		}

	}

	class viewAllStudentListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new ViewAllStudentController();
			view.setVisible(false);
		}

	}

	class loginListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			studentInfo theView = new studentInfo();
			new StudentInfoController();
			view.setVisible(false);
			theView.setVisible(true);
		}

	}

}
