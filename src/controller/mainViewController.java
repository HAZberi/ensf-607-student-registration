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
		view.login.addActionListener(e -> login());
		view.endEnrollment.addActionListener(e -> endEnrollment());
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
		new AllStudentCoursesController();
	}

	private void login(){
		view.setVisible(false);
		new StudentInfoController();
	}

	private void endEnrollment(){
		view.setVisible(false);
		new EndEnrollmentController();
	}

}