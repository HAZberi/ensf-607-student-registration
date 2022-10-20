package controller;

import view.CatalogueView;

import model.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewAllStudentController extends AppController{

    private CatalogueView viewAllCat;
    
    public ViewAllStudentController()
    {
        this.viewAllCat = new CatalogueView();

        // viewAllCat.setMessage(studentList.get(0).printCourseList());

        viewAllCat.quit.addActionListener(new QuitListener());
        viewAllCat.mainMenu.addActionListener(new MainListener());
    }

    class MainListener implements ActionListener{
        @Override
		public void actionPerformed(ActionEvent e) {
            viewAllCat.setVisible(false);
            MainViewController main = new MainViewController();
        }
    }

    class QuitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			viewAllCat.setVisible(false);
		}
		
	}

    
}
