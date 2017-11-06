package com.Demo.GenericInterfaces;



public interface ILaunchEnv {
	
	
	public void startdevice(String name); // Starts the required emulator/simulator
	public void Releaseresources();       // Release all resources blocked by the thread 
										  // emulator/simulator DB connection and appium server
	
	public void StartAppium();            // Start an appium session with the required port number
		
}
