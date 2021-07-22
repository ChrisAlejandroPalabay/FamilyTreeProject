import java.awt.image.DataBuffer;

public class builder  {

    public static void main(String[] args) {

        Family fam = new Family();

        fam.connectToDatabase();
        System.out.println(fam.printTree());

    }

}