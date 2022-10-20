package view;

import javax.swing.*;
import java.awt.*;

public class AddCourseView extends AppView {

    public JButton addCourse;

    public JTextField name;
    public JLabel enterName;

    public JTextField section;
    public JLabel enterSection;

    public JTextField id;
    public JLabel enterId;

    public JTextField message;

    public AddCourseView() {
        addCourse = new JButton("Add");
        name = new JTextField(10);
        enterName = new JLabel("Enter Course Name:");
        id = new JTextField(10);
        enterId = new JLabel("Enter Course ID:");
        section = new JTextField(10);
        enterSection = new JLabel("Enter Section:");
        title.setText("Proceed With Adding Course Below");
        message = new JTextField(40);

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
        mainPanel.add(getFormInputPanel(enterId, id), c);

        c.weighty = 1.0;
        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(getFormInputSubmitPanel(enterSection, section, addCourse), c);

        c.weighty = 1.0;
        c.gridx = 0;
        c.gridy = 4;
        mainPanel.add(getMessagePanel(message), c);

        c.gridx = 0;
        c.gridy = 5;
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

    public int getSection() {
        return Integer.parseInt(section.getText());
    }

    public void setMessage(String msg) {
        message.setText(msg);
    }
}