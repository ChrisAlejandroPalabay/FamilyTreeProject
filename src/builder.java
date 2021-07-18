import java.awt.image.DataBuffer;

public class builder  {

    public static void main(String[] args) {

        Family fam = new Family();

        System.out.println(fam.connectToDatabase().printTree());


    }

}