package JavaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    public ImageView img;
    public double x;
    public double y;


    public void up(ActionEvent e){
        img.setY(y-=2);
        System.out.println("moving UP");
    }
    public void down(ActionEvent e){
        img.setY(y+=2);
        System.out.println("moving DOWN");
    }
    public void left(ActionEvent e){
        img.setX(x-=2);
        System.out.println("moving LEFT");
    }
    public void right(ActionEvent e){
        img.setX(x+=2);
        System.out.println("moving RIGHT");
    }
}
