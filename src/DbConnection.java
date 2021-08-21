
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

    public ArrayList<String> getData(){
        ArrayList<String> data = new ArrayList<>();
        String query = "SELECT * FROM familyMember";

        try{
            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()){
                String d = rs.getString("name");
                data.add(d);
            }
        }catch(Exception e){
            e.printStackTrace();
        }


        return data;

    }

}
