package view;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentInfo extends AppView {

    public JButton newStudent;
    public JButton existingStudent;
    public JButton newStudentSubmit;
    public JButton existingStudentSubmit;

    public JTextField name;
    public JLabel enterName;

    public JTextField id;
    public JTextField existingId;
    public JLabel enterId;
    public JLabel enterExistingId;

    public JPanel emptyPanel;
    public JTextField message;

    public JPanel panelViews;
    public CardLayout panelViewLayout;
    public JPanel newSubmitForm;
    public JPanel existingForm;

    GridBagConstraints c;

    public StudentInfo() {
        newStudent = new JButton("New");
        existingStudent = new JButton("Existing");
        name = new JTextField(15);
        enterName = new JLabel("Enter your name:");
        id = new JTextField(15);
        enterId = new JLabel("Enter your student ID:");
        existingId = new JTextField(15);
        enterExistingId = new JLabel("Enter student ID:");
        emptyPanel = new JPanel();
        message = new JTextField(40);

        existingStudentSubmit = new JButton("Submit");
        existingForm = getFormInputSubmitPanel(enterExistingId, existingId, existingStudentSubmit);

        getPanelView();

        newStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelViewLayout.show(panelViews, "New Student");
            }
        });
        existingStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelViewLayout.show(panelViews, "Existing Student");
            }
        });

        title.setText("Please Select Your Status");

        mainPanel.setLayout(new GridBagLayout());
        c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;

        c.gridx = 0;
        c.gridy = 0;
        titlePanel.add(title, BorderLayout.CENTER);
        mainPanel.add(titlePanel, c);

        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(getSpacedButtons(existingStudent, newStudent), c);

        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(panelViews, c);

        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(getNavPanel(), c);

        panelViewLayout.show(panelViews, "Empty");

        this.add(mainPanel);
        setVisible(true);
    }

    private void getPanelView() {
        panelViewLayout = new CardLayout();
        panelViews = new JPanel(panelViewLayout);
        panelViews.add(existingForm, "Existing Student");
        panelViews.add(getNewForm(), "New Student");
        panelViews.add(getMessagePanel(message), "Message");
        panelViews.add(emptyPanel, "Empty");
    }

    private JPanel getNewForm() {
        newStudentSubmit = new JButton("Submit");
        newSubmitForm = getFormInputSubmitPanel(enterId, id, newStudentSubmit);
        JPanel input = getFormInputPanel(enterName, name);

        JPanel newForm = new JPanel();
        newForm.setLayout(new GridBagLayout());
        GridBagConstraints s = new GridBagConstraints();
        s.fill = GridBagConstraints.BOTH;
        s.weightx = 1.0;
        s.weighty = 1.0;
        s.gridx = 0;
        s.gridy = 0;
        newForm.add(input, s);

        s.gridx = 0;
        s.gridy = 1;
        newForm.add(newSubmitForm, s);

        return newForm;
    }

    private JPanel getSpacedButtons(JButton button1, JButton button2) {
        JPanel spacedButtons = new JPanel();
        spacedButtons.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 1));
        button1.setPreferredSize(new Dimension(200, 50));
        button2.setPreferredSize(new Dimension(200, 50));
        spacedButtons.add(button1);
        spacedButtons.add(button2);

        return spacedButtons;
    }

    public String getStudentName() {
        return name.getText();
    }

    public int getStudentId() {
        return Integer.parseInt(id.getText());
    }

    public int getExistingStudentId() {
        return Integer.parseInt(existingId.getText());
    }

    public void setMessage(String msg) {
        message.setText(msg);
        panelViewLayout.show(panelViews, "Message");
    }

}