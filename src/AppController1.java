import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;


public class AppController1 {

    @FXML
    public AnchorPane root;
    public TextArea textArea;

    public void load(ActionEvent e){
        DbConnection conn = new DbConnection();
        for(FamilyMember person: conn.getData()){
            textArea.setText(person.getFullName());
        }
    }
}

