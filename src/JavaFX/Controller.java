package JavaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Controller {

    @FXML
    public Parent root;
    public Scene scene;
    public Stage stage;
    public ImageView img;
    public TextArea txtarea;
    public double x;
    public double y;




    public void up(ActionEvent e){
        img.setY(y-=3.5);
        txtarea.setText("Draku is going UP");
    }
    public void down(ActionEvent e){
        img.setY(y+=3.5);
        txtarea.setText("Draku is going DOWN");
    }
    public void left(ActionEvent e){
        img.setX(x-=3.5);
        txtarea.setText("Draku is going LEFT");
    }
    public void right(ActionEvent e){
        img.setX(x+=3.5);
        txtarea.setText("Draku is going RIGHT");
    }

    public void switchToScene2(ActionEvent e) throws Exception{

        root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}
