
public class builder  {

    public static void main(String[] args) {

        Family fam = new Family();
        fam.addFamilyMember(new FamilyMember("Ac","Palabay",true));
        fam.addFamilyMember(new FamilyMember("Draku","Palabay",true));
        fam.addSibling("Ac Palabay", "Draku Palabay");

        System.out.println(fam.printTree());

        for(FamilyMember p:fam.connectToDatabase()){
            System.out.println(p);
        }

    }

}