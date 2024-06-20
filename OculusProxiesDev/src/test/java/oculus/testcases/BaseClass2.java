package oculus.testcases;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import oculus.utilities.ConfigDataProvider;

//oculus.testcases.BaseClass2
public class BaseClass2 {

	 WebDriver driver;
	 WebDriverWait wait;
	
	ConfigDataProvider data = new ConfigDataProvider();
	String url = data.getURL();
	String username = data.getUsername();
	String Pass = data.getPass();
	String url2 = data.getUrl2();
	String url3 = data.getUrl3();
	 
	
	@Parameters("browser")
	@BeforeClass
	void start_bowser(@Optional("chrome") String browser) {
	
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

        wait = new WebDriverWait(driver, 5);
		driver.manage().window().maximize();
		}		
		if(browser.equalsIgnoreCase("Edge"))
		{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(url);
//      Initialize WebDriverWait after WebDriver is instantiated
        wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();		
		}	
}	
//    @AfterMethod
//    public void takeSS() throws IOException {
//        String names = UUID.randomUUID().toString();
//        String path = "/home/hp/eclipse-workspace/OculusProxiesDev/Oculus_Report/screenshots/" + names + ".png";
//        File destination = new File(path);
//        
//        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(source, destination);
//    }
	
		@AfterClass		
		void Close_Browser() {			
			driver.close();	
}
	
}
