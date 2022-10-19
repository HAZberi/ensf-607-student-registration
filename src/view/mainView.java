package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame {

    public JButton login;
    public JButton quit;
    public JButton searchCourse;
    public JButton addCourse;
    public JButton removeCourse;
    public JButton viewAllCourses;
    public JButton viewCourses;
    public JLabel title;

    public MainView() {
        super("Course Registration System");

        JPanel mainPanel = new JPanel();
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addCourse = new JButton("Add Course");
        searchCourse = new JButton("Search Course");
        removeCourse = new JButton("Remove Course");
        viewAllCourses = new JButton("View All Courses");
        viewCourses = new JButton("View Your Courses");

        login = new JButton("Log In");
        quit = new JButton("Quit");

        title = new JLabel("Please Select From One Of The Options Below");

        JPanel topPanel = new JPanel();
        JPanel topCenterPanel = new JPanel();
        JPanel bottomCenterPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        mainPanel.add(topPanel);
        mainPanel.add(topCenterPanel);
        mainPanel.add(bottomCenterPanel);
        mainPanel.add(bottomPanel);

        topPanel.add(title);
        topCenterPanel.add(searchCourse);
        topCenterPanel.add(addCourse);
        topCenterPanel.add(removeCourse);
        bottomCenterPanel.add(viewAllCourses);
        bottomCenterPanel.add(viewCourses);
        bottomPanel.add(login);
        bottomPanel.add(quit);

        this.add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        MainView myGui = new MainView();

    }
}