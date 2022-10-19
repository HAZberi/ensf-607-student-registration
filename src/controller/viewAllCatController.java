package controller;

import view.viewAllCat;
import model.Course;

public class ViewAllCatController extends AppController{

    private viewAllCat viewAllCat;
    
    public ViewAllCatController()
    {
        this.viewAllCat = new viewAllCat();

        for(Course c: cat.getCourseList()){
            viewAllCat.catalogue.addElement(c.toString());
        }

        viewAllCat.populateView();
        viewAllCat.quit.addActionListener(e -> quit(this.viewAllCat));
        viewAllCat.mainMenu.addActionListener(e -> mainMenu(this.viewAllCat));
    }
    
}
