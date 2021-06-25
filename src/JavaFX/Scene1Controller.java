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
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


public class Scene1Controller {

    //X=60
    //Y=50

    @FXML
    public AnchorPane root;
    public Button btnAdd;
    public Button btnNextLine;
    public double x;
    public double y;

    @FXML
    public void add(ActionEvent e){
        
        ImageView img = new ImageView("draku.jpg");
        img.setFitWidth(60);
        img.setFitHeight(60);

        Label lab1 = new Label("Draku");
        Label lab2 = new Label("Oct 7 1999");
        Label lab3 = new Label("The dog");

        VBox vBox = new VBox(lab1,lab2,lab3);


        HBox hBox = new HBox(img,vBox);
        hBox.setStyle("-fx-border-color: black;");
        hBox.fillHeightProperty();


        hBox.setLayoutX(x);
        hBox.setLayoutY(y);


        root.getChildren().add(hBox);

        x+=140;

    }
    public void nextLine(ActionEvent e){
        x = 0;
        y += 70;
    }

    public void createLine(ActionEvent e){
        Random r = new Random();
        int num = r.nextInt(200-1)+1;
        int num2 = r.nextInt(200-1)+1;;
        Line line = new Line();
        line.setStartX(num);
        line.setEndX(num2);
        line.setStartY(num);
        line.setEndY(num2);

        root.getChildren().add(line);

    }


}
