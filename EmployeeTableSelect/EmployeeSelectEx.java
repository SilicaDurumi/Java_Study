import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//OJDBC
public class EmployeeSelectEx {

	final static String employee_select = "select * from employee";
	
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver"; 	
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url,"USERID","USERPW");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(employee_select);
			System.out.print("Number\t Name\t Job\t Deptno\t Email\n");
			
			
			while (resultSet.next()) {
				System.out.print(resultSet.getInt(1)+"\t ");
				System.out.print(resultSet.getString(2)+"\t ");
				System.out.print(resultSet.getString(3)+"\t ");
				System.out.print(resultSet.getInt(4)+"\t ");
				System.out.print(resultSet.getString(5)+"\n");
			}
			
		} 
		catch (Exception e) {System.out.println(e);	}
		finally {
			try {
				if (resultSet != null)resultSet.close();		
				if (statement != null)statement.close();
				if (connection != null)connection.close();
			} catch (Exception e2) {System.out.println(e2);}
			
		}
		
	}
}




































