import java.awt.image.DataBuffer;

public class builder  {

    public static void main(String[] args) {

        Family fam = new Family();

//        System.out.println("==============");
//        System.out.println(fam.connectToDatabase().getPeople());
//        System.out.println("==============");
//        System.out.println();
//
//
//        for(int i=0;i < fam.connectToDatabase().getPeople().size();i++ ){
//            System.out.println(fam.connectToDatabase().getPeople().get(i).getInfo());
//        }
        DbConnection db = new DbConnection();
        db.getalltest();
    }

}