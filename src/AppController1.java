import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class AppController1 {

    @FXML
    public AnchorPane root;
    public Button btn;


    public void load(ActionEvent e) throws Exception{
        ImageView img = new ImageView("draku.jpg");
        img.setFitWidth(80);
        img.setFitHeight(80);
        root.getChildren().add(img);
    }

}

