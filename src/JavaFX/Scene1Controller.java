package JavaFX;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;



public class Scene1Controller {

    public ImageView img;
    public double x;
    public double y;

    @FXML
    public void up(ActionEvent e){
        img.setX(x+=4);
    }
    public void down(ActionEvent e){
        img.setX(x-=4);
    }
    public void left(ActionEvent e){
        img.setY(y-=4);
    }
    public void right(ActionEvent e){
        img.setY(y+=4);
    }
}
