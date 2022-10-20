package view;

import javax.swing.*;
import java.awt.*;

public class CatalogueView extends AppView {

    public DefaultListModel<Object> catalogue;
    public JList<Object> list;
    private GridBagConstraints c;

    public CatalogueView() {
        mainPanel.setLayout(new GridBagLayout());
        this.c = new GridBagConstraints();
        catalogue = new DefaultListModel<Object>();
        title.setText("All Available Courses Are Shown Below");
        titlePanel.add(title, BorderLayout.CENTER);
    }

    public void populateView() {

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 0.25;

        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(titlePanel, c);

        this.list = new JList<Object>(catalogue);
        c.weighty = 0.75;
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(this.list, c);

        c.weighty = 0.15;
        c.weightx = 0;
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(getNavPanel(), c);

        this.add(mainPanel);
        setVisible(true);
    }
}