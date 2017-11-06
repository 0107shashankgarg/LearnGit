package com.Demo.Reporter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class TestProcesser extends Faulttolerence{
	Class loadedList = null;
	String CurrentStep = null;
	Date dStart = null;
	Date dEnd = null;
	Date StepStartTime = null;
	String stepFailReason = null;
	int executionTime = 0;
	int totalExecutionTime = 0;
	String failureReason = null;
	String filename = null;
	List<HashMap> compositeStepsReports = new ArrayList<HashMap>();
	StepHtmlReportGenerator Stepreport = new StepHtmlReportGenerator();
	String currentComposite = null;
	HashMap compositeResultDBCopy = new HashMap();
	HtmlReportGenerator report = new HtmlReportGenerator();
	List<HashMap> AllCompositeReportsSet = new ArrayList<HashMap>();
	ExceptionManager eManager=new ExceptionManager();
	ProcessReporter pr=new ProcessReporter();
	List<String> compositeSet = new ArrayList<String>();
	HashMap stepsCompositesResults = new HashMap();
	String cause;
	public List<HashMap> process(Object step) throws ClassNotFoundException {

		try {
			LogSetter.setLogClass("process");
			String className = step.getClass().getName();
			java.lang.reflect.Field field = step.getClass().getDeclaredFields()[0];
			field.setAccessible(true);
			String value = field.get(step).toString();
			String simpleclassName = step.getClass().getSimpleName();
			loadedList = Class.forName(className);

			if (!step.getClass().getPackage().getName().contains("TestCase")) {
				CurrentStep = loadedList.getSimpleName();
				LogSetter.logger.info("current execution test step:"+CurrentStep);
				Constructor constructor = loadedList
						.getDeclaredConstructor(String.class);
				
				
				Object _step = constructor.newInstance(value);
				Method[] method = loadedList.getDeclaredMethods();  
				try {
					if (dStart == null) {
						dStart = new Date();
					}
					StepStartTime = new Date();
					
					// test code
					if (CurrentStep.contains("619")) {
						LogSetter.logger.error("619 before execution");
					}
					LogSetter.logger.error(constructor);
					//test code ends here
					
					
					method[0].invoke(_step, null);
					
					// test code
					if (CurrentStep.contains("620")) {
						LogSetter.logger.error("620 after execution");
					}
					
					//test code ends here
					// test code
					if (CurrentStep.contains("619")) {
						LogSetter.logger.error("619 after execution");
					}
					
					//test code ends here
				} catch (Exception e) {

					// test code
					if (CurrentStep.contains("619")) {
						LogSetter.logger.error("619 before logging setup");
					}
					
					//test code ends here
					cause=e.getCause().toString().replace("'", "--");
					
					// test code
					if (CurrentStep.contains("619")) {
						LogSetter.logger.error("619 afer logging setup");
					}
					
					//test code ends here
					LogSetter.logger.error("issue found while executing-- "+CurrentStep+"-- desc :"+cause);
					HashMap<String, String> stepExData=eManager.processException(e, stepFailReason, failureReason, simpleclassName);
					stepFailReason=stepExData.get("stepFailReason").toString();
					failureReason=stepExData.get("failureReason").toString();
					simpleclassName=stepExData.get("simpleclassName").toString();
					filename=stepExData.get("filename").toString();
				}
				
				// test code
				if (CurrentStep.contains("619")) {
					LogSetter.logger.error("619 upto here its exec :"+CurrentStep);
				}
				
				//test code ends here
				// test code
				if (CurrentStep.contains("620")) {
					LogSetter.logger.error("620 upto here its exec");
				}
				
				//test code ends here
				
				
				HashMap stepResultAll = new HashMap(pr.stepReporter(StepStartTime,CurrentStep,stepFailReason,filename));
				StepStartTime = null;
				compositeStepsReports.add(stepResultAll);
				stepFailReason=null;
			} else {
				dEnd = new Date();
				executionTime = (int) ((dEnd.getTime() - dStart.getTime()) / 1000);
				totalExecutionTime = totalExecutionTime + executionTime;
				currentComposite = simpleclassName;
				compositeSet.add(currentComposite);
				Stepreport.setCompositeResult(compositeStepsReports,currentComposite.toString());
				List<HashMap> tempCompositeStepsReports = new ArrayList(compositeStepsReports);
				stepsCompositesResults.put(currentComposite.toString(), tempCompositeStepsReports);
				compositeStepsReports.clear();
				if (currentComposite != null) {
					compositeResultDBCopy.put("compositeName",simpleclassName);
					compositeResultDBCopy.put("executionTime",executionTime);
					if (failureReason == null) {
						report.setCompositeName(simpleclassName, "PASS", " ",executionTime);					
						compositeResultDBCopy.put("result", 1);
						compositeResultDBCopy.put("comment", "");					
					} else {
						report.setCompositeName(simpleclassName, "FAIL",failureReason, executionTime);
						compositeResultDBCopy.put("result", 0);
						compositeResultDBCopy.put("comment", failureReason);						
						failureReason = null;
					}
					HashMap compositeResultCopy = new HashMap(compositeResultDBCopy);
					AllCompositeReportsSet.add(compositeResultCopy);
					compositeResultDBCopy.clear();
				}
				dStart = null;
				LogSetter.logger.info("Executed composite: "+currentComposite);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	return AllCompositeReportsSet;
	}
	
	public List<String> returnCompositeSet()
	{
		return compositeSet;
	}
	public HashMap returnStepCompositeResults()
	{
		return stepsCompositesResults;
	}
}
