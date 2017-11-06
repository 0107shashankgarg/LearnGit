package com.Demo.Setup.ToolInvoke;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.Demo.Utilities.DBConnection;
import com.Demo.Utilities.taskConfig;

public class EnviornmentSetup {
	public static String env;
	Connection con = null;
	public static HashMap<String, String> taskDetails;

	public static void deviceEnviornmentSetup() {

		taskDetails = taskConfig.getTask();
		LaunchReqEnv Env1 = new LaunchReqEnv();
		if (taskDetails.get("platformName").equals("Android")) {
			new AndroidSetup(taskDetails);
		} else {
			new iOSSetup(taskDetails);
		}

	}

}
