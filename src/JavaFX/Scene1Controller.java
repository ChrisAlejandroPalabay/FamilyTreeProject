package JavaFX;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Scene1Controller {

    @FXML
    public Button btn;
    public AnchorPane root;

    public void load(ActionEvent event) throws Exception{
        ImageView img = new ImageView("draku.jpg");
        img.setFitWidth(80);
        img.setFitHeight(80);
        root.getChildren().add(img);

    }
}

