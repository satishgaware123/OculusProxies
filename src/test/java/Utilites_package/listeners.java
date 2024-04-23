package Utilites_package;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class listeners implements ITestListener{
	
//Utilites_package.listeners
	ExtentTest test;
	
	ExtentReports extent = ExtentReportGenerator.generateReport();
	ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) 
	{
		test = extent.createTest(result.getTestClass().getName()+"**"+result.getMethod().getMethodName());
		extenttest.set(test);
	}	
	
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "Test Case Passed");
	}
	public void onTestFailure(ITestResult result) {
		
		test.log(Status.FAIL, "Test Case Failed");
	}
	public void onTestSkipped(ITestResult result) {
		
		test.log(Status.SKIP, "Test Case Skipped");
		
	}
	public void onFinish(ITestContext context) {
			
			extent.flush();
	}

	
	
	
	
}
