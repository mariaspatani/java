import java.sql.*;

public class JDBCFullDemo {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1️⃣ Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2️⃣ Connect to database
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "password");

            stmt = con.createStatement();

            // 3️⃣ Create 'students' table
            String createTable = "CREATE TABLE IF NOT EXISTS students (" +
                                 "id INT PRIMARY KEY, " +
                                 "name VARCHAR(50), " +
                                 "marks INT)";
            stmt.executeUpdate(createTable);
            System.out.println("Table 'students' created successfully.");

            // 4️⃣ Insert values
            String insertData = "INSERT INTO students (id, name, marks) VALUES " +
                                "(1, 'Alice', 85), " +
                                "(2, 'Bob', 70), " +
                                "(3, 'Charlie', 90), " +
                                "(4, 'David', 60), " +
                                "(5, 'Eva', 75) " +
                                "ON DUPLICATE KEY UPDATE name=name"; // avoid duplicate insert
            stmt.executeUpdate(insertData);
            System.out.println("Sample data inserted successfully.\n");

            // 5️⃣ SELECT before deletion
            System.out.println("Student Records Before Deletion:");
            rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Marks: " + rs.getInt("marks"));
            }

            // 6️⃣ DELETE a student (id = 3)
            String deleteQuery = "DELETE FROM students WHERE id = 3";
            int rowsDeleted = stmt.executeUpdate(deleteQuery);
            System.out.println("\n" + rowsDeleted + " record(s) deleted.\n");

            // 7️⃣ SELECT after deletion
            System.out.println("Student Records After Deletion:");
            rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Marks: " + rs.getInt("marks"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 8️⃣ Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
