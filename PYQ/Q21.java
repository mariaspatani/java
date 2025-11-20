//Write a java prognrm which insert a set ofvalues into a database table 'student'
import java.sql.*;

public class InsertStudent {
    public static void main(String[] args) {

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/yourdbname", "root", "yourpassword");

            // 3. Create Statement
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student (rollno, name, marks) VALUES (?, ?, ?)");

            // 4. Set values and execute update
            ps.setInt(1, 101);
            ps.setString(2, "John");
            ps.setInt(3, 85);
            ps.executeUpdate();

            ps.setInt(1, 102);
            ps.setString(2, "Mary");
            ps.setInt(3, 90);
            ps.executeUpdate();

            ps.setInt(1, 103);
            ps.setString(2, "David");
            ps.setInt(3, 78);
            ps.executeUpdate();

            System.out.println("Values inserted successfully!");

            // 5. Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
