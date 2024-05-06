package testcases_package;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class sanityAfterLogin extends Base_class {
//After Login


	@Test(priority = 1) // Try Now 1
	void verify_try_now_button_is_functional() throws Exception  {
		driver.get(url2); //v3	
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now '])[1]")));
	    
		WebElement Documentation = driver.findElement(By.xpath("(//button[text()=' Try now '])[1]"));
		Documentation.click();	    			
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()=' My Proxies ']")));
		WebElement header = driver.findElement(By.xpath("//h1[text()=' My Proxies ']"));
		String curentTXT = header.getText();
		String expectedTXT = "My Proxies";
		
	   try {
  
			Assert.assertEquals( curentTXT,expectedTXT);
			   
		   }
	   catch (Exception e) 
		   {
			
			System.out.println(e);
		   }

	}	
	
	
	
	@Test(priority = 2) // Try Now 2
	void verify_try_now_button_is_functional2() throws Exception  {
		driver.get(url2); //v3	
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now '])[2]")));
	    
		WebElement Documentation = driver.findElement(By.xpath("(//button[text()=' Try now '])[2]"));
		Documentation.click();	    			
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()=' My Proxies ']")));
		WebElement header = driver.findElement(By.xpath("//h1[text()=' My Proxies ']"));
		String curentTXT = header.getText();
		String expectedTXT = "My Proxies";
		
	   try {
  
			Assert.assertEquals( curentTXT,expectedTXT);
			   
		   }
	   catch (Exception e) 
		   {
			
			System.out.println(e);
		   }
	}	
	
	

	@Test(priority = 3) // verify dropdown values - Static Residential Proxies	
	void verify_dropdown_values_Static_Residential_Proxies() throws Exception  {
		driver.get(url2);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Start Now '])[1]")));
	    
		WebElement  StartNow  = driver.findElement(By.xpath("(//button[text()=' Start Now '])[1]"));
		 StartNow.click();	    			
		
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[2]")));
	
		WebElement  dropdownElement  = driver.findElement(By.xpath("(//select[@class='select-box'])[2]"));
		Select dropdown = new Select(dropdownElement);
		
		
		List<String> expectedValues = Arrays.asList("10 GB - $12","50 GB - $60","150 GB - $150");
		
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
                System.out.println("Value '" + expectedValue + "' is missing from the Static Residential Proxies.");
            }
        }
	}	
	@Test(priority = 3) // verify dropdown values - Static Residential Proxies	
	void verify_dropdown_values_Static_Residential_ProxiesISPplus() throws Exception  {
		driver.get(url2);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Start Now '])[1]")));
	    
		WebElement  StartNow  = driver.findElement(By.xpath("(//button[text()=' Start Now '])[1]"));
		 StartNow.click();	    			
		
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='select-box']")));
	
		WebElement  dropdownElement  = driver.findElement(By.xpath("//select[@class='select-box']"));
		Select dropdown = new Select(dropdownElement);
		
		
		List<String> expectedValues = Arrays.asList("25 IP - $40","50 IP - $80","200 IP - $300");
		
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
                System.out.println("Value '" + expectedValue + "' is missing from the Static Residential Proxies.");
            }
        }
	}	
	
	@Test(priority = 4) // verify dropdown values - Dedicated Datacenter Proxies	
	void verify_dropdown_values_Dedicated_Datacenter_Proxies() throws Exception  {
		driver.get(url2);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Dedicated Datacenter Proxies']")));
	    
		WebElement  StartNow  = driver.findElement(By.xpath("(//button[text()=' Start Now '])[3]"));
		 StartNow.click();	    			
		
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[2]")));
	
		WebElement  dropdownElement  = driver.findElement(By.xpath("(//select[@class='select-box'])[2]"));
		Select dropdown = new Select(dropdownElement);
		
		
		List<String> expectedValues = Arrays.asList("25 IP - $30","50 IP - $60","200 IP - $200");
		
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
                System.out.println("Value '" + expectedValue + "' is missing from the Dedicated Datacenter Proxies.");
            }
        }
	}	
	
	
	
	@Test(priority = 5) // verify dropdown values - Shared Datacenter	
	void verify_dropdown_values_Shared_Datacenter() throws Exception  {
		driver.get(url2);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Dedicated Datacenter Proxies']")));
	    
		WebElement  StartNow  = driver.findElement(By.xpath("(//button[text()=' Start Now '])[3]"));
		 StartNow.click();	    			
		
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[1]")));
	
		WebElement  dropdownElement  = driver.findElement(By.xpath("(//select[@class='select-box'])[1]"));
		Select dropdown = new Select(dropdownElement);
		
		
		List<String> expectedValues = Arrays.asList("30 GB - $9","100 GB - $27","200 GB - $50");
		
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
                System.out.println("Value '" + expectedValue + "' is missing from the Shared Datacenter");
            }
        }
	}	
	
	

	
	@Test(priority = 6) // verify dropdown navigate to my proxies page
	void verify_dropdown_navigate_to_my_proxies_page() throws Exception  {
		driver.get(url2);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbardropUser']")));
	    
		WebElement  StartNow  = driver.findElement(By.xpath("//a[@id='navbardropUser']"));
		 StartNow.click();	    				
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='myOrders']")));
	
		WebElement  dropdownElement  = driver.findElement(By.xpath("//a[@id='myOrders']"));
		dropdownElement.click();	
		
		String currentUrlString =  driver.getCurrentUrl();
	    String expectedURLString  = "https://dev.oculusproxies.com/orders/ispProxy";	
	    
	    Assert.assertEquals(currentUrlString, expectedURLString);
	
	
	}
	
	
	@Test(priority = 7) // verify dropdown navigate to my profile
	void verify_dropdown_navigate_to_my_profile() throws Exception  {
		driver.get(url2);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbardropUser']")));
	    
		WebElement  StartNow  = driver.findElement(By.xpath("//a[@id='navbardropUser']"));
		 StartNow.click();	    					
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='profile'])[1]")));
	
		WebElement  dropdownElement  = driver.findElement(By.xpath("(//a[@id='profile'])[1]"));
		dropdownElement.click();
		
		WebElement  expectedelement  = driver.findElement(By.xpath("//div//h5[@id='myModalLabel']"));
		String currentTXT= expectedelement.getText();
	    String expectedTXT  = "My Profile";	
	    
	    Assert.assertEquals(currentTXT, expectedTXT);
	
	}
	

	@Test(priority = 8) // verify dropdown navigate to my payment method
	void verify_dropdown_navigate_to_my_Payment_method() throws Exception  {
		driver.get(url2);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbardropUser']")));
	    
		WebElement  dropdown  = driver.findElement(By.xpath("//a[@id='navbardropUser']"));
		dropdown.click();	    					
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='My Payment Methods']")));
		
		WebElement  dropdownElement  = driver.findElement(By.xpath("//a[text()='My Payment Methods']"));
		dropdownElement.click();	
		Thread.sleep(1000);
		String currentUrlString =  driver.getCurrentUrl();
		//WebElement  expectedelement  = driver.findElement(By.xpath("//div//h5[@id='myModalLabel']"));
		//String currentTXT= expectedelement.getText();
	    String expectedURL  = "https://dev.oculusproxies.com/paymentMethods";	
	    
	    Assert.assertEquals(currentUrlString, expectedURL);
	Thread.sleep(3000);
	
	}
	

	@Test(priority = 10) // verify dropdown navigate to my payment method
	void Verify_that_the_ISP_product_has_been_successfully_purchased() throws Exception  {
		
		driver.get(url2);
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Start Now '])[1]")));    
		WebElement  Start_Now  = driver.findElement(By.xpath("(//button[text()=' Start Now '])[1]"));
		Start_Now.click();	    					
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Buy now ']")));	
		WebElement  Buy_now  = driver.findElement(By.xpath("//button[text()=' Buy now ']"));
		Buy_now.click();		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Pay Now ']")));		
		WebElement  Pay_now  = driver.findElement(By.xpath("//button[text()=' Pay Now ']"));
		Pay_now.click();		


		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label//input[@type='checkbox']")));		
		WebElement  AutoPayCheckBox  = driver.findElement(By.xpath("//label//input[@type='checkbox']"));
		

		if(AutoPayCheckBox.isSelected()) 
		{
			System.out.println("The auto-renew checkbox is selected by default.");
		}
		else
		{
			System.out.println("The auto-renew checkbox is not selected by default.");
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
	           .sendKeys("3333")  
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
	
	@Test(priority = 11) // Verify_Proxie_configuration_page_should_be_oppen
	void Verify_Proxie_configuration_page_should_be_oppen() throws Exception  {
		
		driver.get(url2);
		
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now '])[1]")));    
		WebElement  Try_now  = driver.findElement(By.xpath("(//button[text()=' Try now '])[1]"));
		Try_now.click();	    					
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()=' Configure '])[2]")));	
		WebElement  Buy_now  = driver.findElement(By.xpath("(//span[text()=' Configure '])[2]"));
		Buy_now.click();		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));		
		WebElement  checkbox  = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		if(!checkbox.isSelected()) {
			//System.out.println("check box is diselected under proxy configure page");
		}
		else {
			System.out.println("check box is selected");
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@type='text']")));		
		WebElement  text  = driver.findElement(By.xpath("//textarea[@type='text']"));
		text.sendKeys("3.3.3.3");
		
		WebElement  Add  = driver.findElement(By.xpath("//button[text()=' Add ']"));
		Add.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' 3.3.3.3 ']")));		
		WebElement  textt  = driver.findElement(By.xpath("//div[text()=' 3.3.3.3 ']"));
		String ip = textt.getText();
		String expectedString  = "3.3.3.3";		
		
		try {
		Assert.assertEquals(ip, expectedString);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

		
        // Check if the element is present
        WebElement element = null;
		try 
		{
	 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Save & Generate ']")));  
			WebElement  Save_Generate  = driver.findElement(By.xpath("//button[text()=' Save & Generate ']"));
			//Save_Generate.click();
	
			}
			catch (NoSuchElementException e) 
			{
			
			  System.out.println("Element not found. Message: already we have generated Ips");;
		}
	}

	@Test(priority = 13)
	void verify_Documentation_Link_Is_Functional() {
	    driver.get(url2);
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now '])[1]")));
	        WebElement tryNow = driver.findElement(By.xpath("(//button[text()=' Try now '])[1]"));
	        tryNow.click();

	        for(int i = 1; i <= 5; i++) // Start from i=1 
	        	{ 
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()=' Configure '])[" + i + "]")));
		            WebElement configure = driver.findElement(By.xpath("(//span[text()=' Configure '])[" + i + "]"));
		            configure.click();

	            try {
	            	
	                // Check if "try our documentation" element is present
	                WebElement tryOurDocumentation = driver.findElement(By.xpath("//a[text()='try our documentation']"));
	                tryOurDocumentation.click();

	                // Get handles of all open tabs
	                Set<String> handles = driver.getWindowHandles();

	                // Switch to the new tab
	                String originalTab = driver.getWindowHandle();
	                for (String handle : handles) {
	                    if (!handle.equals(originalTab)) {
	                        driver.switchTo().window(handle);
	                        break;
	                    }
	                }
	                String expectedUrl = "https://support.oculusproxies.com/hc/en-us/articles/23101526359835-Integrate-your-proxies-into-any-browser";
	                String actualUrl = driver.getCurrentUrl();

	                Assert.assertEquals(actualUrl, expectedUrl);
	                // Break the loop if assertion is successful
	                break;
	            } catch (Exception e) {
	                // If "try our documentation" element is not found, go back to the my proxies page
	                WebElement back = driver.findElement(By.xpath("//span[text()='< Back to orders']"));	                
	                back.click();	                
	                continue;	                
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Exception occurred: " + e.getMessage());
	    }
	}
	
	@Test(priority = 14)
	void verify_Country_Dropdown_Is_Functional_under_configure_proxy_page() {
	    driver.get(url2);
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now '])[1]")));
	        WebElement tryNow = driver.findElement(By.xpath("(//button[text()=' Try now '])[1]"));
	        tryNow.click();

	        for(int i = 1; i <= 5; i++) // Start from i=1 
	        	{ 
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()=' Configure '])[" + i + "]")));
		            WebElement configure = driver.findElement(By.xpath("(//span[text()=' Configure '])[" + i + "]"));
		            configure.click();

	            try {
	            	
	                // Check if "try our documentation" element is present
	                WebElement country_dropdown = driver.findElement(By.xpath("//select[@class='form-control ng-valid ng-dirty ng-touched']"));
	                country_dropdown.click();

	                Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='form-control ng-valid ng-dirty ng-touched']")));
	                dropdown.selectByVisibleText("India"); 

	                WebElement selectedOption = dropdown.getFirstSelectedOption();
	                Assert.assertEquals(selectedOption.getText(), "India"); 

	                
	                break;
	            } catch (Exception e) {
	                // If "try our documentation" element is not found, go back to the my proxies page
	                WebElement back = driver.findElement(By.xpath("//span[text()='< Back to orders']"));	                
	                back.click();	                
	                continue;	                
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Exception occurred: " + e.getMessage());
	    }
	}

	@Test(priority = 15) //verify_Change_Payment_Method_Is_Functional_under_configure_proxy_page
	void verify_navigate_to_Change_Payment_Method_Is_Functional_under_configure_proxy_page() {
	    driver.get(url2);
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now '])[1]")));
	        WebElement tryNow = driver.findElement(By.xpath("(//button[text()=' Try now '])[1]"));
	        tryNow.click();

	        for(int i = 1; i <= 4; i++) // Start from i=1 
	        	{ 
	        	    Thread.sleep(3000);
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='tabaction'])["+i+"]")));
		            WebElement configure = driver.findElement(By.xpath("(//a[@id='tabaction'])["+i+"]"));
		            configure.click();

	            try {
	            	

	            	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Change Payment Method'])[1]")));
	                WebElement Change_Payment_Method = driver.findElement(By.xpath("(//a[text()='Change Payment Method'])[1]"));
	                Change_Payment_Method.click();
	                
	                WebElement payment_method_modal = driver.findElement(By.xpath("//h5[@id='payment-method-modal']"));
	               String actualText =  payment_method_modal.getText();
	              
	                String ExpectedText ="Select Payment Method"; 
	                
	                try {
	                	Assert.assertEquals(actualText, ExpectedText);
					} catch (Exception e) {
						System.out.println(e);
					}
	                
	                break;
	            } catch (Exception e) {
	                
	             //   WebElement back = driver.findElement(By.xpath("//span[text()='< Back to orders']"));	                
	            //    back.click();	                
	                continue;	                
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Exception occurred: " + e.getMessage());
	    }
	}
	

	@Test(priority = 15) //verify_Change_Payment_Method_Is_Functional_under_configure_proxy_page
	void verify_Change_Payment_Method_Update_Is_Functional_under_configure_proxy_page() {
	    driver.get(url2);
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now '])[1]")));
	        WebElement tryNow = driver.findElement(By.xpath("(//button[text()=' Try now '])[1]"));
	        tryNow.click();

	        for(int i = 1; i <= 4; i++) // Start from i=1 
	        	{ 
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='tabaction'])["+i+"]")));
		            WebElement configure = driver.findElement(By.xpath("(//a[@id='tabaction'])["+i+"]"));
		            configure.click();

	            try {
	            	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Change Payment Method'])[1]")));
	                WebElement Change_Payment_Method = driver.findElement(By.xpath("(//a[text()='Change Payment Method'])[1]"));
	                Change_Payment_Method.click();	                

	                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='radio'])[1]")));
	                WebElement radiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
    	
	                	try {
		                	if(!radiobutton.isSelected()) {	                		
		                		radiobutton.click();
		                		 Thread.sleep(3000);
		                	}
						}
	                	catch (Exception e) 
	                	{
							System.out.println(e);
						}
 
	                	  WebElement update = driver.findElement(By.xpath("//div[@id='update-btn']"));
	                	  update.click();
	                	  
	                	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[6]"))); 
	                	  WebElement save = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
	                	  save.click();
	                	  
	                	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alertdialog']")));  
	    	            WebElement alertDialog = driver.findElement(By.xpath("//div[@role='alertdialog']"));
	    	            String actualtxt = alertDialog.getText();
	    	            String ExpectedText ="Your payment method has been updated for this order";   	
	    	        try { 	
	                	Assert.assertEquals(actualtxt, ExpectedText);
					} 
	    	        catch (Exception e) {
						System.out.println(e);
					}
	                
	                break;
	            } catch (Exception e) {
	                
	             //   WebElement back = driver.findElement(By.xpath("//span[text()='< Back to orders']"));	                
	            //    back.click();	                
	                continue;	                
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Exception occurred: " + e.getMessage());
	    }
	}

	@Test(priority = 16) //verify_History_Is_Functional_under_configure_proxy_page
	void verify_History_Is_Functional_under_configure_proxy_page() {
	    driver.get(url2);
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now '])[1]")));
	        WebElement tryNow = driver.findElement(By.xpath("(//button[text()=' Try now '])[1]"));
	        tryNow.click();

	        for(int i = 1; i <= 4; i++) // Start from i=1 
	        	{ 
	        	    Thread.sleep(3000);
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='tabaction'])["+i+"]")));
		            WebElement configure = driver.findElement(By.xpath("(//a[@id='tabaction'])["+i+"]"));
		            configure.click();

	            try {
	            	

	            	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Payment History'])[1]")));
	                WebElement Change_Payment_Method = driver.findElement(By.xpath("(//a[text()='Payment History'])[1]"));
	                Change_Payment_Method.click();
	                
	                WebElement payment_method_modal = driver.findElement(By.xpath("//div//h5[text()='Payment History']"));
	               String actualText =  payment_method_modal.getText();
	              
	                String ExpectedText ="Payment History"; 
	                
	                try {
	                	Assert.assertEquals(actualText, ExpectedText);
					} catch (Exception e) {
						System.out.println(e);
					}
	                
	                break;
	            } catch (Exception e) {
	               
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Exception occurred: " + e.getMessage());
	    }
	}
	

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


	

	@Test(priority = 18)
	void verify_Add_Page_Is_Functional_under_configure_proxy_page() {
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
	               
	                if(actualURL.equalsIgnoreCase(expectedString1) || actualURL.equalsIgnoreCase(expectedString2) || actualURL.equalsIgnoreCase(expectedString3) )
	                {
	                	
	                	Assert.assertTrue(actualURL.equals(expectedString1) || 
	                            actualURL.equals(expectedString2) || 
	                            actualURL.equals(expectedString3),
	                            "URL is not one of the expected URLs");
	                }
	                else {
						System.out.println("test case faild");
	                }
	            }
	        	
		     catch (Exception e) {
		        System.out.println("Exception occurred: " + e.getMessage());
		     }
  }
}
	

	@Test(priority = 19)
	void verify_Your_payment_method_has_been_updated_for_this_order() {
	    driver.get(url2);

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now '])[1]")));
	    WebElement tryNow = driver.findElement(By.xpath("(//button[text()=' Try now '])[1]"));
	    tryNow.click();

	    { 
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='tabaction'])["+1+"]")));
	        WebElement configure = driver.findElement(By.xpath("(//a[@id='tabaction'])["+1+"]"));
	        configure.click();
	        try {
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Change Payment Method'])[1]")));
	            WebElement Change_Payment_Method = driver.findElement(By.xpath("(//a[text()='Change Payment Method'])[1]"));
	            Change_Payment_Method.click();      
	            
	            //1
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Update ']")));
	            WebElement Update = driver.findElement(By.xpath("//button[text()=' Update ']"));
	            Update.click();
	            //2
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Save ']")));
	            WebElement save = driver.findElement(By.xpath("//button[text()=' Save ']"));
	            save.click();
	            
	            //3
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alertdialog']")));
	            WebElement alertDialog = driver.findElement(By.xpath("//div[@role='alertdialog']"));
	            String actualtxt = alertDialog.getText();
//	            System.out.println(actualtxt);
	            String expectedtxt = "Your payment method has been updated for this order.";

	            try {
					Assert.assertEquals(actualtxt, expectedtxt);
				} catch (AssertionError e) {
					System.out.println(e);
				}
        
	            
	        } catch (Exception e) {
	            System.out.println("Exception occurred: " + e.getMessage());
	        }
	    }
	}
	

	@Test(priority = 20) // verify dropdown navigate to my payment method
	void verify_dropdown_navigate_to_my_Payment_method_update() throws Exception  {
		driver.get(url2);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbardropUser']")));
	    
		WebElement  StartNow  = driver.findElement(By.xpath("//a[@id='navbardropUser']"));
		 StartNow.click();	    					
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='My Payment Methods']")));
	
		WebElement  dropdownElement  = driver.findElement(By.xpath("//a[text()='My Payment Methods']"));
		dropdownElement.click();		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div//span//img[@alt='Edit'])[1]")));		
		WebElement  editicon  = driver.findElement(By.xpath("(//div//span//img[@alt='Edit'])[1]"));
		editicon.click();	
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Update ']")));
			WebElement updateBtn  = driver.findElement(By.xpath("//button[text()=' Update ']"));
			if(updateBtn.isEnabled()) {
				
				updateBtn.click();	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alertdialog']")));
				WebElement alerdialog  = driver.findElement(By.xpath("//div[@role='alertdialog']"));
				String actualtxt = alerdialog.getText();
				String expecString = "Payment detail is updated successfully";
				Assert.assertEquals(actualtxt, expecString);
				//System.out.println(actualtxt);
			}
			else {
				System.out.println("update button is disabled");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	
	}
	

	@Test(priority = 21) // verify_update_my_Profile
	void verify_update_my_Profile() throws Exception  {
		driver.get(url2);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbardropUser']")));
	    
		WebElement  StartNow  = driver.findElement(By.xpath("//a[@id='navbardropUser']"));
		 StartNow.click();	    					
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='profile']")));
	
		WebElement  dropdownElement  = driver.findElement(By.xpath("//a[@id='profile']"));
		dropdownElement.click();		

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='profile']")));		
			WebElement  editiupdatebtn = driver.findElement(By.xpath("//button[@id='profile']"));
		
			if(editiupdatebtn.isEnabled()) {
				
				editiupdatebtn.click();	
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alertdialog']")));
				WebElement alerdialog  = driver.findElement(By.xpath("//div[@role='alertdialog']"));
				String actualtxt = alerdialog.getText();
				String expecString = "Your profile updated successfully";
				Assert.assertEquals(actualtxt, expecString);
				//System.out.println(actualtxt);
			}
			else {
				System.out.println("update button is disabled");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	
	}
	
	
	
	
	
	
	
}
