package JavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class MainFX extends Application {

    public static void main(String[] args) { launch(args); }

    public void start(Stage stage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene scene = new Scene(root);

        //css
        String css = this.getClass().getResource("application.css").toExternalForm();

        scene.getStylesheets().add(css);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Kaya to palag lang");
        stage.show();

    }


}
