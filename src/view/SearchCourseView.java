package view;

import javax.swing.*;
import java.awt.*;

public class SearchCourseView extends AppView {

    public JButton search;

    public JTextField name;
    public JLabel enterName;

    public JTextField id;
    public JLabel enterId;

    public JTextArea course;

    public SearchCourseView() {
        search = new JButton("Search");
        name = new JTextField(10);
        enterName = new JLabel("Enter Course Name:");
        id = new JTextField(10);
        enterId = new JLabel("Enter Course ID:");

        title.setText("Proceed With Searching For Course Below");
        course = new JTextArea(10, 10);

        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 0.15;

        c.gridx = 0;
        c.gridy = 0;
        titlePanel.add(title, BorderLayout.CENTER);
        mainPanel.add(titlePanel, c);

        c.weighty = 0.15;
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(getFormInputPanel(enterName, name), c);

        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(getFormInputSubmitPanel(enterId, id, search), c);

        c.weighty = 1.0;
        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(getResultsPanel(course), c);

        c.gridx = 0;
        c.gridy = 4;
        mainPanel.add(getNavPanel(), c);

        this.add(mainPanel);
        setVisible(true);
    }

    public String getCourseName() {
        return name.getText();
    }

    public int getCourseId() {
        return Integer.parseInt(id.getText());
    }

    public void setOutput(String courseInfo) {
        course.setText(courseInfo);
    }

}