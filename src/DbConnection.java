
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

    public ArrayList<FamilyMember> getData(){
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


    public ArrayList<String> getPersons(){
        ArrayList<String> list = new ArrayList<>();
        try{
            String query = "SELECT familyMember.name FROM familyMember";
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                String name = rs.getString("name");
                list.add(name);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<String> getFamilyMembers(){
        ArrayList<String> list = new ArrayList<>();
        try{
            String query = "SELECT familyMember.name FROM familyMember INNER JOIN relations ON familyMember.id = relations.id";
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                String name = rs.getString("name");
                list.add(name);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<String> getFathers(){
        ArrayList<String> list = new ArrayList<>();
        try{
            String query = "SELECT familyMember.name FROM familyMember INNER JOIN relations ON familyMember.id = relations.father;";
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                String name = rs.getString("name");
                list.add(name);
            }

        }catch (Exception e){
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

}
