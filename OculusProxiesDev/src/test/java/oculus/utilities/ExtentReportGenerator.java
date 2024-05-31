package oculus.utilities;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {

	
	public static ExtentReports generateReport() {
	
	String ReportPath = "/home/hp/eclipse-workspace/OculusProxiesDev/Oculus_Report";
	
	ExtentSparkReporter repoter = new ExtentSparkReporter(ReportPath);
	  
	repoter.config().setDocumentTitle("Oculus_Web_Aplication");
	
	repoter.config().setReportName("Oculus_Test_Result");
	
	repoter.config().setTheme(Theme.STANDARD);
	
	ExtentReports extent = new ExtentReports();
	
	extent.attachReporter(repoter);
	
	extent.setSystemInfo("aplication Type", "Web_Application");
	extent.setSystemInfo("Application name","Oculus Proxies");
	extent.setSystemInfo("Browser", "Chrome");
	extent.setSystemInfo("QA Name", "Satish Gaware");
	extent.setSystemInfo("OS", "Linux");
	
	return extent;
			
	}
	
}
