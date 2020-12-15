package esprit.projet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class OracleJDBCExample {

    public static void main(String[]argv) throws SQLException {

        System.out.println("-------- Oracle JDBC Connection Testing ------");

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your Oracle JDBC Driver?");
            e.printStackTrace();
            return;

        }

        System.out.println("Oracle JDBC Driver Registered!");

        Connection connection = null;
        CallableStatement stmt = null;

        try {

            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XE", "SYSTEM", "SYSTEM");
         //   connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
          String  sql = "{call p3arisk.calculate_score (?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, 2014); // This would set ID as 102
       stmt.execute();
       PreparedStatement pr=   connection.prepareStatement("select tpcategory0_.ctr_matfis as ctr_matfis1_58_, tpcategory0_.act_libell as act_libell2_58_, tpcategory0_.actsec as actsec3_58_, tpcategory0_.crityear as crityear4_58_, tpcategory0_.ctr_catego as ctr_catego5_58_, tpcategory0_.ctr_datouv as ctr_datouv6_58_, tpcategory0_.ctr_raison as ctr_raison7_58_, tpcategory0_.tocat as tocat8_58_, tpcategory0_.turnover as turnover9_58_ from p3arisk.tpcategory tpcategory0_");
       
     ResultSet rs=pr.executeQuery();
    System.out.println(pr);
       while (rs.next()) {
             // String tableName = rs.getString(3);    
             
              System.out.println("tableName=" + rs.getString(1)+"- "+rs.getString(2)+" -"+rs.getString(3));
            }
      } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            

        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }}
