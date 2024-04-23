package testcases_package;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

import groovyjarjarantlr4.v4.misc.Utils;
import utils.SessionManager;

import java.io.IOException;

public class BypassLogin extends Base_class{

	

    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println(" ============ Starting Session Management Tests ===============\n\n");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        
        driver.navigate().to("https://dev.oculusproxies.com");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='login']")));
//        WebElement login =  driver.findElement(By.xpath("//a[@id='login']"));
//        login.click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("satish.gaware@grovetech.in");
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Satu@321");
//       Thread.sleep(10000);
//
//       WebElement button =  driver.findElement(By.xpath("//button[@id='loginButton']"));
//       button.click();

        Thread.sleep(5000);
        System.out.println("Login successful...");


//get cookies 

        SessionManager sessionManager = new SessionManager(driver);

//       sessionManager.storeSessionFile("oculus","satish");

        sessionManager.usePreviousLoggedInSession("oculus");
    }
	
	
	
	
	
}
