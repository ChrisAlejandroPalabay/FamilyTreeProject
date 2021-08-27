import java.awt.image.DataBuffer;
import java.util.ArrayList;

public class builder  {

    public static void main(String[] args) {

       Family tree =  new Family();
       tree.mapValues();
        System.out.println(tree.printTree());

        DbConnection con = new DbConnection();

        for(ArrayList v:con.relationsValues()){
            System.out.println(v);
        }

    }

}