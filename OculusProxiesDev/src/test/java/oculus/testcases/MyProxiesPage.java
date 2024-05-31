package oculus.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyProxiesPage extends BaseClass {

	
//	@Test(priority = 1)
	@Test(enabled = false)
	void verify_DetectMyIP_isFunctional() throws Exception {
		driver.get(url2);
		WebElement myproxiespage =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()=' Try now '])[1]")));
		myproxiespage.click();
		
		WebElement config =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()=' Configure '])[1]")));
		config.click();
		
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
	

	@Test(priority = 2)
	void verify_Try_Our_Document_Link_isFunctional() throws Exception {
		driver.get(url2);
		WebElement myproxiespage =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()=' Try now '])[1]")));
		myproxiespage.click();
		
		WebElement config =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()=' Configure '])[1]")));
		config.click();
		String orgWindow = driver.getWindowHandle();
		
		
		WebElement detectMyIP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='try our documentation']")));
		detectMyIP.click();
		for(String wind:driver.getWindowHandles()) {
			
			if(!wind.equals(orgWindow)) {
			driver.switchTo().window(wind);
		}
	}
		String curentURL = driver.getCurrentUrl();
		try {
			Assert.assertEquals(curentURL, "https://support.oculusproxies.com/hc/en-us/articles/23101526359835-Integrate-your-proxies-into-any-browser");
		} catch (Exception e) {
			System.out.println(e);
}	
		driver.switchTo().window(orgWindow);
		
}	
	

	
}
