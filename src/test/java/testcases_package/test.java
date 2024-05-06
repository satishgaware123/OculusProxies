package testcases_package;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test extends Base_class2{


	@Test(priority = 1)
	void test001() throws Exception {
	  
 
		
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pricing-dropdown")));
	    
		WebElement dropdown = driver.findElement(By.id("pricing-dropdown"));
		dropdown.click();

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//a[@href='/pricing/premium']")));
			WebElement Premium_DC= driver.findElement(By.xpath("//div//a[@href='/pricing/premium']"));
			Premium_DC.click();
						
		} catch (Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		String actuaString = driver.getCurrentUrl();
	    String expectedString  = "https://dev.oculusproxies.com/pricing/premium";
	    //Thread.sleep(2000);
	    
	   try { 
			Assert.assertEquals(actuaString, expectedString);			   
		   }
	   catch (Exception e) 
		   {			
			System.out.println(e);
		   }	
	   
	   // 2nd option in dropdown
	   driver.get(url);
	   
	   WebElement dropdown2 = driver.findElement(By.id("pricing-dropdown"));
		dropdown2.click();
	    
		Thread.sleep(2000);
		
		WebElement Residential_Proxies = driver.findElement(By.xpath("//a[text()='Residential Proxies']"));
		Residential_Proxies.click();

		wait.until(ExpectedConditions.urlContains("/pricing/residential"));
		String actuaString1 = driver.getCurrentUrl();
	    String expectedString1  = "https://dev.oculusproxies.com/pricing/residential";
	    //Thread.sleep(2000);
	    
	   try {	   
			Assert.assertEquals(actuaString1, expectedString1);  
	       } 
	   catch (Exception e) 
	        {
		     System.out.println(e);
	        } 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}