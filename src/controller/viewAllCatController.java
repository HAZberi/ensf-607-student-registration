package controller;

import view.CatalogueView;
import model.Course;

public class ViewAllCatController extends AppController{

    private CatalogueView viewAllCat;
    
    public ViewAllCatController()
    {
        this.viewAllCat = new CatalogueView();

        for(Course c: cat.getCourseList()){
            viewAllCat.catalogue.addElement(c.toString());
        }

        viewAllCat.populateView();
        viewAllCat.quit.addActionListener(e -> quit(this.viewAllCat));
        viewAllCat.mainMenu.addActionListener(e -> mainMenu(this.viewAllCat));
    }
    
}
