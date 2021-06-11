
import java.sql.*;

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

    public void getData(){
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

                System.out.println(fname +" "+lname+" "+gender+" "+bday);
                System.out.println();
                FamilyMember temp = new FamilyMember(fname,lname,gender);
                System.out.println(temp.getFullName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
