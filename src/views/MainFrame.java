package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;


public class MainFrame extends JFrame {
    JPanel mainPanel;
    public DefaultComboBoxModel<String> rankModel;
    public JComboBox<String> rankCombo;

    public DefaultListModel<String> employeeModel;
    public JList<String> employeeList;

    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }
    private void setMainComponent() {
        this.rankModel = new DefaultComboBoxModel<>();
        this.rankCombo = new JComboBox<>(this.rankModel);

        this.employeeModel = new DefaultListModel<>();
        this.employeeList = new JList<>(this.employeeModel);
        
    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(this.rankCombo, BorderLayout.NORTH);
        this.mainPanel.add(this.employeeList, BorderLayout.CENTER);
    }
    private void setMainFrame() {
        this.add(this.mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setVisible(true);
    }
}
