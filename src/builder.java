
public class builder  {

    public static void main(String[] args) {

        Family fam = new Family();


        System.out.println(fam.printTree());

        for(String p:fam.connectToDatabase()){
            System.out.println(p);
        }

    }

}