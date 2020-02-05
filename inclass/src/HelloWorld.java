import java.sql.*;
import java.io.*;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:80/db_name","root","");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select 'Hello MUIC!'");
            while(rs.next()) {
                System.out.println(rs.getString(1) + "\n");
            }
        }
        catch(Exception e) { System.out.println(e); }

        // Also try using boolean stmt.execute(), int stmt.executeUpdate(), ...???
    }

}
