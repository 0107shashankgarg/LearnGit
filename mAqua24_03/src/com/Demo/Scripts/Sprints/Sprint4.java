package com.Demo.Scripts.Sprints;

import org.testng.annotations.Test;

import com.Demo.Reporter.HtmlReportGenerator;
import com.Demo.Scripts.TestInstance.WJIV_3326_ResetPasswordTestInstance;
import com.Demo.Setup.ToolInvoke.EnviornmentSetup;

public class Sprint3 {

	@Test()
	public void ForgotPassword() throws ClassNotFoundException {
		 int a = 10;
		 System.out.println(a);
		System.out.println("device name : "
				+ EnviornmentSetup.taskDetails.get("deviceName"));
		HtmlReportGenerator.reportName = "ForgotPassword_"
				+ EnviornmentSetup.taskDetails.get("deviceName");
		new WJIV_3326_ResetPasswordTestInstance(
				EnviornmentSetup.taskDetails.get("platformName"));

	}

	@Test()
	public void addLocation() throws ClassNotFoundException {
		//System.exit(0);
		System.out.println("device name : "
				+ EnviornmentSetup.taskDetails.get("deviceName"));
		HtmlReportGenerator.reportName = "updatePassword_"
				+ EnviornmentSetup.taskDetails.get("deviceName");
		new WJIV_3326_ResetPasswordTestInstance(
				EnviornmentSetup.taskDetails.get("platformName"));
		

	}

}
