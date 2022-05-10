package controllers;

import models.MainModel;
import models.Rank;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.setMainFrame();        
    }
    private void setMainFrame() {
        // this.mainModel.rankList.iterator().forEachRemaining(a -> {            
        //     this.mainFrame.rankModel.addElement(a.name);
        // });
        for(Rank rank : this.mainModel.rankList) {
            this.mainFrame.rankModel.addElement(rank.name);
        }
        
    }
    
}
