package controller;

import view.searchCourse;

import model.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchCourseController extends AppController{

    private searchCourse searchCourse;
    
    public SearchCourseController()
    {
        this.searchCourse = new searchCourse();

        searchCourse.search.addActionListener(new searchListener());
        searchCourse.quit.addActionListener(new QuitListener());
        searchCourse.mainMenu.addActionListener(new MainListener());
    }
    
    class searchListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            String courseName = searchCourse.getCourseName();
            int courseId = searchCourse.getCourseId();

            Course courselist = cat.searchCat(courseName, courseId);

            if (courselist == null)
            {
                searchCourse.setOutput("That course does not exist!");
            }

            searchCourse.setOutput(courselist.toString());
         }
    }

    class MainListener implements ActionListener{
        @Override
		public void actionPerformed(ActionEvent e) {
            searchCourse.setVisible(false);
            MainViewController main = new MainViewController();
        }
    }

    class QuitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			searchCourse.setVisible(false);
		}
		
	}
 
}