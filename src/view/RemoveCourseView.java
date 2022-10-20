package view;

import javax.swing.*;
import java.awt.*;

public class RemoveCourseView extends AppView {

    public JButton drop;

    public JTextField name;
    public JLabel enterName;

    public JTextField id;
    public JLabel enterId;

    public JTextField message;

    public RemoveCourseView()
    {

        drop = new JButton("Drop");
        name = new JTextField(10);
        enterName = new JLabel("Enter Course Name");
        id = new JTextField(10);
        enterId = new JLabel("Enter Course ID");
        title.setText("Proceed With Dropping Course Below");
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
        mainPanel.add(getFormInputSubmitPanel(enterId, id, drop), c);

        c.weighty = 1.0;
        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(getMessagePanel(message), c);

        c.gridx = 0;
        c.gridy = 4;
        mainPanel.add(getNavPanel(), c);
        
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