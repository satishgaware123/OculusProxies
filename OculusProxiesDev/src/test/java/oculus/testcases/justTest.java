package oculus.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class justTest extends BaseClass2{
	

	@Test(priority = 1)
	void verify_DetectMyIP_isFunctional() throws Exception {
		driver.get(url3);				
		WebElement  Try_now_b = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try it yourself '])[1]")));
		Try_now_b.click();	
		
		WebElement detectMyIP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Detect my IP ']")));
		detectMyIP.click();
		Thread.sleep(1000);
		WebElement add =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Add ']")));
		add.click();
		
		WebElement getIP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' 49.36.81.181 ']")));
		String actString = getIP.getText();

		try {
			Assert.assertEquals(actString, "49.36.81.181");
		} catch (Exception e) {
			System.out.println(e);
}	
		driver.navigate().back();
}	
	
	
	
	
	
	
	
	
}


