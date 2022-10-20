package controller;

import view.EndEnrollmentView;
import model.*;

public class EndEnrollmentController extends AppController{

    private EndEnrollmentView view;
    
    public EndEnrollmentController()
    {
        this.view = new EndEnrollmentView();

        view.setMessage(setList());
        view.quit.addActionListener(e -> quit(this.view));
        view.mainMenu.addActionListener(e -> mainMenu(this.view));
    }

    private String setList(){

        String str = "";

        for (Course c: this.cat.getCourseList()) {
            str = str + c.validateOffering() + "\n";
        }

        return str;
    }

    
}

