package JavaFX;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class MainFX extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}