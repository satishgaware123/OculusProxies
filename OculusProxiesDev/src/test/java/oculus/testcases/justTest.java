package oculus.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(oculus.utilities.listeners.class)

public class justTest extends BaseClass2 {
	
	
	@Test(priority = 1)
	void verify_naviagate_to_ISP_ProductPage() throws Exception {
		driver.get(url2);
		WebElement signup =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='navbar-drop2']")));
		signup.click();
		
		WebElement Static_residential_ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Static Residential (ISP)']")));
		Static_residential_ISP.click();
		
		String expectedUrl = "https://dev.oculusproxies.com/products/isp";
		String actualUrl = driver.getCurrentUrl();
		try {
			AssertJUnit.assertEquals(actualUrl, expectedUrl, "Incorrect tab is opened. Expected: " + expectedUrl + ", Actual: " + actualUrl);
		} catch (Exception e) {
			System.out.println(e);
}	
		driver.navigate().back();
}	
	
	

	@Test(priority = 2)
	void verifyALLProductInProductDropdown() throws Exception {
		WebElement price =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbar-drop2']")));
		price.click();
		
		WebElement pricePage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Static Residential (ISP)']")));
		String ActualText = pricePage.getText();
		String ExpectedText = "Static Residential (ISP)";
		
		try {
			AssertJUnit.assertEquals(ActualText, ExpectedText);
		} catch (Exception e) {
			System.out.println(e);
}
		WebElement pricePage2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Static Residential (ISP+)']")));
		String ActualTextispPlus = pricePage2.getText();
		String ExpectedTextispPlus = "Static Residential (ISP+)";
		
		try {
			AssertJUnit.assertEquals(ExpectedTextispPlus, ActualTextispPlus);
		} catch (Exception e) {
			System.out.println(e);
}
		WebElement pricePage3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Shared Datacenter']")));
		String ActualTextispShared = pricePage3.getText();
		String ExpectedTextiShered = "Shared Datacenter";
		
		try {
			AssertJUnit.assertEquals(ExpectedTextiShered, ActualTextispShared);
		} catch (Exception e) {
			System.out.println(e);
}
		WebElement pricePage4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Dedicated Datacenter']")));
		String ActualTextispDDC = pricePage4.getText();
		String ExpectedTextiDDC = "Dedicated Datacenter";
		
		try {
			AssertJUnit.assertEquals(ExpectedTextiDDC, ActualTextispDDC);
		} catch (Exception e) {
			System.out.println(e);
}	
		WebElement pricePage5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/products/free']")));
		String FreeActual = pricePage5.getText();
		String FreeExpected = "Free Datacenter";
		
		try {
			AssertJUnit.assertEquals(FreeExpected, FreeActual);
		} catch (Exception e) {
			System.out.println(e);
   }
}	
	@Test(priority = 3)
	void verify_dropdown_values_ISP() throws Exception  {
		driver.get(url2);
		 WebElement  StartNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/pricing']")));
		 StartNow.click();	    			
		 Thread.sleep(2000);
		 WebElement  ISPCTA  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'ISP')]")));
		 ISPCTA.click();
		 
		WebElement  dropdownElementISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[1]")));
		Select dropdown = new Select(dropdownElementISP);
		
		
		List<String> expectedValues = Arrays.asList("15 GB - $18","50 GB - $60","150 GB - $150");
		
        List<WebElement> dropdownOptions = dropdown.getOptions();
        for (String expectedValue : expectedValues) {
        	boolean found = false;
            for (WebElement option : dropdownOptions) {
            	if (option.getText().equals(expectedValue)) {
                	found = true;
                    break;
                	}
            }
            if (!found) {
            	System.out.println("Value '" + expectedValue + "' is missing from ISP");
            }
        }
}
   
	        @Test(priority = 4)
	    	void verify_dropdown_values_ISPplus() throws Exception  {	        	
	    	driver.get(url2);
	   		 WebElement  StartNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/pricing']")));
	   		 StartNow.click();	    			
	   		 Thread.sleep(2000);
	   		 WebElement  ISPCTA  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'ISP')]")));
	   		 ISPCTA.click();	
			WebElement  dropdownElementISPPlus  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[2]")));
			Select dropdown2 = new Select(dropdownElementISPPlus);
			
			List<String> expectedValues2 = Arrays.asList("30 IP, 1 TB - $48","50 IP, 2 TB - $80","200 IP, 8 TB - $300");
			
			List<WebElement> dropdownOptions2 = dropdown2.getOptions();
			for (String expectedValue2 : expectedValues2) {
			    boolean found = false;
			    for (WebElement option : dropdownOptions2) {
			        if (option.getText().equals(expectedValue2)) {
			            found = true;
			            break;
			        }
			    }
			    if (!found) {
			        System.out.println("Value '" + expectedValue2 + "' is missing from ISPplus.");
	    }		
	}
 }		
    
}
