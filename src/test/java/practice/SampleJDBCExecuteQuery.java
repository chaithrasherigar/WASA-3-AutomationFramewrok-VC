package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.mysql.jdbc.Driver;

public class SampleJDBCExecuteQuery {

	public static void main(String[] args) throws SQLException {
		//step1: 
		Driver driverRef=new Driver();
		
		//step2:
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wasa3db","root","root");
		
		//step3:
		Statement state=con.createStatement();

		//step4:
		ResultSet result=state.executeQuery("select * from candidateinfo;");
while(result.next())
{
	System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
}
		//step5:
con.close();
System.out.println("db closed");
	}

}
