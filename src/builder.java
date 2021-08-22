import java.awt.image.DataBuffer;

public class builder  {

    public static void main(String[] args) {

        Family tree = new Family();
        tree.connectToDb();
        System.out.println(tree.printTree());
        System.out.println("=======");
        System.out.println(tree.printFamily("Ac Oliver"));
    }

}