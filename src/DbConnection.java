
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;

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

    public ArrayList<FamilyMember> getFamilyMembers(){
        ArrayList<FamilyMember> list = new ArrayList<FamilyMember>();
        try{
            String query = "SELECT *\n" +
                    "FROM familyMember";
            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                boolean gender = rs.getBoolean("gender");
                String bday = rs.getString("birthday");

                list.add(new FamilyMember(id,name,gender,bday));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<String> getRelationsName(){
        ArrayList<String> data = new ArrayList<>();
        String query = "SELECT *\n" +
                "FROM\n" +
                "  relations r\n" +
                "  INNER JOIN familyMember n ON r.id = n.id\n" +
                "  INNER JOIN familyMember f ON r.father = f.id\n" +
                "  INNER JOIN familyMember m ON r.mother = m.id\n" +
                "  INNER JOIN familyMember c ON r.child = c.id;\n";

        try{
            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()){
                String d = rs.getString(6);
                data.add(d);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return data;

    }
    public ArrayList<String> getRelationsFather(){
        ArrayList<String> data = new ArrayList<>();
        String query = "SELECT *\n" +
                "FROM\n" +
                "  relations r\n" +
                "  INNER JOIN familyMember n ON r.id = n.id\n" +
                "  INNER JOIN familyMember f ON r.father = f.id\n" +
                "  INNER JOIN familyMember m ON r.mother = m.id\n" +
                "  INNER JOIN familyMember c ON r.child = c.id;\n";

        try{
            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()){
                String d = rs.getString(10);
                data.add(d);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return data;

    }
    public ArrayList<String> getRelationsMother(){
        ArrayList<String> data = new ArrayList<>();
        String query = "SELECT *\n" +
                "FROM\n" +
                "  relations r\n" +
                "  INNER JOIN familyMember n ON r.id = n.id\n" +
                "  INNER JOIN familyMember f ON r.father = f.id\n" +
                "  INNER JOIN familyMember m ON r.mother = m.id\n" +
                "  INNER JOIN familyMember c ON r.child = c.id;\n";

        try{
            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()){
                String d = rs.getString(14);
                data.add(d);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return data;

    }
    public ArrayList<String> getRelationsChild(){
        ArrayList<String> data = new ArrayList<>();
        String query = "SELECT *\n" +
                "FROM\n" +
                "  relations r\n" +
                "  INNER JOIN familyMember n ON r.id = n.id\n" +
                "  INNER JOIN familyMember f ON r.father = f.id\n" +
                "  INNER JOIN familyMember m ON r.mother = m.id\n" +
                "  INNER JOIN familyMember c ON r.child = c.id;\n";

        try{
            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()){
                String d = rs.getString(18);
                data.add(d);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return data;

    }

    public ArrayList<ArrayList<String>> test(){
        ArrayList<ArrayList<String>> list =  new ArrayList<>();
        String query = "SELECT *\n" +
                "FROM\n" +
                "  relations r\n" +
                "  INNER JOIN familyMember n ON r.id = n.id\n" +
                "  INNER JOIN familyMember f ON r.father = f.id\n" +
                "  INNER JOIN familyMember m ON r.mother = m.id\n" +
                "  INNER JOIN familyMember c ON r.child = c.id;\n";

        try{
            st = con.createStatement();
            rs = st.executeQuery(query);
            int index = 0;

            while(rs.next()){
                list.add(new ArrayList<>());
                String name = rs.getString(6);
                String father = rs.getString(10);
                String mother = rs.getString(14);
                String child = rs.getString(18);
                list.get(index).add(0,name);
                list.get(index).add(1,father);
                list.get(index).add(2,mother);
                list.get(index).add(3,child);
                index++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
