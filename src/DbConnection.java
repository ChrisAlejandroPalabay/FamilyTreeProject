
import java.sql.*;
import java.util.ArrayList;

public class DbConnection {

    private Connection con;
    private Statement st;
    private ResultSet rs;


    public DbConnection(){
        try{
            con = DriverManager.getConnection("jdbc:sqlite:family.db");
            System.out.println("Connected");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void insert(String fname, String lname, boolean g, String bday){
        String query = "INSERT INTO familyMember(firstName,lastName,gender,birthday) VALUES(?,?,?,?)";
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,fname);
            pstmt.setString(2,lname);
            pstmt.setBoolean(3,g);
            pstmt.setString(4,bday);
            pstmt.executeUpdate();
            System.out.println("Insert Success");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<FamilyMember> getData(){
        ArrayList<FamilyMember> list = new ArrayList<>();
        try{
            String query = "SELECT * from familyMember";
            st = con.createStatement();
            rs = st.executeQuery(query);
            System.out.println("Records from Database");
            while(rs.next()){
                String fname = rs.getString("firstName");
                String lname = rs.getString("lastName");
                boolean gender = rs.getBoolean("gender");
                String bday = rs.getString("birthday");

                FamilyMember temp = new FamilyMember(fname,lname,gender);
                list.add(temp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<String> getChild(){
        ArrayList<String> list = new ArrayList<>();
        try{
            for(int i=0;i<8;i++){
                String query = "SELECT familyMember.firstName, familyMember.lastName FROM familyMember RIGHT JOIN relations ON familyMember.id = relations.child";
                st = con.createStatement();
                rs = st.executeQuery(query);
                while(rs.next()){
                    String name = rs.getString("child");
                    list.add(name);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
