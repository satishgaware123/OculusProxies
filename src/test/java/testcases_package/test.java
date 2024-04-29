package testcases_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test extends Base_class{

	@Test(priority = 17)
	void verify_Auto_renew_Setting_Page_Is_Functional_under_configure_proxy_page() {
	    driver.get(url2);

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now '])[1]")));
	    WebElement tryNow = driver.findElement(By.xpath("(//button[text()=' Try now '])[1]"));
	    tryNow.click();

	    { 
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='tabaction'])["+1+"]")));
	        WebElement configure = driver.findElement(By.xpath("(//a[@id='tabaction'])["+1+"]"));
	        configure.click();
	        try {
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Add'])[1]")));
	            WebElement Change_Payment_Method = driver.findElement(By.xpath("(//a[text()='Add'])[1]"));
	            Change_Payment_Method.click();
	            
	            String actualURL = driver.getCurrentUrl();
	            String expectedString1 = "https://dev.oculusproxies.com/pricing/premium";
	            String expectedString2 = "https://dev.oculusproxies.com/pricing/sharedDC?planType=shared_dc";
	            String expectedString3 = "https://dev.oculusproxies.com/pricing/sharedDC?planType=dedicated_dc";

	            // Check if the actual URL matches one of the expected URLs
	            if(actualURL.equalsIgnoreCase(expectedString1) || 
	               actualURL.equalsIgnoreCase(expectedString2) || 
	               actualURL.equalsIgnoreCase(expectedString3)) {
	                System.out.println("Test case passed"); // Print to console if test case passed
	            } else {
	                Assert.fail("URL is not one of the expected URLs"); // Fail the test explicitly
	            }
	        } catch (Exception e) {
	            System.out.println("Exception occurred: " + e.getMessage());
	        }
	    }
	}

	
}