package testcases_package;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Purchase_from_legacy extends Base_class {

	@Test
	void Purchase_ISP_Primium() throws Exception 
	{
		driver.get(url);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Purchase'])[1]")));	
	WebElement 	purchseISP_primium = driver.findElement(By.xpath("(//a[text()='Purchase'])[1]"));
	purchseISP_primium.click();
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));	
	WebElement 	PayNow = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
	PayNow.click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));	
	WebElement 	checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	
	if(!checkBox.isSelected()) {
		System.out.println("Auto renew CheckBox is not Selected Defoultly");
	}
	else {
		System.out.println("Auto renew CheckBox is Selected Defoultly");
	}

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='exampleRadios'])[1]")));	
	WebElement 	redio = driver.findElement(By.xpath("(//input[@name='exampleRadios'])[1]"));
	redio.click();
	Thread.sleep(2000);
	redio.click();
	
    // Create Actions object
    Actions actions = new Actions(driver);

    // Perform keyboard action to paste the number
    actions.moveToElement(redio)
           .click()  // Click on the input field to ensure it's focused
           .sendKeys("3333")  // Press CTRL + V to paste
           .build()
           .perform();
	
	WebElement 	Pay = driver.findElement(By.xpath("(//button[text()=' Pay '])[1]"));
	Pay.click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Congratulations, your payment is successful! You can now start using your plan.']")));	
	WebElement 	CongratulationsMsg = driver.findElement(By.xpath("//div[text()=' Congratulations, your payment is successful! You can now start using your plan.']"));
	String ActualString = CongratulationsMsg.getText();
	String expectedString = "Congratulations, your payment is successful! You can now start using your plan.\n"
			+ "You can click here to check your plan details.";	
	
	try {
		Assert.assertEquals(ActualString, expectedString);
		System.out.println("Congratulations, your payment is successful! You can now start using your plan.");
	} catch (Exception e) {
		System.out.println(e);
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
