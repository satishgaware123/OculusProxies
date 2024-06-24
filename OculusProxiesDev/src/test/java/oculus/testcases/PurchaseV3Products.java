package oculus.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class PurchaseV3Products  extends BaseClass {
	
//	@Test(enabled = false)
	@Test(priority = 1)
	void verifyISPProductPurchase() throws Exception {
	    driver.get(url2);

	    WebElement startNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Start Now '])[1]")));
	    startNow.click();

	   Thread.sleep(10000);
	    WebElement buyNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Buy now '])[1]")));
	    buyNow.click();

	    WebElement payNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Pay Now ']")));
	    payNow.click();

	    WebElement autoPayCheckBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label//input[@type='checkbox']")));
		 try {
			 boolean isSelected = autoPayCheckBox.isSelected();
			 Assert.assertTrue(isSelected, "The auto-renew checkbox is not selected by default.");
		 } catch (Exception e) {
			 System.out.println(e);
		 }

	    WebElement radio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='exampleRadios'])[1]")));
	    radio.click();
	    radio.click();

	    Actions actions = new Actions(driver);
	    actions.moveToElement(radio).click().sendKeys("31116633").build().perform();

	    WebElement payButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Pay '])[1]")));
	    payButton.click();

	    WebElement congratulationsMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Congratulations, your payment is successful! You can now start using your plan.']")));
	    String actualString = congratulationsMsg.getText();
	    String expectedString = "Congratulations, your payment is successful! You can now start using your plan.\n" +
	            "You can click here to check your plan details.";

	    try {
	        Assert.assertEquals(actualString, expectedString);
	        System.out.println("ISPPlusProduct: "+"Congratulations, your payment is successful! You can now start using your plan.");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }
    	WebElement sharedc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody//td)[1]")));
    	String expString = 	sharedc.getText();

    	try {

	        Assert.assertEquals(expString, "Static Residential (ISP)");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }
    	
    	WebElement sharedcprice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody//td)[5]")));
    	String expStringp = sharedcprice.getText();
    	try {
	        Assert.assertEquals(expStringp, "15.00 GB");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }
    	WebElement autorenew = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody//td)[5]")));
    	String autorenewtxt = autorenew.getText();
    	try {
	        Assert.assertEquals(autorenewtxt, "0 %");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }
	}

//	@Test(enabled =  false)
	@Test(priority = 2)
	void verifyISPPlusProductPurchase() throws Exception {
	    driver.get(url2);

	    WebElement startNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Start Now '])[1]")));
	    startNow.click();

	    WebElement buyNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Buy now '])[1]")));
	    buyNow.click();

	    WebElement payNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Pay Now ']")));
	    payNow.click();

	    WebElement autoPayCheckBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label//input[@type='checkbox']")));
		 try {
			 boolean isSelected = autoPayCheckBox.isSelected();
			 Assert.assertTrue(isSelected, "The auto-renew checkbox is not selected by default.");
		 } catch (Exception e) {
			 System.out.println(e);
		 }
	    WebElement radio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='exampleRadios'])[1]")));
	    radio.click();
	    radio.click();

	    Actions actions = new Actions(driver);
	    actions.moveToElement(radio).click().sendKeys("33332333").build().perform();

	    WebElement payButton = driver.findElement(By.xpath("(//button[text()=' Pay '])[1]"));
	    payButton.click();

	    WebElement congratulationsMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Congratulations, your payment is successful! You can now start using your plan.']")));
	    String actualString = congratulationsMsg.getText();
	    String expectedString = "Congratulations, your payment is successful! You can now start using your plan.\n" +
	            "You can click here to check your plan details.";

	    try {
	        Assert.assertEquals(actualString, expectedString);
	        System.out.println("ISPPlusProduct: "+"Congratulations, your payment is successful! You can now start using your plan.");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }		
	    
    	WebElement sharedc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody//td)[1]")));
    	String expString = 	sharedc.getText();

    	try {

	        Assert.assertEquals(expString, "Static Residential (ISP+)");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }
    	
    	WebElement sharedcprice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody//td)[5]")));
    	String expStringp = sharedcprice.getText();
    	try {
	        Assert.assertEquals(expStringp, "30 IP's");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }
    	WebElement autorenew = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody//td)[5]")));
    	String autorenewtxt = autorenew.getText();
    	try {
	        Assert.assertEquals(autorenewtxt, "0 %");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }
	    
	    
}
	@Test(priority = 3)
