package com.Demo.Reporter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import com.Demo.Setup.GetAttributes.SetAttributes;
import com.Demo.Setup.ToolInvoke.EnviornmentSetup;
import com.Demo.Utilities.taskConfig;

public class HtmlReportGenerator {
	static FileWriter fWriter = null;
	static BufferedWriter writer = null;
	static FileReader fileReader = null;
	static String htmlFileContent = null;
	static int pos = 0;
	public int testCount = 0;
	public int testPassCount = 0;
	static String executionStartTime = null;
	int TotalExecutionTime = 0;
	static String status = null;
	String compositeName = null;
	static String compositeRunSpan = null;
	static String stepRunSpan = null;
	static String stepName = null;
	static String finalResult = null;
	String reportFileName = null;
	public static String reportName = null;
	int summaryStart;
	int summaryEnd;
	String summaryContent;

	public HtmlReportGenerator() {
		ResultRepo.ResultDir();
		this.initHtmlR();
	}

	private void initHtmlR() {

		try {
			HashMap<String, String> taskEnvData= EnviornmentSetup.taskDetails;
			reportFileName = reportName + "_Fuctional Report";
		 
			fWriter = new FileWriter(ResultRepo.reportName + reportFileName
					+ ".html");
			writer = new BufferedWriter(fWriter);
			writer.write("<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'><html xmlns='http://www.w3.org/1999/xhtml'><head><meta http-equiv='Content-Type' content='text/html; charset=UTF-8' /><title>mAqua Report</title><link rel='stylesheet' type='text/css' href='css/style.css' /><link rel='stylesheet' type='text/css' href='css/print.css' media='print'/></head><body><div id='page-wrap'><div id='header'>mAqua Report</div><div id='logo'><img id='image' src='http://adeptpros.com/img/LOGO1.png' alt='logo' /></div><div id='identity'>");
			writer.write("<table id='meta1'><tr><td class='meta-head1'>User Name</td><td>"
					+ taskEnvData.get("userName")
					+ "</td></tr><tr><td class='meta-head1'>Passed</td><td>32</td></tr><tr><td class='meta-head1'>Failed</td><td>8</td></tr><tr><td class='meta-head1'>Percent Of Pass</td><td>80%</td></tr><tr><td class='meta-head1'>Total Execution Time</td><td>120 mins 30 secs</td></tr></table></div><table id='meta'><tr><td class='meta-head'>Project Name</td><td>"
					+ taskEnvData.get("projectName")
					+ "</td></tr><tr><td class='meta-head'>Report Name</td><td>"
					+ reportName
					+ "</td></tr><tr><td class='meta-head'>Report Type</td><td>"
					+ taskEnvData.get("testType")
					+ "</td></tr><tr><td class='meta-head'>Device</td><td>"
					+ taskEnvData.get("deviceName")
					+ "</td></tr><tr><td class='meta-head'>Date Of Execution</td><td>"
					+ executionStartTime
					+ "</td></tr></table><div style='clear:both'></div><table id='items'><tr><th width='20%'>Test Case Name</th><th width='8%'>Result</th><th>Comments</th><th width='10%'>Execution Time</th></tr></table ><div id='terms'>Copyrights &copy; 2014 adeptpros</div></div><br><br><br>");
			writer.write("</body></html>");
			writer.close();
			BufferedReader bufferedReader = new BufferedReader(new FileReader(
					ResultRepo.reportName + reportFileName + ".html"));
			String h = bufferedReader.readLine();
			//System.out.println(h);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void setCompositeName(String compositeN, String result,
			String comment, int executionTime) {

		htmlFileContent = null;
		TotalExecutionTime = TotalExecutionTime + executionTime;
		if (TotalExecutionTime >= 60) {

		}
		pos = 0;
		if (!compositeN.equals(compositeName)) {
			compositeName = compositeN;
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
			if (!result.equalsIgnoreCase("fail")) {
				testPassCount++;
			}
			testCount++;
			summaryStart = htmlFileContent
					.indexOf("<td class='meta-head1'>Passed");
			summaryEnd = htmlFileContent
					.indexOf("</table></div><table id='meta'>");
			summaryContent = "<td class='meta-head1'>Passed</td><td>"
					+ testPassCount
					+ "</td></tr><tr><td class='meta-head1'>Failed</td><td>"
					+ (testCount - testPassCount)
					+ "</td></tr><tr><td class='meta-head1'>Percent Of Pass</td><td>"
					+ ((float) testPassCount / testCount * 100)
					+ "%</td></tr><tr><td class='meta-head1'>Total Execution Time</td><td>"
					+ TotalExecutionTime + " secs</td></tr>";
			htmlFileContent = htmlFileContent.substring(0, summaryStart)
					+ summaryContent
					+ htmlFileContent.substring(summaryEnd,
							htmlFileContent.length());
			pos = htmlFileContent.lastIndexOf("</tr>");
			try {
				fWriter = new FileWriter(ResultRepo.reportName + reportFileName
						+ ".html");
			} catch (IOException e) {
				e.printStackTrace();
			}
			writer = new BufferedWriter(fWriter);
			String initPart = htmlFileContent.substring(0, pos + 5);
			String endPart = htmlFileContent.substring(pos,
					htmlFileContent.length());
	/*		System.out.println(initPart);
			System.out.println(endPart);*/

			try {
				if (result.equalsIgnoreCase("fail")) {
					writer.write(initPart + "<tr ><td>" + compositeName
							+ "</td><td id='tdfail'>" + result + "</td><td>"
							+ comment + "</td><td>" + executionTime
							+ "secs</td></tr>" + endPart);

				} else {
					writer.write(initPart + "<tr><td>" + compositeName
							+ "</td><td id='tdpass'>" + result + "</td><td>"
							+ comment + "</td><td>" + executionTime
							+ "secs</td></tr>" + endPart);

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
