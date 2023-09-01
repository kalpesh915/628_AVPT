
import java.util.Scanner;
import java.sql.*;

class DatabaseManagement {

    Connection conn;
    Statement st;
    ResultSet rs;
    String query, URL;

    public DatabaseManagement() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            URL = "jdbc:mysql://localhost:3306/jdbcdemo";
            conn = DriverManager.getConnection(URL, "root", "");
            st = conn.createStatement();
        } catch (Exception err) {
            System.out.println("Error is " + err);
        }
    }

    public void addNewProduct(String productName, int price) {
        query = "insert into products (productname, price) values"
                + "('" + productName + "', " + price + ")";
        //System.out.println(query);
        try {
            st.executeUpdate(query);
            System.out.println("New Product Inserted");
        } catch (Exception e) {
            System.out.println("Error while insert new product " + e);
        }
    }

    public void viewAllProducts() {
        try {
            query = "select * from products";
            rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println("Product ID : "+rs.getInt("productid")+" Product is " + rs.getString("productname") + " Price " + rs.getInt("price"));
            }

        } catch (Exception err) {
            System.out.println("Error in view All Products " + err);
        }
    }

    public void findProduct(String productname) {
        try {
            query = "select * from products where productname = '" + productname + "'";
            rs = st.executeQuery(query);

            int count = 0;
            while (rs.next()) {
                System.out.println("Product ID : "+rs.getInt("productid")+" Product is " + rs.getString("productname") + " Price " + rs.getInt("price"));
                count++;
            }
            if (count == 0) {
                System.out.println("No Products found Named " + productname);
            }
        } catch (Exception err) {
            System.out.println("Error is " + err);
        }
    }

    public void updateProduct(int proIductid, String productName, int price) {
        try {
            query = "update products set productname = '" + productName + "', price = " + price + " where productid = " + proIductid;
            int count = st.executeUpdate(query);

            if (count >= 1) {
                System.out.println("Product Updated");
            } else {
                System.out.println("Invalid Product id");
            }
        }catch(Exception err){
            System.out.println("Error while update data "+err);
        }
    }
    
    public void deleteProduct(int productid){
        try{
            query = "delete from products where productid = "+productid;
            int count = st.executeUpdate(query);
            
            if(count >= 1){
                System.out.println("Product Deleted");
            }else{
                System.out.println("Invalid Product ID");
            }
        }catch(Exception err){
            System.out.println("Error while deleting Data "+err);
        }
    }
}

public class Pro6 {

    public static void main(String[] args) {
        int option = 1;
        String productname;
        int price, productid;
        Scanner sc = new Scanner(System.in);
        DatabaseManagement dbms = new DatabaseManagement();
        do {
            System.out.println("");
            System.out.println("*****************************************");
            System.out.println("Press 1 for Insert new Product");
            System.out.println("Press 2 for View All Products");
            System.out.println("Press 3 for find Product");
            System.out.println("Press 4 for Update Product");
            System.out.println("Press 5 for Delete Product");
            System.out.println("Press 0 for Exit ");
            option = sc.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Enter New Product Name");
                    productname = sc.next();
                    System.out.println("Enter Product Price");
                    price = sc.nextInt();
                    dbms.addNewProduct(productname, price);
                    break;
                }
                case 2: {
                    dbms.viewAllProducts();
                    break;
                }
                case 3: {
                    System.out.println("Enter New Product Name");
                    productname = sc.next();
                    dbms.findProduct(productname);
                    break;
                }
                case 4: {
                    System.out.println("Enter Productid to Update");
                    productid = sc.nextInt();
                    System.out.println("Enter New Product Name");
                    productname = sc.next();
                    System.out.println("Enter Product Price");
                    price = sc.nextInt();
                    dbms.updateProduct(productid, productname, price);
                    break;
                }
                case 5: {
                    System.out.println("Enter Productid to Delete");
                    productid = sc.nextInt();
                    dbms.deleteProduct(productid);
                    break;
                }
                case 0: {
                    System.out.println("Thanks for using our application");
                    break;
                }
                default: {
                    System.out.println("Invalid Operation Selected");
                    break;
                }
            }
        } while (option != 0);
    }
}
