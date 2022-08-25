package org.AttendanceManagement.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

/*public class FetchDataFromDatabasePracticeTest {

	public static void main(String[] args) throws SQLException {
		
		// Create the object for DataBase driver class
		Driver dbDriver=new Driver();	
		
		// Register the driver to the JDBC
		DriverManager.registerDriver(dbDriver); //registerDriver is the example of method overloading
		//Connection connection=null;
		
		// Get or establish the connection - provide database name
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancemanagement", "root", "root");
		
		// create the statement
		Statement statement = connection.createStatement();
		
		// Execute the query - provide table name
		statement.executeUpdate("create table EmpDetails(empId int(4) not null unique,empName varchar(30),phone_number int(10) not null unique,Address varchar(50));");
		System.out.println("Data updated successfully");
		
		
		
			// close the connection
			connection.close();
			System.out.println("connection closed");

	

}
}*/
