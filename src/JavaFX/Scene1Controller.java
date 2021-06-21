package JavaFX;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;


public class Scene1Controller {

    public HBox box;
    public double x;
    public double y;

    @FXML
    public void up(ActionEvent e){
        box.setLayoutX(x+=4);
    }
    public void down(ActionEvent e){
        box.setLayoutX(x-=4);
    }
    public void left(ActionEvent e){
        box.setLayoutY(y-=4);
    }
    public void right(ActionEvent e){
        box.setLayoutY(y+=4);
    }
}
