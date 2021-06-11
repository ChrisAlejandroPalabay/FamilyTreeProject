
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
