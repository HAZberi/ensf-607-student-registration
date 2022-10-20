package view;

import javax.swing.*;
import java.awt.*;

public class AppView extends JFrame {

    protected JPanel mainPanel;
    public JButton mainMenu;
    public JButton quit;
    protected JLabel title;
    protected JPanel titlePanel;

    public AppView() {
        super("Course Registration System");

        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.mainPanel = new JPanel();
        this.mainPanel.setPreferredSize(new Dimension(600,400));

        this.mainMenu = new JButton("Main Menu");
        this.quit = new JButton("Quit");

        this.title = new JLabel();
        this.titlePanel = new JPanel();
    }

    public JPanel getFormInputPanel(JLabel title, JTextField field) {
        JPanel formInputPanel = new JPanel();
        formInputPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        formInputPanel.add(title);
        formInputPanel.add(field);

        return formInputPanel;
    }

    public JPanel getFormInputSubmitPanel(JLabel title, JTextField field, JButton submit){
        JPanel formInputSubmitPanel = new JPanel();
        formInputSubmitPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        formInputSubmitPanel.add(title);
        formInputSubmitPanel.add(field);
        formInputSubmitPanel.add(submit);

        return formInputSubmitPanel;
    }

    public JPanel getResultsPanel(JTextArea textpane){
        JPanel resultsPanel = new JPanel();
        resultsPanel.setLayout(new BorderLayout()); // give your JPanel a BorderLayout
        JLabel heading = new JLabel("RESULTS");
        heading.setHorizontalAlignment(JLabel.CENTER);
        resultsPanel.add(heading, BorderLayout.PAGE_START);
        JScrollPane scroll = new JScrollPane(textpane); // place the JTextArea in a scroll pane
        resultsPanel.add(scroll, BorderLayout.CENTER);

        return resultsPanel;
    }

    public JPanel getNavPanel(){
        JPanel navPanel = new JPanel();
        navPanel.setLayout(new GridBagLayout());
        GridBagConstraints s = new GridBagConstraints();
        s.fill = GridBagConstraints.BOTH;
        s.weightx = 1.0;
        s.weighty = 1.0;

        s.gridx = 0;
        s.gridy = 0;
        navPanel.add(mainMenu, s);

        s.gridx = 1;
        s.gridy = 0;
        navPanel.add(quit, s);

        return navPanel;
    }

}