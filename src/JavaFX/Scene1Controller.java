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
        vBox.setMaxHeight(60);
        vBox.setMaxWidth(60);

        HBox hbox = new HBox(img,vBox);
        hbox.prefHeight(60);
        hbox.prefWidth(60);
        hbox.setMaxHeight(60);
        hbox.setMaxWidth(60);

        hbox.setStyle("-fx-border-color: black;");
        hbox.setLayoutX(x);
        hbox.setLayoutY(y);

        root.getChildren().add(hbox);


    }
    public void nextLine(ActionEvent e){
        y =+ 40;
    }
    public void toRight(ActionEvent e){
        
    }

}
