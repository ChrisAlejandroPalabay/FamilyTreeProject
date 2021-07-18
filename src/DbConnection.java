
import java.sql.*;
import java.util.ArrayList;

public class DbConnection {

    private Connection con;
    private Statement st;
    private ResultSet rs;


    public DbConnection(){
        try{
            con = DriverManager.getConnection("jdbc:sqlite:family.db");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

//    public void insert(String fname, String lname, boolean g, String bday){
//        String query = "INSERT INTO familyMember(firstName,lastName,gender,birthday) VALUES(?,?,?,?)";
//        try{
//            PreparedStatement pstmt = con.prepareStatement(query);
//            pstmt.setString(1,fname);
//            pstmt.setString(2,lname);
//            pstmt.setBoolean(3,g);
//            pstmt.setString(4,bday);
//            pstmt.executeUpdate();
//            System.out.println("Insert Success");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    public ArrayList<FamilyMember> getFromfamilyMember(){
        ArrayList<FamilyMember> listOfPeople = new ArrayList<>();
        try{
            String query = "SELECT * from familyMember";
            st = con.createStatement();
            rs = st.executeQuery(query);

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                boolean gender = rs.getBoolean("gender");
                String bday = rs.getString("birthday");

                FamilyMember member = new FamilyMember(id,name,gender,bday);
                listOfPeople.add(member);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listOfPeople;
    }

    public ArrayList<Integer> getIdFromrelations(){
        ArrayList<Integer> list = new ArrayList();
        try {
            String query = "SELECT id FROM relations";
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                int id = rs.getInt("id");
                list.add(id);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Integer> getFatherFromrelations(){
        ArrayList<Integer> list = new ArrayList();
        try {
            String query = "SELECT father FROM relations";
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                int father = rs.getInt("father");
                list.add(father);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Integer> getMotherFromrelations(){
        ArrayList<Integer> list = new ArrayList();
        try {
            String query = "SELECT mother FROM relations";
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                int mother = rs.getInt("mother");
                list.add(mother);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Integer> getChildFromrelations(){
        ArrayList<Integer> list = new ArrayList();
        try {
            String query = "SELECT child FROM relations";
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                int child = rs.getInt("child");
                list.add(child);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }





//Test insert
    public void addSibling(String person){
        try{
            String q = "SELECT\n" +
                    "familyMember.id FROM familyMember WHERE familyMember.name = (SELECT familyMember.name FROM familyMember WHERE name = ?)";

            PreparedStatement prepStat = con.prepareStatement(q);
            prepStat.setString(1,person);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    //test


}
