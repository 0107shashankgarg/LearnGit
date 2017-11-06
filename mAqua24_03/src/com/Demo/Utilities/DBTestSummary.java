package com.Demo.Utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.xpath.operations.Bool;

import com.Demo.Reporter.HtmlReportGenerator;
import com.Demo.Reporter.LogSetter;
import com.Demo.Setup.ToolInvoke.EnviornmentSetup;

public class DBTestSummary {

	PreparedStatement pst = null;
	ResultSet rs = null;
	Statement stmt = null;
	int key = 0;

	public int setSummary() {
		Connection con = DBConnection.getConnection();
		
		try {
			stmt = con.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		/*String sql = "INSERT INTO tbl_reports"
				+ "(`report_id`, `report_name`, `test_name`, `test_type`, `report_status`, `device_name`, `report_location`, `created_by`, `created_on`, `project_name`) VALUES (NULL, '"
				+ HtmlReportGenerator.reportName + "', '"
				+ EnviornmentSetup.taskDetails.get("testName") + "', '"
				+ EnviornmentSetup.taskDetails.get("testType") + "', b'1', '"
				+ EnviornmentSetup.taskDetails.get("deviceName")
				+ "', 'link', '" + EnviornmentSetup.taskDetails.get("userName")
				+ "', NOW(), '"
				+ EnviornmentSetup.taskDetails.get("projectName") + "')";*/
		String sql = "INSERT INTO tbl_reports"
				+ "( `report_name`,`project_id`,`task_id`, `report_status`, `created_by`, `created_on`) VALUES ( '"
				+ EnviornmentSetup.taskDetails.get("testName") + "', '"
				+ EnviornmentSetup.taskDetails.get("projectId") + "', '"
				+ EnviornmentSetup.taskDetails.get("taskId") + "', b'1', '"
				+ EnviornmentSetup.taskDetails.get("userId")
				+ "', NOW())";
		try {
			stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			ResultSet keys = stmt.getGeneratedKeys ();
			keys.next();
			key = keys.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return key;
	}
public Boolean isDuplicateReportExist()
{
	boolean status=true;
	try {
		Connection con = DBConnection.getConnection();
		stmt = con.createStatement();
		String sql = "Select * from tbl_reports Where report_name='"+EnviornmentSetup.taskDetails.get("testName")+"'";
		PreparedStatement ps = con.prepareStatement(sql);		
		rs = ps.executeQuery();
		if (rs.next())
		{
			status = false;
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	return status;
}
	public List setCompositeDBReport(int report_test_id,
			List<HashMap> AllCompositeDBReports) {
		String testCompositeName;
		int result;
		int executionTime;
		String comment;
		List reportCompositeID = new ArrayList();
		Connection con = DBConnection.getConnection();
//// insert statement not working on fail case 
		for (int i = 0; i < AllCompositeDBReports.size(); i++) {
System.out.println("");
			testCompositeName = (String) AllCompositeDBReports.get(i).get(
					"compositeName");
			result = (int) AllCompositeDBReports.get(i).get("result");
			executionTime = (int) AllCompositeDBReports.get(i).get(
					"executionTime");
			comment = (String) AllCompositeDBReports.get(i).get("comment");
			comment = comment.replace("'", "--");
			
			try {
				
				stmt = con.createStatement();
				String sql = "INSERT INTO tbl_reports_composite"
						+ "(`report_composite_id`, `report_test_id`, `composite_name`, `results`, `comments`, `execution_time`) VALUES (NULL, '"
						+ report_test_id + "', '" + testCompositeName + "','"
						+ result + "','" + comment + "', '" + executionTime
						+ "')";
				stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
				ResultSet keys = stmt.getGeneratedKeys ();
				keys.next();
				reportCompositeID.add(keys.getInt(1));

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reportCompositeID;
	}

	public void setStepDBReport(int reportIdKey, HashMap stepResultDBCopy,
			List reportCompositeIds, List<String> CompositeSet) {
		int eTime;
		String FailReason;
		String currentComposite;
		String StepResult;
		int StepDbResult;
		String StepName;
		String ScreenShot;

		Connection con = DBConnection.getConnection();

		for (int i = 0; i < reportCompositeIds.size(); i++) {
			LogSetter.logger.info("log 8.1");
			currentComposite = (String) CompositeSet.get(i);
			LogSetter.logger.info("log 8.2");
			ArrayList<Object> compositeStepResult = (ArrayList<Object>) stepResultDBCopy
					.get(currentComposite);
			LogSetter.logger.info("log 8.3");
			for (int j = 0; j < compositeStepResult.size(); j++) {
				LogSetter.logger.info("log 8.4");
				HashMap singleCompositeStepResult = (HashMap) compositeStepResult
						.get(j);
				LogSetter.logger.info("details :-----"+singleCompositeStepResult);
				LogSetter.logger.info("log 8.5");
				eTime = (int) singleCompositeStepResult.get("StepTime");
				LogSetter.logger.info("log 8.6");
			
				StepResult = (String) singleCompositeStepResult
						.get("StepResult");
				LogSetter.logger.info("log 8.7");
				if (StepResult.equals("PASS")) {
					LogSetter.logger.info("log 8.8");
					StepDbResult = 1;
					FailReason=" ";
					ScreenShot="dfd";
				} else {
					LogSetter.logger.info("log 8.9");
					StepDbResult = 0;
					FailReason = (String) singleCompositeStepResult.get("FailReason");
					FailReason = FailReason.replace("'", "--");
					LogSetter.logger.info("log 8.10");
					ScreenShot = (String) singleCompositeStepResult
							.get("ScreenShot");
					LogSetter.logger.info("log 8.11");
					
					ScreenShot=ScreenShot.substring(ScreenShot.indexOf("/Screenshots"));
				}
				LogSetter.logger.info( "step name "+singleCompositeStepResult.get("StepName"));
				StepName = (String) singleCompositeStepResult.get("StepName");
				/*ScreenShot = (String) singleCompositeStepResult
						.get("ScreenShot");
				LogSetter.logger.info("log 8.9");
				
				ScreenShot=ScreenShot.substring(ScreenShot.indexOf("/Screenshots"));*/
				//=ScreenShot.indexOf("/Screenshots")
				LogSetter.logger.info("log 8.12");
					//System.out.println(ScreenShot);	
						
						
				try {
					stmt = con.createStatement();
					//=ScreenShot.indexOf("/Screenshots")
					LogSetter.logger.info("log 8.13");
				} catch (SQLException e1) {
					LogSetter.logger.info("log 8.14");
					LogSetter.logger.info(e1);
					e1.printStackTrace();
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				LogSetter.logger.info("hi....");
				LogSetter.logger.info("log 8.15");
				
			
				LogSetter.logger.info(reportCompositeIds.get(i).toString());
				LogSetter.logger.info( "step name "+StepName);
				LogSetter.logger.info( "result "+StepDbResult);
				LogSetter.logger.info( "rerult reason "+FailReason);
				LogSetter.logger.info( "time "+eTime);
				LogSetter.logger.info( "sc name "+ScreenShot);
			/*	String sql = "INSERT INTO tbl_report_step"
						+ "(`step_id`, `report_id`, `composite_name`, `step_name`, `result`, `comment`, `execution_time`, `screen_shot_path`) VALUES (NULL, '"
						+ reportIdKey + "', '" + currentComposite + "','"
						+ StepName + "','" + StepDbResult + "', '" + FailReason
						+ "', '" + eTime + "', '" + ScreenShot + "')";*/
				String sql = "INSERT INTO tbl_reports_step"
						+ "(`report_step_id`, `report_composite_id`, `step_name`, `results`, `comments`, `execution_time`, `screen_shot_path`) VALUES (NULL, '"
						+ reportCompositeIds.get(i) + "', '" + StepName + "','"
						+ StepDbResult + "','" + FailReason + "', '" + eTime
						+ "', '" + ScreenShot + "')";
				LogSetter.logger.info(sql);
				try {
					LogSetter.logger.info("log 8.16");
					stmt.executeUpdate(sql);
					LogSetter.logger.info("log 8.17");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

		}
		try {
			con.close();
			LogSetter.logger.info("log 8.18");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public int setReportDevice(int reportIdKey) {
		int key = 0;
		String sql;
		PreparedStatement ps ;
		try {
			Connection con = DBConnection.getConnection();
			stmt = con.createStatement();
			sql = "select * from tbl_reports_device where report_id="+reportIdKey+"  and device_id="+EnviornmentSetup.taskDetails.get("deviceId");
			 ps = con.prepareStatement(sql);
		
			rs = ps.executeQuery();
			if (rs.next()) {
				key=rs.getInt("reports_device_id");
			}
			else{
			 sql = "INSERT INTO tbl_reports_device"
					+ "(`reports_device_id`, `report_id`, `device_id`, `report_status`, `created_on`) VALUES (NULL, '"
					+ reportIdKey + "', '" + EnviornmentSetup.taskDetails.get("deviceId") +"',1,NOW())";
		
			stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			ResultSet keys = stmt.getGeneratedKeys();

			keys.next();
			key = keys.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return key;
	}
	public int setReportTest(int reportDeviceKey) {
		int key = 0;
		try {
			Connection con = DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "INSERT INTO tbl_reports_test"
					+ "(`reports_test_id`, `reports_device_id`, `test_report_name`, `report_status`, `report_location`,`created_on`) VALUES (NULL, '"
					+ reportDeviceKey + "', '" +HtmlReportGenerator.reportName +"',1,'link',NOW())";
		
			stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			ResultSet keys = stmt.getGeneratedKeys();

			keys.next();
			key = keys.getInt(1);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return key;
	}

}
