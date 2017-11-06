package com.Demo.Reporter;

import java.util.Date;
import java.util.HashMap;

public class ProcessReporter {
	Date StepEndTime;
	int stepExecutionTime ;
	HashMap stepResultSeter = new HashMap();
	public HashMap stepReporter(Date stepStartTime, String currentStep, String stepFailReason,String filename)
	{
		HashMap stepResultSeter = new HashMap();
		 StepEndTime = new Date();
		 stepExecutionTime = (int) ((StepEndTime.getTime() - stepStartTime
				.getTime()) / 1000);
		stepResultSeter.put("StepName", currentStep);
		stepResultSeter.put("StepTime", stepExecutionTime);
		stepResultSeter.put("FailReason", stepFailReason);

		if (stepFailReason != null) {
			stepResultSeter.put("StepResult", "FAIL");
			// stepResultSeter.put("ScreenShot", filename);
			stepResultSeter.put("ScreenShot", filename);
			stepFailReason = null;
			filename = null;
		} else {
			stepResultSeter.put("StepResult", "PASS");
			stepResultSeter.put("ScreenShot", "");
		}
	
		return stepResultSeter;
	}
}
