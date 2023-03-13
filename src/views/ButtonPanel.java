package views;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonPanel extends HBox {
    Button calcButton;
    
    public ButtonPanel() {
       this.initComponent();
       this.setComponent();
       this.addComponent();
       this.setButtonPanel();
    }
    private void initComponent(){
        this.calcButton = new Button();
    }
    private void setComponent(){
        HBox.setMargin(calcButton, new Insets(10,10,10,10));

    }
    private void addComponent(){
        this.getChildren().add(this.calcButton);
    }
    public void setCalcButtonText(String text){
        this.calcButton.setText(text);
    }
    private void setButtonPanel(){
        this.setAlignment(Pos.CENTER);
    }
    public Button getCalcButton() {
        return calcButton;
    }
}
