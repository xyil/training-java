//package jdbc;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class CreateEmpTable {
//	
//	private static final String createEmpTable = "CREATE TABLE `employee` (\n"
//			+ "`empId` INT NOT NULL, \n"
//			+ "`empName` VARCHAR(45) NULL, \n"
//			+ "`dob` VARCHAR(45) NULL, \n"
//			+ "`salary` INT NULL, \n"
//			+ "`age` INT NULL, \n"
//			+ "PRIMARY KEY (`empId`));";
//	
//    public static void main(String[] argv) throws SQLException {
//    	CreateEmpTable createETable = new CreateEmpTable();
//        createETable.createTable();
//    }
//    
//    public void createTable() throws SQLException {
//
//        System.out.println(createEmpTable);
//        // Step 1: Establishing a Connection
//        try (Connection connection = H2JDBCUtils.getConnection();
//            // Step 2:Create a statement using connection object
//            Statement statement = connection.createStatement();) {
//
//            // Step 3: Execute the query or update query
//            statement.execute(createEmpTable);
//        } catch (SQLException e) {
//            // print SQL exception information
//        	H2JDBCUtils.printSQLException(e);
//        }
//        
//    }
//}
