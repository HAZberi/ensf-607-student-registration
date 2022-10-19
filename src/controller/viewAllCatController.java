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
