package view;

import javax.swing.*;
import java.awt.*;

public class AppView extends JFrame {

    protected JPanel mainPanel;
    public JButton mainMenu;
    public JButton quit;

    public AppView() {
        super("Course Registration System");

        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.mainPanel = new JPanel();
        this.mainPanel.setPreferredSize(new Dimension(600,400));

        this.mainMenu = new JButton("Main Menu");
        this.quit = new JButton("Quit");
    }
}