package com.Demo.Reporter;

import java.io.File;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.annotations.Test;

import com.Demo.Utilities.DBTestSummary;
import com.Demo.Utilities.Driver;

public abstract class Faulttolerence extends StepComposite {
	static int reportIdKey = -1;
	HashMap stepResultDBCopy = new HashMap();
	List<String> compositeExecutedSet = new ArrayList<String>();
	List<HashMap> AllCompositeDBReports = new ArrayList<HashMap>();
	public void ExecuteSteps() throws ClassNotFoundException {
		LogSetter.setLogClass("Faulttolerence");	
		HtmlReportGenerator.executionStartTime = new Date().toString();
		HtmlReportGenerator report = new HtmlReportGenerator();
		StepHtmlReportGenerator Stepreport = new StepHtmlReportGenerator();
		
		int reportDeviceKey=-1;
		int report_test_id=-1;
		AllCompositeDBReports.clear();
		TestProcesser tp=new TestProcesser();
		LogSetter.logger.info("Test Exection Started");
		
		try {
			for (Object step : steps) {
				
				AllCompositeDBReports=tp.process(step); 
			}

		} catch (Exception e) 
		{
			e.printStackTrace();
		} finally {
			LogSetter.logger.info("log 1");
			DBTestSummary pustDBTestSummary = new DBTestSummary();
			LogSetter.logger.info("log 2");
			steps.clear();
			if (pustDBTestSummary.isDuplicateReportExist()) {
				LogSetter.logger.info("log 3");
				reportIdKey = pustDBTestSummary.setSummary();
				LogSetter.logger.info("log 4");
			}
			LogSetter.logger.info("log 5");
			reportDeviceKey=pustDBTestSummary.setReportDevice(reportIdKey);
			////////
			LogSetter.logger.info("log 6");
			report_test_id=pustDBTestSummary.setReportTest(reportDeviceKey);
			LogSetter.logger.info("log 7");
			
			
			List reportCompositeID=pustDBTestSummary.setCompositeDBReport(report_test_id,AllCompositeDBReports);
			LogSetter.logger.info("log 8");
		//	pustDBTestSummary.setStepDBReport(reportIdKey,tp.returnStepCompositeResults(),tp.returnCompositeSet());
			pustDBTestSummary.setStepDBReport(reportIdKey,tp.returnStepCompositeResults(),reportCompositeID,tp.returnCompositeSet());
			LogSetter.logger.info("log 9");
			stepResultDBCopy.clear();
			compositeExecutedSet.clear();
		}
	}

}
