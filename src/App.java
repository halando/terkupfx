import java.util.Stack;

import controllers.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import views.MainPanel;

public class App extends Application{
    public static void main(String[] args) throws Exception {
       launch(args);

    }

    
    @Override
    public void start(Stage stage) throws Exception {
       // StackPane stackPane = new StackPane();
       // MainPanel mainPanel = new MainPanel();
       MainController mainController = new MainController();
       MainPanel mainPanel = mainController.getMainPanel();
        Scene scene = new Scene(mainPanel);
        stage.setScene(scene);
        stage.show();
      
    }
}
