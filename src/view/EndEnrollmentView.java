package view;

import javax.swing.*;
import java.awt.*;

public class EndEnrollmentView extends AppView {

    public JTextArea status;

    public EndEnrollmentView()
    {
        title.setText("End of Enrollment Information");
        status = new JTextArea(10,10);
        status.setEditable(false);

        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 0.15;

        c.gridx = 0;
        c.gridy = 0;
        titlePanel.add(title, BorderLayout.CENTER);
        mainPanel.add(titlePanel, c);

        c.weighty = 1.0;
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(getResultsPanel(status), c);

        c.gridx = 0;
        c.gridy = 4;
        mainPanel.add(getNavPanel(), c);

        this.add(mainPanel);
        setVisible(true);
    }

    public void setMessage(String msg)
    {
        status.setText(msg);
    }
}
