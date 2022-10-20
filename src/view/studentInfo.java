package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studentInfo extends AppView {

    public JButton newStudent;
    public JButton existingStudent;
    public JButton quit;

    public JTextField name;
    public JLabel enterName;

    public JTextField id;
    
    public JLabel enterId;

    public JLabel title;

    public studentInfo()
    {
        newStudent = new JButton("Existing");
        existingStudent = new JButton("New");
        quit = new JButton("Quit");
        name = new JTextField(10);
        enterName = new JLabel("Enter your name");
        id = new JTextField(10);
        enterId = new JLabel("Enter your student ID");
        title = new JLabel("Please Input Your Information Below Then Select Your Status");
       


        JPanel topPanel = new JPanel();
		JPanel topCenterPanel = new JPanel();
        JPanel bottomCenterPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
        mainPanel.add(topPanel);
        mainPanel.add(topCenterPanel);
        mainPanel.add(bottomCenterPanel);
        mainPanel.add(bottomPanel);

        topPanel.add(title);
        topCenterPanel.add(enterName);
        topCenterPanel.add(name);
        bottomCenterPanel.add(enterId);
        bottomCenterPanel.add(id);
        bottomPanel.add(newStudent);
        bottomPanel.add(existingStudent);
        bottomPanel.add(quit);

        this.add(mainPanel);
        setVisible(true);
    }

    public String getCourseName()
    {
        return name.getText();
    }

    public int getStudentId()
    {
        return Integer.parseInt(id.getText());
    }

}