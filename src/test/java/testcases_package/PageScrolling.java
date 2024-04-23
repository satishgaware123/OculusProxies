package testcases_package;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageScrolling extends Base_class {


	@Test(priority = 1)
	void test001() throws Exception {
		
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;   //upcasting
			
			//jse.executeScript("window.scrollBy(0,10000)", "");
			WebElement Privacy_Policy =  driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
			
			jse.executeScript("arguments[0].scrollIntoView();", Privacy_Policy);
			
			
			
			Thread.sleep(5000);
		
			
		}
	
	catch (Exception e) {
			System.out.println(e);	
	}
		}
	
	
	
	
}
