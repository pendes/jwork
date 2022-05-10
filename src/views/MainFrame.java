package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainFrame extends JFrame {
    JPanel mainPanel;
    public DefaultComboBoxModel<String> rankModel;
    JComboBox<String> rankCombo;
    

    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }
    private void setMainComponent() {
        this.rankModel = new DefaultComboBoxModel<>();
        this.rankCombo = new JComboBox<>(rankModel);
        
    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(this.rankCombo);
    }
    private void setMainFrame() {
        this.add(this.mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setVisible(true);
    }
}
