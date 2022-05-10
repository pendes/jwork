package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.setEvents();
        this.setMainFrame(); 
    }
    private void setEvents() {
        this.mainFrame.rankCombo.addActionListener(event -> actionRankCombo());
    }
    private void actionRankCombo() {
        int selected = this.mainFrame.rankCombo.getSelectedIndex();
        this.mainFrame.employeeModel.clear();
        this.mainModel.employeeList.forEach(employee -> {
            if(employee.rankId == selected) {
                this.mainFrame.employeeModel.addElement(employee.name);
            }
        });
    }
    private void setMainFrame() {
        this.mainModel.rankList.forEach(rank -> {
            this.mainFrame.rankModel.addElement(rank.name);
        });
    }
    
}
