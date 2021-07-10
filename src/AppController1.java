import com.google.common.collect.Multimap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class AppController1 {

    @FXML
    public AnchorPane root;
    public Button btn;
    public double x;
    public double y;


    public void load(ActionEvent e) throws Exception{
        ImageView img = new ImageView("draku.jpg");
        img.setFitWidth(80);
        img.setFitHeight(80);
        root.getChildren().add(img);

    }

    public void generateTree(ActionEvent e) throws Exception{
        Family fam = new Family();
        fam.addFamilyMember(new FamilyMember("Ac","Palabay",true));
        fam.addFamilyMember(new FamilyMember("Father","Palabay",true));
        fam.addFamilyMember(new FamilyMember("Mother","Palabay",true));
        fam.addFamilyMember(new FamilyMember("Brother","Palabay",true));

        int times = 4;
        for(int i=0;i<times;i++){
            VBox vBox = new VBox();

            Label l1 = new Label("Person");

            ImageView img = new ImageView("draku.jpg");
            img.setFitHeight(80);
            img.setFitWidth(80);

            vBox.getChildren().addAll(img,l1);
            vBox.setLayoutX(x);
            vBox.setLayoutY(y);
            root.getChildren().add(vBox);
            x+=5;
            y+=8;
            System.out.println("clicked");
        }
    }


}

