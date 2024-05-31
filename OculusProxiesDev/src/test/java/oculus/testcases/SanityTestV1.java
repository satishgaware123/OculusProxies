package oculus.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class SanityTestV1 extends BaseClass2 {
	

	@Test(priority = 1)
	void verifyNavigatingToPricing() throws Exception {	 
		Thread.sleep(1000);
	    WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//li//a[text()=' Pricing ']")));
	    dropdown.click();

	    WebElement premiumDCISPProxies = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/pricing/premium']")));
	    premiumDCISPProxies.click();

	    wait.until(ExpectedConditions.urlToBe("https://dev.oculusproxies.com/pricing/premium"));
	    String actualURL = driver.getCurrentUrl();
	    String expectedURL = "https://dev.oculusproxies.com/pricing/premium";

	    try {
	        Assert.assertEquals(actualURL, expectedURL);
	        System.out.println("Premium DC ISP Proxies link navigation verified.");
	    } catch (AssertionError e) {
	        System.out.println("Failed to verify Premium DC ISP Proxies link navigation.");
	        System.out.println(e.getMessage());
	    }

	    driver.get(url);
	    Thread.sleep(1000);
	    WebElement dropdown2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//li//a[text()=' Pricing ']")));
	    dropdown2.click();
	    WebElement residentialProxies = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Residential Proxies']")));
	    residentialProxies.click();

	    wait.until(ExpectedConditions.urlContains("/pricing/residential"));
	    String actualURL2 = driver.getCurrentUrl();
	    String expectedURL2 = "https://dev.oculusproxies.com/pricing/residential";

	    try {
	        Assert.assertEquals(actualURL2, expectedURL2);
	        System.out.println("Residential Proxies link navigation verified.");
	    } catch (AssertionError e) {
	        System.out.println("Failed to verify Residential Proxies link navigation.");
	        System.out.println(e.getMessage());
	    }
	    driver.navigate().back();
	}


	@Test(priority = 2)
    void verifyDropdownValuesOculusNetworkPerformance() throws Exception {
        WebElement dropdown2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//li//a[@id='navbardrop']")));
        dropdown2.click();

        WebElement residentialProxies = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Residential Proxies']")));
        residentialProxies.click();

        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[1]")));
        Select dropdown = new Select(dropdownElement);

        List<String> expectedValues = Arrays.asList("5GB", "10GB", "20GB", "50GB", "100GB", "200GB");

        for (String expectedValue : expectedValues) {
            boolean found = false;
            List<WebElement> dropdownOptions = dropdown.getOptions();
            for (WebElement option : dropdownOptions) {
                if (option.getText().equals(expectedValue)) {
                    found = true;
                    break;
                }
            }
            try {
                Assert.assertTrue(found, "Value '" + expectedValue + "' is missing from the Oculus Network Performance dropdown.");
            } catch (Exception e) {
                System.out.println(e);
            }
            
       }
        
}
	
	@Test(priority = 3)
		void verifyDropdownValuesOculusNetworkRetail() throws InterruptedException {
		driver.navigate().back();
	try 
	{
		WebElement dropdown2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//li//a[@id='navbardrop']")));
	    dropdown2.click();
	    
	    WebElement residentialProxies = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Residential Proxies']")));
	    residentialProxies.click();
	    
	    WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[2]")));
	    Select dropdown = new Select(dropdownElement);
	
	    List<String> expectedValues = Arrays.asList("5GB", "10GB", "20GB", "50GB", "100GB", "200GB");
	
	    List<WebElement> dropdownOptions = dropdown.getOptions();
	    for (String expectedValue : expectedValues) {
	    	boolean found = false;
	        for (WebElement option : dropdownOptions) {
	        	if (option.getText().equals(expectedValue)) {
	            	found = true;
	                break;
	            }
	        }
	        try {
	        	Assert.assertTrue(found, "Value '" + expectedValue + "' is missing from the Oculus Network Performance dropdown.");
	        }
	        catch (Exception e) {
	        	System.out.println(e);
	        }
	        
	    }
		} catch (Exception e) {
		System.out.println(e);
	}
}
        
	@Test(priority = 4) 
	void verifyDropdownValuesOculusNetworkReserve() {
		driver.navigate().back();
	    WebElement dropdown1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//li//a[@id='navbardrop']")));
	    dropdown1.click();

	    WebElement residentialProxies =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Residential Proxies']")));
	    residentialProxies.click();

	    WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[3]")));
	    Select dropdown = new Select(dropdownElement);

	    List<String> expectedValues = Arrays.asList("10GB", "20GB", "50GB", "100GB");

        List<WebElement> dropdownOptions = dropdown.getOptions();
        for (String expectedValue : expectedValues) {
            boolean found = false;
            for (WebElement option : dropdownOptions) {
                if (option.getText().equals(expectedValue)) {
                    found = true;
                    break;
                }
            }
	        try {
	        	 Assert.assertTrue(found, "Value '" + expectedValue + "' is missing from the Oculus Network Performance dropdown.");
			} catch (Exception e) {
				System.out.println(e);
			}  
	    }     
	}

	@Test(priority = 5)
	void verifyDropdownValuesPremiumDC_ISPProxies() throws Exception {
		driver.navigate().back();
	    WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='navbardrop']")));
	    dropdown.click();

	    WebElement residentialProxies = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Premium DC ISP Proxies']")));
	    residentialProxies.click();

	    WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div//select[@class='select-box ng-untouched ng-pristine ng-valid'])[1]")));
	    Select dropdownSelect = new Select(dropdownElement);

	    List<String> expectedValues = Arrays.asList("10", "25", "50", "100", "200", "400", "500");

	    List<String> missingValues = new ArrayList<>();
	    for (String expectedValue : expectedValues) {
	        boolean found = false;
	        for (WebElement option : dropdownSelect.getOptions()) {
	            if (option.getText().equals(expectedValue)) {
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            missingValues.add(expectedValue);
	        }
	    }

	    if (!missingValues.isEmpty()) {
	        System.out.println("The following values are missing from the dropdown: " + missingValues);
	    }
	    
	}
                   	
	@Test(priority = 6)
	    void verifyServerCTAIsFunctional() throws Exception {
		  driver.navigate().back();
		  String originalTab = driver.getWindowHandle();
		  WebElement server = wait.until(ExpectedConditions.elementToBeClickable(By.id("server")));
	        server.click();

	        Set<String> handles = driver.getWindowHandles();

	        for (String handle : handles) {
	            if (!handle.equals(originalTab)) {
	                driver.switchTo().window(handle);
	                break;
	            }
	        }

	        String expectedUrl = "https://www.oculusservers.com/";
	        wait.until(ExpectedConditions.urlToBe(expectedUrl));

	        String actualUrl = driver.getCurrentUrl();
	        try {
	        	 Assert.assertEquals(actualUrl, expectedUrl, "The opened tab URL does not match the expected URL.");	
			} catch (Exception e) {
				System.out.println(e);
			}
	        driver.close();
	        driver.switchTo().window(originalTab);

	        wait.until(ExpectedConditions.urlToBe(url));
	    }
	  
	  
	@Test(priority = 7)
	    void verifyFAQFunction() throws Exception {
	        String originalTab = driver.getWindowHandle();
	        WebElement faq = wait.until(ExpectedConditions.elementToBeClickable(By.id("faq")));
	        faq.click();

	        Set<String> handles = driver.getWindowHandles();

	        for (String handle : handles) {
	            if (!handle.equals(originalTab)) {
	                driver.switchTo().window(handle);
	                break;
	            }
	        }

	        String expectedUrl = "https://support.oculusproxies.com/hc/en-us";
	        wait.until(ExpectedConditions.urlContains(expectedUrl));
	        String actualUrl = driver.getCurrentUrl();

	        try {
	        	 Assert.assertEquals(expectedUrl, actualUrl, "The opened tab URL does not match the expected URL.");	
			} catch (Exception e) {
				System.out.println(e);
			}
	        driver.close();
	        driver.switchTo().window(originalTab);

	        wait.until(ExpectedConditions.urlToBe(url));
	    }
		

	@Test(priority =8)
	    void verifyContactCTAIsFunctional() throws Exception {
	        String originalTab = driver.getWindowHandle();
	        WebElement contact = wait.until(ExpectedConditions.elementToBeClickable(By.id("contact")));
	        contact.click();

	        Set<String> handles = driver.getWindowHandles();
	        for (String handle : handles) {
	            if (!handle.equals(originalTab)) {
	                driver.switchTo().window(handle);
	                break;
	            }
	        }

	        String expectedUrl = "https://support.oculusproxies.com/hc/en-us/requests/new";
	        wait.until(ExpectedConditions.urlToBe(expectedUrl));

	        String actualUrl = driver.getCurrentUrl();
	        try {
	        	 Assert.assertEquals(actualUrl, expectedUrl, "The opened tab URL does not match the expected URL.");	
			} catch (Exception e) {
				System.out.println(e);
			}
	        driver.close();
	        driver.switchTo().window(originalTab);
	        wait.until(ExpectedConditions.urlToBe(url));
	    }
		

	@Test(priority = 9)
		void verifyLoginCTAIsFunctional() throws Exception {

		    WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='login']")));
		    login.click();
		    wait.until(ExpectedConditions.urlToBe("https://dev.oculusproxies.com/login"));
		    String expectedUrl = "https://dev.oculusproxies.com/login";
		    String actualUrl = driver.getCurrentUrl();
	 
		    try {
		 	   Assert.assertEquals(actualUrl, expectedUrl, "Incorrect tab is opened. Expected: " + expectedUrl + ", Actual: " + actualUrl);
		 } catch (Exception e) {
		 	System.out.println(e);
		 }		    
		}
		
		@Test(priority = 10)
		void verifySignUpCTAIsFunctional() throws Exception {
			driver.navigate().back();
			WebElement signup =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='signup']")));
			signup.click();
			wait.until(ExpectedConditions.urlToBe("https://dev.oculusproxies.com/register"));
			String expectedUrl = "https://dev.oculusproxies.com/register";
			String actualUrl = driver.getCurrentUrl();
			
			try {
				Assert.assertEquals(actualUrl, expectedUrl, "Incorrect tab is opened. Expected: " + expectedUrl + ", Actual: " + actualUrl);
			} catch (Exception e) {
				System.out.println(e);
	}		
			
	}		
		@Test(priority = 11)
			void verifyTERMSANDCONDITIONsFunctional() throws Exception {
				driver.navigate().back();
				
				WebElement TermsAndsCinditions =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/terms_conditions']")));
				TermsAndsCinditions.click();
				
				String expectedUrl = "https://dev.oculusproxies.com/terms_conditions";
				wait.until(ExpectedConditions.urlToBe("https://dev.oculusproxies.com/terms_conditions"));
				String actualUrl = driver.getCurrentUrl();
				
				try {
					Assert.assertEquals(actualUrl, expectedUrl, "Incorrect tab is opened. Expected: " + expectedUrl + ", Actual: " + actualUrl);
				} catch (Exception e) {
					System.out.println(e);
				}

}			
	
}
	


