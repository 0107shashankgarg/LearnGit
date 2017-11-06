package com.Demo.Reporter;

import org.apache.log4j.Logger;

public class LogSetter {
	public static Logger logger = Logger.getLogger("Default");
	
public static void setLogClass(String className) {
	logger= Logger.getLogger(className);
	
	}
}

