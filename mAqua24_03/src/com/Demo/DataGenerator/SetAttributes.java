package com.Demo.DataGenerator;

import org.w3c.dom.Element;



public class SetAttributes extends CreateDataSet {

	String path;
	String root;
	String node;
	String id;
	Element eElement;
	public  String Platform, Devicetype,Version,AppPath,AppPackage,AppActivity,deviceReadyTimeout,
	androidDeviceReadyTimeout,avd,avdLaunchTimeout,avdReadyTimeout,appWaitActivity,Env;
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

		Platform  = GetData("Platform", eElement);
		Devicetype = GetData("Devicetype", eElement);
		Version = GetData("Version", eElement);
		Env = GetData("Env", eElement);
		//needs to be done when project setup is done by end user
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
		avdReadyTimeout =  GetData("avdReadyTimeout", eElement);
		
	}

}
