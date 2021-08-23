import java.awt.image.DataBuffer;
import java.util.ArrayList;

public class builder  {

    public static void main(String[] args) {


        DbConnection con =  new DbConnection();
        for(ArrayList list: con.test()){
            System.out.println(list);
        }
    }

}