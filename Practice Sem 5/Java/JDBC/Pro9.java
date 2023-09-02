
import java.sql.*;
import java.util.Scanner;

public class Pro9 {

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

            CallableStatement cs = conn.prepareCall("{call insertProduct(?, ?)}");
            cs.setString(1, productname);
            cs.setInt(2, price);
            cs.execute();
            System.out.println("New Product Inserted");

            cs.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }
}
