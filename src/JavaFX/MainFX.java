package JavaFX;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class MainFX extends Application {

    public Button btn;
    public Label label;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try{
            Group root = new Group();
            root.getChildren().addAll(btn,label);
            Scene scene = new Scene(root);
            btn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    label.setText("Works");
                }
            });
            stage.setScene(scene);
            stage.setHeight(400);
            stage.setWidth(400);
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }

    }


}