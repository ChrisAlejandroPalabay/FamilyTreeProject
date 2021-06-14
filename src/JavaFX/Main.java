package JavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) { launch(args); }

    public void start(Stage stage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene scene = new Scene(root);


        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Kaya to palag lang");
        stage.show();

    }


}
