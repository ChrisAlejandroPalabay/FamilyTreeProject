public class Main {

    public static void main(String[] args) {


        Family family = new Family();

        family.addFamilyMember(new FamilyMember("Father","Palabay",true));
        family.addFamilyMember(new FamilyMember("Mother","Palabay",false));
        family.addFamilyMember(new FamilyMember("Ac","Palabay",true));
        family.addFamilyMember(new FamilyMember("Draku","Palabay",true));



        family.addSibling("Ac Palabay","Draku Palabay");
        family.addPartner("Mother Palabay","Father Palabay");

        System.out.println(family.printFamily("Ac Palabay"));


    }

    public static FamilyMember person(String fname,String lname, boolean gender){

        FamilyMember temp = new FamilyMember(fname,lname,gender);
        return temp;
    }


}