package com.Demo.Utilities;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import org.apache.log4j.MDC;

import com.Demo.Reporter.LogSetter;
import com.Demo.Setup.ToolInvoke.EnviornmentSetup;

public class TestForceStop {
	public static void stopExec(String message)
	{/*
		Connection con = null;
		try {
		 con = DBConnection.getConnection();
		 //HashMap<String, String> task=taskConfig.getTask();
		 
			Statement stmt = con.createStatement();
			String sql;
			
				sql = "INSERT INTO tbl_execption_Execution VALUES(NULL, '"+EnviornmentSetup.taskDetails.get("projectName")+"',NOW(), '"
				+ message+"',"+ EnviornmentSetup.taskDetails.get("taskId") + ")"; 
			//System.out.println(sql);
			stmt.executeUpdate(sql);
			LogSetter.logger.error("Stopping execution process. "+message);
		System.exit(0);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	*/}
}
