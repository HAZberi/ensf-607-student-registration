package controller;

import view.viewAllCat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewAllCatController extends AppController{

    private viewAllCat viewAllCat;
    
    public ViewAllCatController()
    {
        this.viewAllCat = new viewAllCat();

        viewAllCat.setMessage(cat.toString());
        viewAllCat.quit.addActionListener(e -> quit(this.viewAllCat));
        viewAllCat.mainMenu.addActionListener(e -> mainMenu(this.viewAllCat));
    }
    
}
