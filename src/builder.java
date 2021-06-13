
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class builder extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{

        Group root = new Group();
        Scene scene = new Scene(root, Color.LAVENDERBLUSH);


        Text text = new Text();
        text.setText("Testing langs");
        text.setX(100);
        text.setY(200);
        text.setFont(Font.font("Century Gothic",50));

        Line line = new Line();
        line.setStartX(800);
        line.setStartY(300);
        line.setEndX(300);
        line.setEndY(100);

        root.getChildren().add(text);
        root.getChildren().add(line);

        //stage.setFullScreen(true);
        //stage.setFullScreenExitHint("Pindot q para lab mo q");
        //stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setTitle("Ac Application");
        stage.getIcons().add(new Image("draku.jpg"));
        stage.setHeight(800);
        stage.setWidth(900);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}