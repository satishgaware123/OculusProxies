package testcases_package;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import groovyjarjarantlr4.v4.runtime.tree.xpath.XPath;

public class sanity_Test_Before_Login extends Base_class{

	
	// for legacy

	@Test(priority = 1)
	void test001() throws Exception {
	  
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pricing-dropdown")));
	    
		WebElement dropdown = driver.findElement(By.id("pricing-dropdown"));
		dropdown.click();
	    
		Thread.sleep(2000);
		
		WebElement Premium_DC_ISP_Proxies = driver.findElement(By.xpath("//a[text()='Premium DC ISP Proxies']"));
		Premium_DC_ISP_Proxies.click();
		
		
		Thread.sleep(2000);
		String actuaString = driver.getCurrentUrl();
	    String expectedString  = "https://dev.oculusproxies.com/pricing/premium";
	    //Thread.sleep(2000);
	    
	   try {
		
		    //SoftAssert softAssert = new SoftAssert(); 
			//softAssert.assertEquals(actuaString, expectedString, "First soft assert failed");   
			AssertJUnit.assertEquals(actuaString, expectedString);
			   
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
	   
			AssertJUnit.assertEquals(actuaString1, expectedString1);
  
	       } 
	   catch (Exception e) 
	        {
		     System.out.println(e);
	        } 

	}

