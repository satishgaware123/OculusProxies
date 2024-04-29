package testcases_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import Utilites_package.ConfigDataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base_class2 {

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

        wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		System.out.println(" ============ Starting Session Management Tests ===============\n\n");

		}
		
		if(browser.equalsIgnoreCase("Edge"))
		{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(url);
//      Initialize WebDriverWait after WebDriver is instantiated
        wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		
		}
	
	}
	
		@AfterClass
		
		void Close_Browser() {
			
			driver.close();
	
}
	
}
