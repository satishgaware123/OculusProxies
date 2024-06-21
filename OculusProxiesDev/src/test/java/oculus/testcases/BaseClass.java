package oculus.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import oculus.utilities.ConfigDataProvider;
import oculus.utilities.TakingScreenshot;
import utils.SessionManager;

public class BaseClass {
	 WebDriver driver;
	 WebDriverWait wait;
	
	ConfigDataProvider data = new ConfigDataProvider();
 
	String url = data.getURL();
	String username = data.getUsername();
	String Pass = data.getPass();
	String url2 = data.getUrl2();
	String MyPxoxiesPageurl = data.getUrl3();
@Parameters("browser")

	@BeforeClass
	void start_bowser(@Optional("chrome") String browser) throws Exception {	
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url2);
		//get cookies 

		SessionManager sessionManager = new SessionManager(driver);
//		sessionManager.storeSessionFile("oculus","satish");
		sessionManager.usePreviousLoggedInSession("oculus");
        
//      Initialize WebDriverWait after WebDriver is instantiated
        wait = new WebDriverWait(driver, 60);
		driver.manage().window().maximize();

		}
		
		if(browser.equalsIgnoreCase("Edge"))
		{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(url);
//      Initialize WebDriverWait after WebDriver is instantiated
        wait = new WebDriverWait(driver, 1);
		driver.manage().window().maximize();
		
		}
	
		
	}    
	@AfterMethod
    public void takeSS(ITestResult result) throws IOException {
    	if(ITestResult.FAILURE==result.getStatus()) {
    		TakingScreenshot.takesSS(driver,result.getName());
    	}

    }
	
		@AfterClass
		
		void Close_Browser() {
			
			driver.close();
	
}
	
}