package com.Demo.Scripts.Sprints;

import org.testng.annotations.Test;

import com.Demo.Reporter.HtmlReportGenerator;
import com.Demo.Scripts.TestInstance.WJIV_3326_ResetPasswordTestInstance;
import com.Demo.Setup.ToolInvoke.EnviornmentSetup;

public class Sprint2 {

	@Test()
	public void addPassword() throws ClassNotFoundException {
		System.out.println("device name : "
				+ EnviornmentSetup.taskDetails.get("deviceName"));
		HtmlReportGenerator.reportName = "addPassword_"
				+ EnviornmentSetup.taskDetails.get("deviceName");
		new WJIV_3326_ResetPasswordTestInstance(
				EnviornmentSetup.taskDetails.get("platformName"));

	}

	@Test()
	public void Login() throws ClassNotFoundException {
		System.out.println("device name : "
				+ EnviornmentSetup.taskDetails.get("deviceName"));
		HtmlReportGenerator.reportName = "Login"
				+ EnviornmentSetup.taskDetails.get("deviceName");
		new WJIV_3326_ResetPasswordTestInstance(
				EnviornmentSetup.taskDetails.get("platformName"));

	}

}