//	@Test(enabled = false)
	void verifySharedDCProductPurchase() throws Exception {
	    driver.get(url2);
	    WebElement startNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Start now '])[3]")));
	    startNow.click();
	    WebElement buyNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Buy now '])[1]")));
	    buyNow.click();
	    WebElement payNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Pay Now ']")));
	    payNow.click();
	    WebElement autoPayCheckBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label//input[@type='checkbox']")));

		 try {
			 boolean isSelected = autoPayCheckBox.isSelected();
			 Assert.assertTrue(isSelected, "The auto-renew checkbox is not selected by default.");
		 } catch (Exception e) {
			 System.out.println(e);
		 }

	    WebElement radio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='exampleRadios'])[1]")));
	    radio.click();
	    Thread.sleep(1000);
	    radio.click();
	    Actions actions = new Actions(driver);
	    actions.moveToElement(radio).click().sendKeys("986521485").build().perform();
	    WebElement payButton = driver.findElement(By.xpath("(//button[text()=' Pay '])[1]"));
	    payButton.click();
	    
	    WebElement congratulationsMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Congratulations, your payment is successful! You can now start using your plan.']")));
	    String actualString = congratulationsMsg.getText();
	    String expectedString = "Congratulations, your payment is successful! You can now start using your plan.\n" +
	            "You can click here to check your plan details.";

	    try {
	        Assert.assertEquals(actualString, expectedString);
	        System.out.println("SharedDCProduct: "+"Congratulations, your payment is successful! You can now start using your plan.");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }	    
    	//click on here
    	WebElement here = driver.findElement(By.xpath("//a[text()='here ']"));
    	here.click();  	
    	WebElement sharedc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody//td)[1]")));
    	String expString = 	sharedc.getText();
    	try {

	        Assert.assertEquals(expString, "Shared Datacenter");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }
    	
    	WebElement sharedcprice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody//td)[5]")));
    	String expStringp = sharedcprice.getText();
    	try {
	        Assert.assertEquals(expStringp, "30.00 GB");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }
    	WebElement autorenew = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody//td)[5]")));
    	String autorenewtxt = autorenew.getText();
    	try {
	        Assert.assertEquals(autorenewtxt, "0 %");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }  
	}

	@Test(enabled = false)
//	@Test(priority = 4)
	void verifyDedicatedDCProductPurchase() throws Exception {
	    driver.get(url2);

	    WebElement startNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Start Now '])[4]")));
	    startNow.click();

	    WebElement buyNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Buy now '])[1]")));
	    buyNow.click();

	    WebElement payNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Pay Now ']")));
	    payNow.click();

	    WebElement autoPayCheckBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label//input[@type='checkbox']")));
	    if (autoPayCheckBox.isSelected()) {
	        System.out.println("The auto-renew checkbox is selected by default.");
	    } else {
	        System.out.println("The auto-renew checkbox is not selected by default.");
	    }

	    WebElement radio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='exampleRadios'])[1]")));
	    radio.click();
	   
	    radio.click();

	    Actions actions = new Actions(driver);
	    actions.moveToElement(radio).click().sendKeys("33311113").build().perform();

	    WebElement payButton = driver.findElement(By.xpath("(//button[text()=' Pay '])[1]"));
	    payButton.click();

	    WebElement congratulationsMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Congratulations, your payment is successful! You can now start using your plan.']")));
	    String actualString = congratulationsMsg.getText();
	    //new chages
	    WebElement clickHere = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='here ']")));
	    clickHere.click();
	    
	    String expectedString = "Congratulations, your payment is successful! You can now start using your plan.\n" +
	            "You can click here to check your plan details.";

	    try {
	        Assert.assertEquals(actualString, expectedString);
	        System.out.println("DedicatedDC: "+"Congratulations, your payment is successful! You can now start using your plan.");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }
    	WebElement sharedc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody//td)[1]")));
    	String expString = 	sharedc.getText();

    	try {

	        Assert.assertEquals(expString, "Dedicated Datacenter");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }
    	
    	WebElement sharedcprice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody//td)[5]")));
    	String expStringp = sharedcprice.getText();
    	try {
	        Assert.assertEquals(expStringp, "25 IP's");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }
    	WebElement autorenew = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody//td)[5]")));
    	String autorenewtxt = autorenew.getText();
    	try {
	        Assert.assertEquals(autorenewtxt, "0 %");
	    } catch (AssertionError e) {
	        System.out.println(e.getMessage());
	    }
	}

	
	
	
	
	
}
