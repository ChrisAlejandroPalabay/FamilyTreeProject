import java.awt.image.DataBuffer;

public class builder  {

    public static void main(String[] args) {

        Family tree = new Family();
        tree.mapValuesFromDB();
        System.out.println(tree.printTree());
    }

}