package com.Demo.Reporter;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class StepHtmlReportGenerator {
	static FileWriter fWriter = null;
	static BufferedWriter writer = null;
	static FileReader fileReader = null;
	static String htmlFileContent = null;
	static int pos = 0;
	static String compositeName = null;
	static String compositeRunSpan = null;
	static String stepRunSpan = null;
	static String stepName = null;
	static String finalResult = null;
	static String screenShotLink = null;
	String stepResult = null;
	int stepExeTime = 0;
	String stepFailReason = null;
	static String reportName = null;
	String reportFileName = null;

	public StepHtmlReportGenerator() {
		this.reportName = HtmlReportGenerator.reportName;
		this.initHtmlStepR();

	}

	private void initHtmlStepR() {

		try {
			reportFileName = reportName + "_Detail Report";
			fWriter = new FileWriter(ResultRepo.reportName + reportFileName
					+ ".html");
			writer = new BufferedWriter(fWriter);
			writer.write("<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'><html xmlns='http://www.w3.org/1999/xhtml'><head><meta http-equiv='Content-Type' content='text/html; charset=UTF-8' /><title>mAqua Report</title><link rel='stylesheet' type='text/css' href='css/style.css' /><link rel='stylesheet' type='text/css' href='css/print.css' media='print'/></head><body><div id='page-wrap'><div id='header'>mAqua Report</div><div id='logo'><img id='image' src='http://adeptpros.com/img/LOGO1.png' alt='logo' /></div><div id='identity'>");
			writer.write("<div style='clear:both'></div><table id='items'><tr><th width='20%'>Test Case Name</th><th width='15%'>Test Step Name</th><th width='5%'>Result</th><th>Comments</th><th width='10%'>Execution Time</th><th width='8%'>Screen Shot</th></tr><tr ></table><div id='terms'>Copyrights &copy; 2014 adeptpros</div></div><br><br><br>");
			writer.write("</body></html>");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void setCompositeResult(List<HashMap> compositeStepsReports,
			String currentComposite) {

		for (int i = 0; i < compositeStepsReports.size(); i++) {
			stepName = (String) compositeStepsReports.get(i).get("StepName");
			stepExeTime = (Integer) compositeStepsReports.get(i)
					.get("StepTime");
			stepResult = (String) compositeStepsReports.get(i)
					.get("StepResult");
			stepFailReason = (String) compositeStepsReports.get(i).get(
					"FailReason");
			screenShotLink = (String) compositeStepsReports.get(i).get(
					"ScreenShot");
			compositeName = currentComposite;
			htmlFileContent = null;
			pos = 0;
			try {
				fileReader = new FileReader(ResultRepo.reportName
						+ reportFileName + ".html");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			int len;
			char[] chr = new char[4096];
			final StringBuffer buffer = new StringBuffer();
			try {
				while ((len = fileReader.read(chr)) > 0) {
					buffer.append(chr, 0, len);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			htmlFileContent = buffer.toString();
			pos = htmlFileContent.lastIndexOf("</tr>");
			String initPart = htmlFileContent.substring(0, pos + 5);
			String endPart = htmlFileContent.substring(pos,
					htmlFileContent.length());
		/*	System.out.println(initPart);
			System.out.println(endPart);*/
			try {
				fWriter = new FileWriter(ResultRepo.reportName + reportFileName
						+ ".html");
			} catch (IOException e) {
				e.printStackTrace();
			}
			writer = new BufferedWriter(fWriter);
			try {
				if (i == 0) {
					if (stepResult.equalsIgnoreCase("fail")) {
						writer.write(initPart + "<tr ><td rowspan="
								+ compositeStepsReports.size() + ">"
								+ compositeName + "</td><td>" + stepName
								+ "</td><td id='tdfail'>" + stepResult
								+ "</td><td>" + stepFailReason + "</td><td>"
								+ stepExeTime + "secs</td><td><a href="
								+ screenShotLink + ">screen shot</a></td></tr>"
								+ endPart);

					} else {
						writer.write(initPart + "<tr ><td rowspan="
								+ compositeStepsReports.size() + ">"
								+ compositeName + "</td><td>" + stepName
								+ "</td><td id='tdpass'>" + stepResult
								+ "</td><td> </td><td>" + stepExeTime
								+ "secs</td><td> </td></tr>" + endPart);

					}
				} else {
					if (stepResult.equalsIgnoreCase("fail")) {
						writer.write(initPart + "<tr ><td>" + stepName
								+ "</td><td id='tdfail'>" + stepResult
								+ "</td><td>" + stepFailReason + "</td><td>"
								+ stepExeTime + "secs</td><td><a href="
								+ screenShotLink
								+ ">screen shot</a></td></tr></body></html>");

					} else {
						writer.write(initPart + "<tr ><td>" + stepName
								+ "</td><td id='tdpass'>" + stepResult
								+ "</td><td> </td><td>" + stepExeTime
								+ "secs</td><td> </td></tr></body></html>");

					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
