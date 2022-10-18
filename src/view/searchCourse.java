package view;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class searchCourse extends JFrame {

    public JButton search;
    public JButton mainMenu;
    public JButton quit;

    public JTextField name;
    public JLabel enterName;

    public JTextField id;
    public JLabel enterId;

    public JLabel title;

    public JTextArea course;

    public searchCourse()
    {
        super("Start");

        JPanel mainPanel = new JPanel();
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        search = new JButton("Search Course");
        mainMenu = new JButton("Main Menu");
        quit = new JButton("Quit");
        name = new JTextField(10);
        enterName = new JLabel("Enter Course Name");
        id = new JTextField(10);
        enterId = new JLabel("Enter Course ID");
        title = new JLabel("Proceed With Searching For Course Below");
        course = new JTextArea(10,10);
       

        JPanel topPanel = new JPanel();
		JPanel topCenterPanel = new JPanel();
        JPanel bottomCenterPanel = new JPanel();
        JPanel topBottomPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
        mainPanel.add(topPanel);
        mainPanel.add(topCenterPanel);
        mainPanel.add(bottomCenterPanel);
        mainPanel.add(topBottomPanel);
        mainPanel.add(bottomPanel);

        topPanel.add(title);
        topCenterPanel.add(enterName);
        topCenterPanel.add(name);
        bottomCenterPanel.add(enterId);
        bottomCenterPanel.add(id);
        topBottomPanel.add(course);
        bottomPanel.add(search);
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

    public void setOutput (String courseInfo){
        course.setText(courseInfo);
    }

    


}