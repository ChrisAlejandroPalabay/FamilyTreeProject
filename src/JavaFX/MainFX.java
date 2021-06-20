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
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class MainFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception{

        stage.setTitle("Stack Pane");
        stage.setWidth(600);
        stage.setWidth(600);

        ImageView img = new ImageView("JavaFX/trees.jpg");
        img.setFitHeight(80);
        img.setFitWidth(80);
        Label label = new Label("Tress");
        StackPane root = new StackPane(img,label);

        root.setLayoutX(313);
        root.setLayoutY(240);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}