package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addCourse extends JFrame {

    public JButton add;
    public JButton mainMenu;
    public JButton quit;

    public JTextField name;
    public JLabel enterName;

    public JTextField id;
    public JLabel enterId;

    public JLabel title;
    public JTextField message;

    public addCourse()
    {
        super("Start");

        JPanel mainPanel = new JPanel();
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add = new JButton("Add Course");
        mainMenu = new JButton("Main Menu");
        quit = new JButton("Quit");
        name = new JTextField(10);
        enterName = new JLabel("Enter Course Name");
        id = new JTextField(10);
        enterId = new JLabel("Enter Course ID");
        title = new JLabel("Proceed With Adding Course Below");
        message = new JTextField();


        JPanel topPanel = new JPanel();
		JPanel topCenterPanel = new JPanel();
        JPanel bottomCenterPanel = new JPanel();
        JPanel topBottomPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
        mainPanel.add(topPanel);
        mainPanel.add(topCenterPanel);
        mainPanel.add(bottomCenterPanel);
        mainPanel.add(bottomPanel);
        mainPanel.add(topBottomPanel);

        topPanel.add(title);
        topCenterPanel.add(enterName);
        topCenterPanel.add(name);
        bottomCenterPanel.add(enterId);
        bottomCenterPanel.add(id);
        topBottomPanel.add(message);
        bottomPanel.add(add);
        bottomPanel.add(mainMenu);
        bottomPanel.add(quit);

        this.add(mainPanel);
        setVisible(true);
    }

    public String getCourseName()
    {
        return name.getText();
    }

    public int getCourseId()
    {
        return Integer.parseInt(id.getText());
    }

    public void setMessage(String msg)
    {
        message.setText(msg);
    }
}