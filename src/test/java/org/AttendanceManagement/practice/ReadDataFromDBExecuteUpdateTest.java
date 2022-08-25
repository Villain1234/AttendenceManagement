package org.AttendanceManagement.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

/*public class ReadDataFromDBExecuteUpdateTest {

	public static void main(String[] args) throws SQLException {
    //step 1 : create object for driver
    Driver driverRef=new Driver();
    Connection con=null;
    
   // step 2 : Register the driver
    DriverManager.registerDriver(driverRef);
    
   // step 3 : Establish the connection - provide database name
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancemanagement", "root", "root");
    
    // step 4 : Create statement
    Statement state = con.createStatement();
    
    // step 5 : Execute query
    String query="insert into empdetails values(26,'shankar',8787878,'maharashtra'); ";
    int result = state.executeUpdate(query);
    System.out.println(result);
    
    // step 6 : validate
    if(result==1)
    {
    	System.out.println("data added successfully");
    }
    else
    {
    	System.out.println("data not added");
    }
    
    //step 7 : closed connection
    con.close();
    System.out.println("connection closed");
	}

}*/
