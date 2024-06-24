package oculus.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(oculus.utilities.listeners.class)

public class justTest extends BaseClass {
	
	@Test(priority =38)
	void verify_free_Plan() throws Exception {
		driver.get(url2);
		WebElement TryNowForFree =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div//button[text()=' Try now for free '])[1]")));
		TryNowForFree.click();
		String cURL = driver.getCurrentUrl();		
		try {
			Assert.assertEquals(cURL, "https://dev.oculusproxies.com/pricing/sharedDC?planType=free");		
		} catch (Exception e) {
			System.out.println(e);
		}
		WebElement GetStarted =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Get started ']")));
		GetStarted.click();		
		WebElement abcElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Your free plan was already used or has expired. ']")));
		String acTEXT= abcElement.getText();
		try {
			Assert.assertEquals(acTEXT, "Your free plan was already used or has expired.");		
		} catch (Exception e) {
			System.out.println(e);
		}
		WebElement GoToMyProxies =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button//span[text()=' Go to My Proxies ']")));
		GoToMyProxies.click();			
		String cURL2 = driver.getCurrentUrl();	
		try {
			Assert.assertEquals(cURL2, "https://dev.oculusproxies.com/orders/ispProxy");		
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}	
   
}
