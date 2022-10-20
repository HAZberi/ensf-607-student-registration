package controller;

import view.SearchCourseView;

import model.*;

public class SearchCourseController extends AppController {

    private SearchCourseView searchCourse;

    public SearchCourseController() {
        this.searchCourse = new SearchCourseView();

        searchCourse.search.addActionListener(e -> search());
        searchCourse.quit.addActionListener(e -> quit(this.searchCourse));
        searchCourse.mainMenu.addActionListener(e -> mainMenu(this.searchCourse));
    }

    public void search() {

        String courseName = searchCourse.getCourseName();
        int courseId = searchCourse.getCourseId();

        Course courselist = cat.searchCat(courseName, courseId);

        if (courselist == null)
            searchCourse.setOutput(courseName + "-" + courseId + " does not exist!");

        searchCourse.setOutput(courselist.toString());
    }

}