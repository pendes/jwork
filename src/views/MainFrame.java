package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class MainFrame extends JFrame {
    JPanel mainPanel;
    public DefaultComboBoxModel<String> rankModel;
    public JComboBox<String> rankCombo;

    public DefaultListModel<String> employeeModel;
    public JList<String> employeeList;
    JScrollPane employeeScroll;

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
        this.employeeScroll = new JScrollPane(this.employeeList);
        this.employeeScroll.setPreferredSize(new Dimension(200, 200));
    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(this.rankCombo, BorderLayout.NORTH);
        this.mainPanel.add(this.employeeScroll, BorderLayout.CENTER);
    }
    private void setMainFrame() {
        this.add(this.mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setSize(300, 400);
        this.pack();
        this.setVisible(true);
    }
}
