package JavaFX;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Recap JavaFX");
        stage.show();
    }


}