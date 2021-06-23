package JavaFX;


import javafx.event.ActionEvent;
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

import java.net.URL;
import java.util.ResourceBundle;


public class Scene1Controller {

    //X=60
    //Y=50

    public Pane root;
    public Button btnAdd;
    public Button btnNextLine;
    public double x;
    public double y;

    @FXML
    public void add(ActionEvent e){
        ImageView img = new ImageView("draku.jpg");
        img.setFitWidth(60);
        img.setFitWidth(60);

        Label lab1 = new Label("Draku");
        Label lab2 = new Label("Oct 7 1999");
        Label lab3 = new Label("The dog");

        VBox vBox = new VBox(lab1,lab2,lab3);


        HBox hBox = new HBox(vBox);
        hBox.setStyle("-fx-border-color: black;");
        hBox.fillHeightProperty();
        hBox.setLayoutX(x+=30);
        hBox.setLayoutY(y);


        root.getChildren().add(vBox);


    }
    public void nextLine(ActionEvent e){
        x = 0;
        y =+ 40;
    }


}
