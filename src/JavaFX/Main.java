package JavaFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) { launch(args); }

    public void start(Stage stage) throws Exception{

        Group root = new Group();
        Scene scene = new Scene(root);

        Text text = new Text();
        text.setX(100);
        text.setY(200);
        text.setText("Hello test");

        root.getChildren().add(text);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.setHeight(500);
        stage.setWidth(500);
        stage.setTitle("Kaya to palag lang");
        stage.show();

    }


}
