package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SampleJDBCExecuteUpdate {

	public static void main(String[] args) throws SQLException {
		
		Driver driverRef=new Driver();
		
		//1
		DriverManager.registerDriver(driverRef);
		//2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wasa3db","root","root");
		//3
		Statement state=con.createStatement();
		//4
		String query="insert into candidateInfo values('sshgD','40','Bangalore')";
	//	int state.executeUpdate(query);
//		if (result>=1)
		{
			System.out.println("data  added");
		}
		ResultSet result=state.executeQuery("select * from candidateInfo");
		
		while (result.next())
		{
			System.out.println(result.getString(1)+"  "+result.getString(2));
		
		}
		//5
		con.close();
		System.out.println("db closed");
	}

}