	@Test(priority = 2)       // verify dropdown values Oculus Network Performance
	void test002() throws Exception 
	{
		    driver.get(url);
		   
		    WebElement dropdown2 = driver.findElement(By.id("pricing-dropdown"));
			dropdown2.click();
		    
			Thread.sleep(2000);
			
			WebElement Residential_Proxies = driver.findElement(By.xpath("//a[text()='Residential Proxies']"));
			Residential_Proxies.click();
			Thread.sleep(3000);

        WebElement dropdownElement = driver.findElement(By.xpath("(//select[@class='select-box'])[1]")); 
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
            if (!found) {
                System.out.println("Value '" + expectedValue + "' is missing from the Oculus Network Performance dropdown.");
            }
        }
	}
		

    	@Test(priority = 3)       // verify dropdown values Oculus Network Retail
    	void test003() throws Exception 
    	{
    		    driver.get(url);
    		   
    		    WebElement dropdown2 = driver.findElement(By.id("pricing-dropdown"));
    			dropdown2.click();
    		    
    			Thread.sleep(2000);
    			
    			WebElement Residential_Proxies = driver.findElement(By.xpath("//a[text()='Residential Proxies']"));
    			Residential_Proxies.click();
    			Thread.sleep(3000);

            WebElement dropdownElement = driver.findElement(By.xpath("(//select[@class='select-box'])[2]")); 
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
                if (!found) {
                    System.out.println("Value '" + expectedValue + "' is missing from the Oculus Network Retail dropdown.");
                }
            }
    	}
        

        	@Test(priority = 4)       // verify dropdown values Oculus Network Reserve
        	void test004() throws Exception 
        	{
        		    driver.get(url);
        		   
        		    WebElement dropdown2 = driver.findElement(By.id("pricing-dropdown"));
        			dropdown2.click();
        		    
        			Thread.sleep(2000);
        			
        			WebElement Residential_Proxies = driver.findElement(By.xpath("//a[text()='Residential Proxies']"));
        			Residential_Proxies.click();
        			Thread.sleep(3000);

                WebElement dropdownElement = driver.findElement(By.xpath("(//select[@class='select-box'])[3]")); 
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
                    if (!found) {
                        System.out.println("Value '" + expectedValue + "' is missing from the Oculus Network Reserve dropdown.");
                    }
                }
            
        	}
        	
        	
        	
        	@Test(enabled = false)       // verify dropdown values Premium DC ISP Proxies
        	void test005() throws Exception 
        	{
        		    driver.get(url);
    
        			Thread.sleep(2000);
        		    WebElement dropdown2 = driver.findElement(By.id("pricing-dropdown"));
        			dropdown2.click();
        			Thread.sleep(2000);
        			WebElement Residential_Proxies = driver.findElement(By.xpath("//a[text()='Premium DC ISP Proxies']"));
        			Residential_Proxies.click();
        			
        			WebDriverWait wait = new WebDriverWait(driver, 30);
        			
        			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box ng-pristine ng-valid ng-touched'])[1]")));
                WebElement dropdownElement = driver.findElement(By.xpath("(//select[@class='select-box ng-pristine ng-valid ng-touched'])[1]")); 
                dropdownElement.click();
                Select dropdown = new Select(dropdownElement);

                List<String> expectedValues = Arrays.asList("10", "25", "50", "100", "200", "400","500");

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
                        System.out.println("Value '" + expectedValue + "' is missing from the Oculus Network Reserve dropdown.");
                    }
                }
            
        	}
                
               	
            	@Test(priority = 6)       // verify server CTA is Functional
            	void test006() throws Exception 
            	{
            		
            		String originalTab = driver.getWindowHandle();
            		// Click on the link to open the new tab
            		WebElement server = driver.findElement(By.id("server"));
            		server.click();

            		// Get handles of all open tabs
            		Set<String> handles = driver.getWindowHandles();

            		// Switch to the new tab
            		for(String handle : handles) {
            		    if (!handle.equals(originalTab)) {
            		        driver.switchTo().window(handle);
            		        break;
            		    }
            		}

            		// Verify content of the new tab
            		String expectedTitle = "https://www.oculusservers.com/";
            		String actualTitle = driver.getCurrentUrl();

            		if (actualTitle.equals(expectedTitle)) {
            		    System.out.println("Correct tab is opened.");
            		} else {
            		    System.out.println("Incorrect tab is opened: "+ actualTitle);
            		}

            		// Optionally switch back to the original tab
            		 driver.switchTo().window(originalTab);


            	}
            	
            	@Test(priority = 7)       // verify FAQ CTA is Functional
            	void test007() throws Exception 
            	{
            		driver.get(url);
            		Thread.sleep(2000);
            		WebDriverWait wait = new WebDriverWait(driver, 30);
        			
        			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='faq']")));

            		String originalTab = driver.getWindowHandle();
            		// Click on the link to open the new tab
            		WebElement FAQ = driver.findElement(By.xpath("//a[@id='faq']"));
            		FAQ.click();
            		

            		
            		// Get handles of all open tabs
            		Set<String> handles = driver.getWindowHandles();

            		// Switch to the new tab
            		for(String handle : handles) {
            		    if (!handle.equals(originalTab)) {
            		        driver.switchTo().window(handle);
            		        
            		        break;
            		    }
            		}
						driver.close();

						// Get handles of all open tabs
						Set<String> handles2 = driver.getWindowHandles();

						// Switch to the new tab
						for(String handle : handles2) {
						    if (!handle.equals(originalTab)) {
						        driver.switchTo().window(handle);
						        
						        break;
						    }
						}
            		

						String expectedurl = "https://support.oculusproxies.com/hc/en-us";
						String actualurl = driver.getCurrentUrl();
               		
               		
            		if (actualurl.equals(expectedurl)) {
            		    System.out.println("Correct tab is opened.");
            		} else {
            		    System.out.println("Incorrect tab is opened: "+ actualurl);
            		    System.out.println("Expected: "+ expectedurl);
            		}

            		// Optionally switch back to the original tab
            		//driver.switchTo().window(originalTab);


            	}
            	
            	@Test(priority = 8)       // verify contact CTA is Functional
            	void test008() throws Exception 
            	{
            		driver.get(url);
            		Thread.sleep(2000);
            		WebDriverWait wait = new WebDriverWait(driver, 30);
        			
        			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='contact']")));

            		String originalTab = driver.getWindowHandle();
            		// Click on the link to open the new tab
            		WebElement FAQ = driver.findElement(By.xpath("//a[@id='contact']"));
            		FAQ.click();
            		

            		
            		// Get handles of all open tabs
            		Set<String> handles = driver.getWindowHandles();

            		// Switch to the new tab
            		for(String handle : handles) {
            		    if (!handle.equals(originalTab)) {
            		        driver.switchTo().window(handle);
            		        
            		        break;
            		    }
            		}
						driver.close();

						// Get handles of all open tabs
						Set<String> handles2 = driver.getWindowHandles();

						// Switch to the new tab
						for(String handle : handles2) {
						    if (!handle.equals(originalTab)) {
						        driver.switchTo().window(handle);
						        
						        break;
						    }
						}
            		

						String expectedurl = "https://support.oculusproxies.com/hc/en-us/requests/new";
						String actualurl = driver.getCurrentUrl();
               		
               		
            		if (actualurl.equals(expectedurl)) {
            		    System.out.println("Correct tab is opened.");
            		} else {
            		    System.out.println("Incorrect tab is opened: "+ actualurl);
            		    System.out.println("Expected: "+ expectedurl);
            		}

            		// Optionally switch back to the original tab
            		//driver.switchTo().window(originalTab);


            	}
            	
            	@Test(priority = 9)       // verify home CTA is Functional
            	void test009() throws Exception 
            	{
            		driver.get(url);
            		Thread.sleep(2000);
            		WebDriverWait wait = new WebDriverWait(driver, 30);
        			
        			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='home']")));

            		String originalTab = driver.getWindowHandle();
            		// Click on the link to open the new tab
            		WebElement FAQ = driver.findElement(By.xpath("//a[@id='home']"));
            		FAQ.click();
            		

            		
            		// Get handles of all open tabs
            		Set<String> handles = driver.getWindowHandles();

            		// Switch to the new tab
            		for(String handle : handles) {
            		    if (!handle.equals(originalTab)) {
            		        driver.switchTo().window(handle);
            		        
            		        break;
            		    }
            		}
						//driver.close();

						// Get handles of all open tabs
						Set<String> handles2 = driver.getWindowHandles();

						// Switch to the new tab
						for(String handle : handles2) {
						    if (!handle.equals(originalTab)) {
						        driver.switchTo().window(handle);
						        
						        break;
						    }
						}
            		

						String expectedurl = "https://dev.oculusproxies.com/legacy";
						String actualurl = driver.getCurrentUrl();
               		
               		
            		if (actualurl.equals(expectedurl)) {
            		    System.out.println("Correct tab is opened.");
            		} else {
            		    System.out.println("Incorrect tab is opened: "+ actualurl);
            		    System.out.println("Expected: "+ expectedurl);
            		}

            		// Optionally switch back to the original tab
            		//driver.switchTo().window(originalTab);


            	}
            	@Test(priority = 10)       // verify login CTA is Functional
            	void test010() throws Exception 
            	{
            		driver.get(url);
            		Thread.sleep(2000);
            		WebDriverWait wait = new WebDriverWait(driver, 30);
        			
        			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='login']")));

        			
            		// Click on the link to open the new tab
            		WebElement login = driver.findElement(By.xpath("//a[@id='login']"));
            		login.click();

            		Thread.sleep(2000);            		
            		

						String expectedurl = "https://dev.oculusproxies.com/login";
						String actualurl = driver.getCurrentUrl();
               		
               		
            		if (actualurl.equals(expectedurl)) {
            		    System.out.println("Correct tab is opened.");
            		} else {
            		    System.out.println("Incorrect tab is opened: "+ actualurl);
            		    System.out.println("Expected: "+ expectedurl);
            		}

            		// Optionally switch back to the original tab
            		//driver.switchTo().window(originalTab);

            	}    	
            	
            	@Test(priority = 11)       // verify login CTA is Functional
            	void test011() throws Exception 
            	{
            		driver.get(url);
            		Thread.sleep(2000);
            		WebDriverWait wait = new WebDriverWait(driver, 30);
        			
        			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='signup']")));

        			
            		// Click on the link to open the new tab
            		WebElement signin = driver.findElement(By.xpath("//a[@id='signup']"));
            		signin.click();

            		Thread.sleep(2000);            		
            		

						String expectedurl = "https://dev.oculusproxies.com/register";
						String actualurl = driver.getCurrentUrl();
               		
               		
            		if (actualurl.equals(expectedurl)) {
            		    System.out.println("Correct tab is opened.");
            		} else {
            		    System.out.println("Incorrect tab is opened: "+ actualurl);
            		    System.out.println("Expected: "+ expectedurl);
            		}

            		// Optionally switch back to the original tab
            		//driver.switchTo().window(originalTab);


            	}
            	
            	
            	
}

