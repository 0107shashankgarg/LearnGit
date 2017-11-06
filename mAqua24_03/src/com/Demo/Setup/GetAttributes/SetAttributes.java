package com.Demo.Setup.GetAttributes;

import org.w3c.dom.Element;



public class SetAttributes extends CreateDataSet {

	String path;
	String root;
	String node;
	String id;
	Element eElement;
	public  String Device, Devicetype,Version,AppPath,AppPackage,AppActivity,deviceReadyTimeout,
	androidDeviceReadyTimeout,avd,avdLaunchTimeout,avdReadyTimeout,appWaitActivity,Env,userName,projectName,reportType,device,testName;
	XmlParser xpar = new XmlParser();
	

	public SetAttributes(String path, String root, String node) {

		this.path = path;
		this.root = root;
		this.node = node;
		eElement = xpar.getNode(path, root, node);
		buildData();
	}
	public SetAttributes()
	{

	}

	public void buildData() {

		Device  = GetData("SelectedDevice", eElement);
		//Devicetype = GetData("Devicetype", eElement);
		//Version = GetData("Version", eElement);
		Env = GetData("Platfrom", eElement);
		/*//needs to be done when project setup is done by end user
		// can be modified when running on individual machines
		//only for android
		AppPath  = GetData("AppPath", eElement);
		AppPackage = GetData("AppPackage", eElement);
		AppActivity = GetData("AppActivity", eElement);
		
		deviceReadyTimeout  = GetData("deviceReadyTimeout", eElement);
		appWaitActivity = GetData("appWaitActivity", eElement);
		androidDeviceReadyTimeout = GetData("androidDeviceReadyTimeout", eElement);
		avd = GetData("avd", eElement);
		avdLaunchTimeout = GetData("avd", eElement);
		avdReadyTimeout =  GetData("avdReadyTimeout", eElement);*/
		
		//for generating HTML reports 
		userName=GetData("UserName", eElement);
		projectName=GetData("ProjectName", eElement);
		reportType=GetData("TestType", eElement);
		device=GetData("SelectedDevice", eElement);
		testName=GetData("ReportName", eElement);
		
		
	}

}
