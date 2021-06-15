package JavaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
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
}
