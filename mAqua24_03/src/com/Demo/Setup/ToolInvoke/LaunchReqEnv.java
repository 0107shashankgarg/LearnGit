package com.Demo.Setup.ToolInvoke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Demo.GenericInterfaces.ILaunchEnv;

public class LaunchReqEnv implements ILaunchEnv  {
	/*
	public LaunchReqEnv() 
	{
		
	}
*/
	public void startdevice(String name)
	{
		Process p = null;
		//String Avd = "emulator -avd "  + name; 
		try {
			//Runtime.getRuntime().exec(Avd);
			p = Runtime.getRuntime().exec("/Users/shashank/Documents/Java/adt-bundle-mac-x86_64-20140321/sdk/tools/emulator -avd "+name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        BufferedReader stdInput = new BufferedReader(new
             InputStreamReader(p.getInputStream()));
	}
	
	
	
	public void StartAppium()
	{
		/*String[] cmd = {"/Users/shashank/Documents/ant/WJIV/runcmd"};
		try {
			Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String[] cmd = {"/Users/shashank/Documents/Shashank/workspace/mAqua/BATFIles/runcmd"};
		try {
			Runtime.getRuntime().exec("cd /Users/shashank/Documents/Shashank/workspace/mAqua/BATFIles/runcmd & node appium");
			Thread.sleep(10000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		 String line;
		    String output = "";
		    try {
		        Process p = Runtime.getRuntime().exec("cd /Applications/Appium.app/Contents/Resources/node_modules/appium/bin");
		        Runtime.getRuntime().exec("node appium");
		        BufferedReader input = new BufferedReader
		            (new InputStreamReader(p.getInputStream()));
		        while ((line = input.readLine()) != null) {
		            output += (line + '\n');
		        }
		        input.close();
		        }
		    catch (Exception ex) {
		        ex.printStackTrace();
		    }
		    System.out.println("output is :"+output);
		}
	
		/* try {
		        Process p = Runtime.getRuntime().exec("/Applications/Appium.app/Contents/Resources/node/bin/node /Applications/Appium.app/Contents/Resources/node_modules/appium/bin/appium.js --address 127.0.0.1 --port 4745");
		 }
		    catch (Exception ex) {
		        ex.printStackTrace();
		    }
		}*/
		
	@Override
	public void Releaseresources() {
		// TODO Auto-generated method stub
		try {
			Process p = Runtime.getRuntime().exec("killall node");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	}
}
