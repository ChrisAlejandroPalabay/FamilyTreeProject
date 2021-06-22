package JavaFX;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;


public class Scene1Controller {

    //X=60
    //Y=50

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
        HBox hbox = new HBox(img,vBox);
        hbox.prefHeight(60);
        hbox.prefWidth(200);
        hbox.setStyle("-fx-border-color: black;");
        hbox.setLayoutX(x+=30);
        hbox.setLayoutY(y);

        MainFX.root.getChildrenUnmodifiable().add(hbox);

    }
    public void nextLine(ActionEvent e){
        y =+ 40;
    }
}
