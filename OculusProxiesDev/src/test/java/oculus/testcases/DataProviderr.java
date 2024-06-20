package oculus.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderr {

	WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    void startBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @DataProvider(name = "loginData")
    public Object[][] provideLoginData() {
        return new Object[][] {
                {"SATISH2@GMAIL.COM", "valid_password2","invalid data"},
                {"SATISH3@GMAIL.COM", "invalid_password3","invalid data"},
                {"", "","ivalid data"}, // Empty username and password
                {"!@#$%^&*", "test123","invalid data"}, // Special characters
                {"student", "Password123","valid data"}
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, String msg) throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();
        System.out.println(username+" "+password+" "+msg);
        Thread.sleep(2000);
        
        String Owindow = driver.getWindowHandle();
        
        for(String window:driver.getWindowHandles()) {
        	
        	
        	if(!window.equals(Owindow)) {
        
        		driver.switchTo().window(window);
                String abc =  driver.getCurrentUrl();
                AssertJUnit.assertEquals(abc, "https://practicetestautomation.com/logged-in-successfully/");
                driver.close();
        	}       	
        }     
        	driver.switchTo().window(Owindow);
    }

    @AfterTest
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
