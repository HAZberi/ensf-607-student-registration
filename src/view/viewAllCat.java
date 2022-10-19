package view;

import javax.swing.*;
import java.awt.*;

public class viewAllCat extends AppView {

    public DefaultListModel<Object> catalogue;
    public JLabel title;
    public JList<Object> list;
    private GridBagConstraints c;

    public viewAllCat()
    {
        mainPanel.setLayout(new GridBagLayout());
        this.c = new GridBagConstraints();
        title = new JLabel("All Available Courses Are Shown Below");
        catalogue = new DefaultListModel<Object>();
    }    

    public void populateView(){
        
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 0.25;
        
        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(title, c);
        
        this.list = new JList<Object>(catalogue);
        c.weighty = 0.75;
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(this.list, c);

        c.weighty = 0.15;
        c.weightx = 0;
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(this.mainMenu, c);

        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(this.quit, c);

        this.add(mainPanel);
        setVisible(true);
    }
}