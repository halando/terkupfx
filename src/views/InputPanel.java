package views;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class InputPanel  extends HBox{
    Label label; 
    TextField field;
    public InputPanel(){
        this.initComponent();
        this.addComponent();
        this.setInputPanel();
    }
    private void initComponent(){
        this.label = new Label();
        this.field = new TextField();
        this.label.setMinWidth(100);
        HBox.setMargin(this.label, new Insets(10,10,10,10));
        HBox.setMargin(this.field, new Insets(0,10,0,10));
        this.label.setAlignment(Pos.CENTER_RIGHT);
    }
    private void addComponent(){
        this.getChildren().add(this.label);
        this.getChildren().add(this.field);
    }
    private void setInputPanel(){
        this.setAlignment(Pos.CENTER);
    }
    public void setText(String text){
        this.label.setText(text);
    }
    public String getText(){
        return this.label.getText();
    
    }
    public void setValue(String text){
        this.field.setText(text);
    }
    public String getValue(){
        return this.field.getText();
    }
}
