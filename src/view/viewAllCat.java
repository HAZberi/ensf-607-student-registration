package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewAllCat extends AppView {

    public JButton mainMenu;
    public JButton quit;

    public JTextArea catalogue;
    public JLabel title;

    public viewAllCat()
    {

        mainMenu = new JButton("Main Menu");
        quit = new JButton("Quit");
        title = new JLabel("All Available Courses Are Shown Below");
        catalogue = new JTextArea();
        catalogue.setEditable(false);
       


        JPanel topPanel = new JPanel();
		JPanel topCenterPanel = new JPanel();
        JPanel bottomCenterPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
        mainPanel.add(topPanel);
        mainPanel.add(topCenterPanel);
        mainPanel.add(bottomCenterPanel);
        mainPanel.add(bottomPanel);

        topPanel.add(title);
        topCenterPanel.add(catalogue);
        bottomPanel.add(mainMenu);
        bottomPanel.add(quit);

        this.add(mainPanel);
        setVisible(true);
    }

    public void setMessage(String msg)
    {
        catalogue.setText(msg);
    }
}