package com.Demo.Utilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.MDC;

import com.Demo.Reporter.LogSetter;



public class taskConfig {

	static Connection con = null;
	static PreparedStatement ps;
	static String sql;
	static ResultSet rs;

	public static HashMap<String, String> getTask() {

		HashMap<String, String> execTask = new HashMap<>();
		new ArrayList<Object>();

		try {
			con = DBConnection.getConnection();
			sql = "select tua.user_account_id,tl.test_type_id ,tl.report_name,tl.device_count,ttd.device_id,ttd.device_task_id,tl.task_id,tl.project_id,tp.project_name, td.device_name,ttt.test_type_name,tl.report_name,tse.env_name,tpeb.buid_name,tpp.platform_name,tua.user_name,tl.execution_status from tbl_task_list tl inner join tbl_projects tp on tl.project_id=tp.project_id inner join tbl_test_type ttt on ttt.test_type_id=tl.test_type_id inner join tbl_sref_enviornment tse on tse.env_id=tl.environment_id inner join tbl_platforms tpp on tpp.platform_id=tl.platform_id inner join tbl_project_env_build tpeb on tpeb.build_id=tl.build_id inner join tbl_task_device ttd on ttd.task_id=tl.task_id inner join tbl_device td on td.device_id=ttd.device_id inner join tbl_user_account tua on tua.user_account_id=tl.user_id where tl.execution_status=0  and tl.project_id=? and ttd.status=0";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 2);
			rs = ps.executeQuery();

			if (rs.next())
			{
				execTask.put("deviceName", rs.getString("device_name"));
				execTask.put("testType", rs.getString("test_type_name"));
				execTask.put("envName", rs.getString("env_name"));
				execTask.put("buildName", rs.getString("buid_name"));
				execTask.put("platformName", rs.getString("platform_name"));
				execTask.put("userName", rs.getString("user_name"));
				execTask.put("taskDeviceId", rs.getString("device_task_id"));
				execTask.put("taskId", rs.getString("task_id"));
				execTask.put("deviceCount", rs.getString("device_count"));
				execTask.put("projectName", rs.getString("project_name"));
				execTask.put("testName", rs.getString("report_name"));
				execTask.put("testType", rs.getString("test_type_name"));
				execTask.put("projectId", rs.getString("project_id"));
				execTask.put("testTypeId", rs.getString("test_type_id"));
				execTask.put("userId", rs.getString("user_account_id"));
				execTask.put("deviceId", rs.getString("device_id"));
				//MDC.put("projectId", rs.getString("project_id"));
			}
		

		} catch (SQLException e) {
			//e.printStackTrace();
			LogSetter.logger.error(e.getMessage());
			//TestForceStop.stopExec();
		}
		try {
			con.close();
		} catch (SQLException e) {
			LogSetter.logger.error(e.getMessage());
			//TestForceStop.stopExec();
		}
		LogSetter.logger.info("configuration set --project name: "+execTask.get("projectName")+"  env :"+execTask.get("envName")+"  device name: "+execTask.get("deviceName")+"  os name: "+execTask.get("platformName"));
		return execTask;

	}

	public static void updateTaskStatus(String taskId, String deviceTaskId) {
		try {
			con = DBConnection.getConnection();
			sql = "UPDATE tbl_task_device SET status = 1 WHERE device_task_id="
					+ deviceTaskId;
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			sql = " SELECT COUNT(*)   FROM   tbl_task_device WHERE  task_Id = "
					+ taskId + " and status='0'";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			while (rs.next()) {
				if (rs.getInt(1) == 0) {
					sql = "UPDATE tbl_task_list SET execution_status = 1 WHERE task_id="
							+ taskId;
					ps = con.prepareStatement(sql);
					ps.executeUpdate();
				}
				System.out.println(rs.getInt(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
