package view;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

    public JButton login;
    public JButton quit;
    public JButton searchCourse;
    public JButton addCourse;
    public JButton removeCourse;
    public JButton viewAllCourses;
    public JButton viewCourses;
    public JButton endEnrollment;
    public JLabel title;

    public MainView() {
        super("Course Registration System");

        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(600,400));
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 0.5;
        
        addCourse = new JButton("Add Course");
        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(addCourse, c);

        searchCourse = new JButton("Search Course");
        c.gridx = 1;
        c.gridy = 0;
        mainPanel.add(searchCourse, c);

        removeCourse = new JButton("Remove Course");
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(removeCourse, c);

        viewAllCourses = new JButton("View All Courses");
        c.gridx = 1;
        c.gridy = 1;
        mainPanel.add(viewAllCourses, c);

        viewCourses = new JButton("View Your Courses");
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(viewCourses, c);

        endEnrollment = new JButton("End Enrollment");
        c.gridx = 1;
        c.gridy = 2;
        mainPanel.add(endEnrollment, c);

        quit = new JButton("Quit");
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        c.weightx = 1.0;
        c.weighty = 0.5;
        mainPanel.add(quit, c);

        this.add(mainPanel);
        setVisible(true);
    }
}