package com.crm.autodesk.GenericLiabraries;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ListenerS  implements ITestListener{
	ExtentReports reports;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
	 test=reports.createTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,result.getMethod().getMethodName()+"is Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName()+"is Failed");
		test.log(Status.FAIL,result.getThrowable());
		
		BaseClass baseclass= new BaseClass();
		try {
			baseclass.getscreenshot(result.getMethod().getMethodName());
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,result.getMethod().getMethodName()+"is Skipped");
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/ExtendRepository/SDET21.html");
		
		reporter.config().setDocumentTitle("SDET21");
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("BuildNo", "5.1");
		reports.setSystemInfo("ENV", "Pre-PROD");
		reports.setSystemInfo("Platform", "Windows");
		reports.setSystemInfo("Browser Version", "Chrome-93");
	}

	public void onFinish(ITestContext context) {
		reports.flush();
		
	}

}
