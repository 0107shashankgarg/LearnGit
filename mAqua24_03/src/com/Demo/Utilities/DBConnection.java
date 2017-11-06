package com.Demo.Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.Demo.Reporter.LogSetter;

public class DBConnection {
	
	static Connection con = null;
    public static Connection getConnection(){
    	
        try{
        	LogSetter.setLogClass("Connection");
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://111.93.129.174:3306/maqua";
            String user = "mAqua123";
            String password = "maqua";
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
         
        }catch(SQLException se){
        	//System.out.println("error: sql excetion ....");
        	LogSetter.logger.error(se.getMessage());
        	TestForceStop.stopExec("db connection error");
        	
        }catch (Exception e) {
        	LogSetter.logger.error("error encounterd in db connection: "+e);
        }
        LogSetter.logger.debug("server db connection successful");
        return con;
    }
    
    
}
