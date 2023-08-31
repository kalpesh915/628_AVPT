import java.sql.*;

public class pro3 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/jdbcdemo";
            Connection conn = DriverManager.getConnection(URL, "root", "");
            Statement st = conn.createStatement();
            String query = "select * from students";
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                System.out.println("Welcome "+rs.getString("fname")+" "+rs.getString("lname")+" to "+rs.getString("city")+" Roll No. is "+rs.getInt("id"));
            }

            rs.close();
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
