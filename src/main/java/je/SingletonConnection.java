package je;


import java.sql.*;

public class SingletonConnection {
  public static void main(String[] args) {
    Connection conn = null;
    try {
      // Register the JDBC driver
    

      // Open a connection
      String url = "jdbc:mysql://localhost:3306/gestions_commerciales";
      String username = "root";
      String password = "";
      conn = DriverManager.getConnection(url, username, password);

      // Test the connection
      if (conn != null) {
        System.out.println("Connected to the database!");
      } else {
        System.out.println("Failed to make a connection!");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      // Close the connection
      try {
        if (conn != null) conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}