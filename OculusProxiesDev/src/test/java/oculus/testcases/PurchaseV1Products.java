 package oculus.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PurchaseV1Products extends BaseClass {

//	@Test(enabled = false)
	@Test(priority = 1)
	void purchaseISPPremium() throws Exception {
	    driver.get(url);

	    WebElement purchaseISPPremium = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Purchase'])[1]")));
	    purchaseISPPremium.click();

	    WebElement payNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
	    payNow.click();

	    WebElement checkBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
	    if (!checkBox.isSelected()) {
	        System.out.println("!!! Auto renew CheckBox is not selected by default !!!");
	    } else {
	        System.out.println("Auto renew CheckBox is selected by default.");
	    }

	    WebElement radio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='exampleRadios'])[1]")));
	    radio.click();
	    Thread.sleep(2000);
	    radio.click();

	    Actions actions = new Actions(driver);
	    actions.moveToElement(radio)
	            .click()
	            .sendKeys("3333")
	            .build()
	            .perform();

	    WebElement payButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
	    payButton.click();

	    WebElement congratulationsMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Congratulations, your payment is successful! You can now start using your plan.']")));
	    String actualString = congratulationsMsg.getText();
	    String expectedString = "Congratulations, your payment is successful! You can now start using your plan.\n" +
	            "You can click here to check your plan details.";

	    try {
	        Assert.assertEquals(actualString, expectedString);
	        System.out.println("Congratulations, your payment is successful! You can now start using your plan.");
	    } catch (AssertionError e) {
	    	
	    	System.out.println(e);
	    	try {
		        System.out.println(e.getMessage());
		        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        String location = "/home/hp/eclipse-workspace/OculusProxiesDev/Oculus_Report/screenshots"+"/abc.jpg";	    
		        FileUtils.copyFile(screenshot, new File(location)); 
			} catch (Exception e2) {
				System.out.println(e2);
			}
    }
}

//	@Test(enabled = false)
	@Test(priority = 1)
	void purchaseISPEvents() throws Exception {
	    driver.get(url);

	    WebElement purchaseISPEvent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Purchase'])[2]")));
	    purchaseISPEvent.click();

	    WebElement payNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
	    payNow.click();

	    WebElement checkBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
	    if (!checkBox.isSelected()) {
	        System.out.println("Auto renew CheckBox is not selected by default.");
	    } else {
	        System.out.println("Auto renew CheckBox is selected by default.");
	    }

	    WebElement radio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='exampleRadios'])[1]")));
	    radio.click();
	    Thread.sleep(2000);
	    radio.click();

	    Actions actions = new Actions(driver);
	    actions.moveToElement(radio)
	            .click()
	            .sendKeys("311333")
	            .build()
	            .perform();

	    WebElement payButton = driver.findElement(By.xpath("(//button[text()=' Pay '])[1]"));
	    payButton.click();

	    WebElement congratulationsMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Congratulations, your payment is successful! You can now start using your plan.']")));
	    String actualString = congratulationsMsg.getText();
	    String expectedString = "Congratulations, your payment is successful! You can now start using your plan.\n" +
	            "You can click here to check your plan details.";

	    try {
	        Assert.assertEquals(actualString, expectedString);
	        System.out.println("Congratulations, your payment is successful! You can now start using your plan.");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String location = "/home/hp/git/repository3/Oculus_Report";
	        FileUtils.copyFile(screenshot, new File(location));  
	    }
	}

//	@Test(enabled = false)
	@Test(priority = 3)
	void purchaseOculusNetworkPerformance() throws Exception {
	    driver.get(url);

	    WebElement residentialPlans = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' Residential Plans ']")));
	    residentialPlans.click();
	    
	    WebElement purchaseISPEvent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()=' Purchase '])[1]")));
	    purchaseISPEvent.click();

	    WebElement payNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
	    payNow.click();

	    WebElement checkBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
	    if (!checkBox.isSelected()) {
	        System.out.println("Auto renew CheckBox is not selected by default.");
	    } else {
	        System.out.println("Auto renew CheckBox is selected by default.");
	    }

	    WebElement radio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='exampleRadios'])[1]")));
	    radio.click();
	    Thread.sleep(2000);
	    radio.click();

	    Actions actions = new Actions(driver);
	    actions.moveToElement(radio)
	            .click()
	            .sendKeys("311333")
	            .build()
	            .perform();

	    WebElement payButton = driver.findElement(By.xpath("(//button[text()=' Pay '])[1]"));
	    payButton.click();

	    WebElement congratulationsMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Congratulations, your payment is successful! You can now start using your plan.']")));
	    String actualString = congratulationsMsg.getText();
	    String expectedString = "Congratulations, your payment is successful! You can now start using your plan.\n" +
	            "You can click here to check your plan details.";

	    try {
	        Assert.assertEquals(actualString, expectedString);
	        System.out.println("Congratulations, your payment is successful! You can now start using your plan.");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String location = "/home/hp/git/repository3/Oculus_Report";
	        FileUtils.copyFile(screenshot, new File(location));  
	    }
}

//	@Test(enabled = false)
	@Test(priority = 4)
	void purchaseOculusNetworkRetail() throws Exception {
	    driver.get(url);

	    WebElement residentialPlans = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' Residential Plans ']")));
	    residentialPlans.click();
	    
	    WebElement purchaseISPEvent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()=' Purchase '])[2]")));
	    purchaseISPEvent.click();

	    WebElement payNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
	    payNow.click();

	    WebElement checkBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
	    if (!checkBox.isSelected()) {
	        System.out.println("Auto renew CheckBox is not selected by default.");
	    } else {
	        System.out.println("Auto renew CheckBox is selected by default.");
	    }

	    WebElement radio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='exampleRadios'])[1]")));
	    radio.click();
	    Thread.sleep(2000);
	    radio.click();

	    Actions actions = new Actions(driver);
	    actions.moveToElement(radio)
	            .click()
	            .sendKeys("311333")
	            .build()
	            .perform();

	    WebElement payButton = driver.findElement(By.xpath("(//button[text()=' Pay '])[1]"));
	    payButton.click();

	    WebElement congratulationsMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Congratulations, your payment is successful! You can now start using your plan.']")));
	    String actualString = congratulationsMsg.getText();
	    String expectedString = "Congratulations, your payment is successful! You can now start using your plan.\n" +
	            "You can click here to check your plan details.";

	    try {
	        Assert.assertEquals(actualString, expectedString);
	        System.out.println("Congratulations, your payment is successful! You can now start using your plan.");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String location = "/home/hp/git/repository3/Oculus_Report";
	        FileUtils.copyFile(screenshot, new File(location));  
	    }
	}
	

	
}
