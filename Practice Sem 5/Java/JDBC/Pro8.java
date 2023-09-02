import java.sql.*;
import java.util.Scanner;

public class Pro8 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/jdbcdemo";
            Connection conn = DriverManager.getConnection(URL, "root", "");
            Scanner sc = new Scanner(System.in);
            String productname;
            int price;
            
            System.out.println("Enter Product Name");
            productname = sc.next();
            System.out.println("Enter Price");
            price = sc.nextInt();
            
            PreparedStatement ps = conn.prepareStatement("insert into products (productname, price) values (?, ?)");
            ps.setString(1, productname);
            ps.setInt(2, price);
            int cout = ps.executeUpdate();
            System.out.println(cout+" rows inserted");
            
            ps.close();
            conn.close();
            
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }
}
