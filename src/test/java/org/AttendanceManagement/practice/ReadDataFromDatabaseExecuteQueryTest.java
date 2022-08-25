package org.AttendanceManagement.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

/*public class ReadDataFromDatabaseExecuteQueryTest 
{

	public static void main(String[] args) throws SQLException
	{
		//step 1 : Create object for database
		Driver driverRef=new Driver();
		Connection con=null;

		//step 2 : Register driver
		DriverManager.registerDriver(driverRef);

		//step 3 : Establish the connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancemanagement", "root", "root");

		//step 4 : Create statement
		Statement statement = con.createStatement();

		//step 5 : Execute the query - provide table name
		String query="select * from empdetails;";
		String expData="shankar";
		ResultSet result = statement.executeQuery(query);
		boolean flag=false;
		while(result.next())
		{
			String actData=result.getString(2);
			if(actData.equalsIgnoreCase(expData))
			{
				System.out.println(actData);
				flag=true;
				break;

			}
		}
		if(flag)
		{
			System.out.println("data is present");
		}
		else 
		{
			System.out.println("data is not present");
		}

		//step 6 : validate
		//step 7 : close connection
		con.close();
	}

}*/
