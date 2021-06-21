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

        stage.setTitle("Stack Pane");
        stage.setWidth(800);
        stage.setHeight(800);

        ImageView img = new ImageView("draku.jpg");
        img.setFitHeight(80);
        img.setFitWidth(80);
        Label label = new Label("Draku");
        Label label2 = new Label("Draku");
        Label label3 = new Label("Draku");

        VBox vbox = new VBox(label,label2,label3);

        HBox hbox = new HBox(img, vbox);
        hbox.prefHeight(60);
        hbox.prefWidth(200);
        hbox.setLayoutX(200);
        hbox.setLayoutY(200);
        hbox.setStyle("-fx-border-color: black;");

        Group root = new Group();
        root.getChildren().add(hbox);



        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}