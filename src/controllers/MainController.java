package controllers;

import javafx.scene.control.Button;
import models.MainModel;
import views.MainPanel;

public class MainController {
    MainPanel mainPanel;
    MainModel mainModel;
    public MainController() {
        this.mainPanel = new MainPanel();
        this.mainModel = new MainModel();
        this.handleEvent();
    }
    public MainPanel getMainPanel() {
        return mainPanel;
    }
    public void handleEvent(){
        Button calcButton = this.mainPanel
        .getButtonPanel()
        .getCalcButton();
        calcButton.setOnAction(e -> onClickButton());
    }
    
    private void onClickButton(){
       
        String radiusStr = this.mainPanel.getRadiusPanel().getValue();
        String heightStr = this.mainPanel.getHeightPanel().getValue();
        double radius  = Double.parseDouble(radiusStr);
        double height  = Double.parseDouble(heightStr);
        Double volume = mainModel.calcConeVolume(radius, height);
        this.mainPanel.getVolumePanel().setValue(volume.toString());
        System.out.println(radiusStr);
    }
    
}
