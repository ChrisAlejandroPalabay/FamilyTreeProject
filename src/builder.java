import java.awt.image.DataBuffer;

public class builder  {

    public static void main(String[] args) {

        DbConnection con = new DbConnection();
        for(String d: con.getData()){
            System.out.println(d);
        }

    }

}