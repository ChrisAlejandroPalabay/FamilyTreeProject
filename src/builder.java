import java.awt.image.DataBuffer;

public class builder  {

    public static void main(String[] args) {

        Family fam = new Family();


        fam.addFamilyMember("Ac Palabay");
        fam.addFamilyMember("Man Drake Palabay");

        fam.addFather("Ac Palabay","Man Drake Palabay");

        System.out.println(fam.printTree());


    }

}