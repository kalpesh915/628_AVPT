
import java.sql.*;

public class Pro7 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/jdbcdemo";
            Connection conn = DriverManager.getConnection(URL, "root", "");
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery("select * from products");
            
            while(rs.next()){
                System.out.println("Product ID is "+rs.getInt("productid")+" Name "+rs.getString("productname")+" Price "+rs.getInt("price"));
            }
            rs.close();
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }
}
