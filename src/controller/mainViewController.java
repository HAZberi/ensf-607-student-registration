package controller;

import view.*;

public class MainViewController extends AppController {

	private MainView view;

	public MainViewController() {
		this.view = new MainView();

		System.out.println(this.cat.getCourseList().toString());

		view.quit.addActionListener(e -> quit(this.view));
		view.addCourse.addActionListener(e -> addCourse());
		view.searchCourse.addActionListener(e -> searchCourse());
		view.removeCourse.addActionListener(e -> removeACourse());
		view.viewAllCourses.addActionListener(e -> viewAllCourses());
		view.viewCourses.addActionListener(e -> viewCourses());
	}

	private void addCourse() {
		view.setVisible(false);
		new AddCourseController();
	}

	private void searchCourse() {
		view.setVisible(false);
		new SearchCourseController();
	}

	private void removeACourse() {
		view.setVisible(false);
		new RemoveCourseController();
	}

	private void viewAllCourses() {
		view.setVisible(false);
		new ViewAllCatController();
	}

	private void viewCourses() {
		view.setVisible(false);
		new ViewAllStudentController();
	}

}