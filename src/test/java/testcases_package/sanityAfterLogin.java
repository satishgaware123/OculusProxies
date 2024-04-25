package testcases_package;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class sanityAfterLogin extends Base_class {



	@Test(priority = 10) // Try Now 1
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
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Static Residential Proxies']")));
	    
		WebElement  StartNow  = driver.findElement(By.xpath("(//button[text()=' Start Now '])[1]"));
		 StartNow.click();	    			
		
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='select-box']")));
	
		WebElement  dropdownElement  = driver.findElement(By.xpath("//select[@class='select-box']"));
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
	
	@Test(priority = 4) // verify dropdown values - Dedicated Datacenter Proxies	
	void verify_dropdown_values_Dedicated_Datacenter_Proxies() throws Exception  {
		driver.get(url2);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Dedicated Datacenter Proxies']")));
	    
		WebElement  StartNow  = driver.findElement(By.xpath("(//button[text()=' Start Now '])[2]"));
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
	    
		WebElement  StartNow  = driver.findElement(By.xpath("//a[@id='navbardropUser']"));
		 StartNow.click();	    					
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='profile'])[1]")));
	
		WebElement  dropdownElement  = driver.findElement(By.xpath("(//a[@id='profile'])[1]"));
		dropdownElement.click();		
		
		String currentUrlString =  driver.getCurrentUrl();
		//WebElement  expectedelement  = driver.findElement(By.xpath("//div//h5[@id='myModalLabel']"));
		//String currentTXT= expectedelement.getText();
	    String expectedURL  = "https://dev.oculusproxies.com/paymentMethods";	
	    
	    Assert.assertEquals(currentUrlString, expectedURL);
	
	
	}
	

	@Test(priority = 1) // verify dropdown navigate to my payment method
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

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label//input[@type='radio']")));		
		WebElement  select_card  = driver.findElement(By.xpath("//label//input[@type='radio']"));
		
		if(select_card.isSelected()) 
		{
			System.out.println("The redio button is selected by default.");
		}
		else
		{
			select_card.click();	

		}


        System.out.println("working......................1");
        
        // Wait for the iframe to be available
      //  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("(//iframe[@role='presentation'])[10]")));

        try
        
        {
        
        	WebElement  cvcs  = driver.findElement(By.xpath("//iframe[@name='__privateStripeFrame41691']"));
         	driver.switchTo().frame("__privateStripeFrame41691");
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span//input[@placeholder='CVC' and @name='cvc']")));	
	     	
		  //span//input[@placeholder='CVC' and @name='cvc']
		    
		    WebElement  cvc  = driver.findElement(By.xpath("//span//input[@placeholder='CVC' and @name='cvc']"));
		//cvc.click();
		cvc.sendKeys("111");
		   System.out.println("working......................2");     
        }
        catch (Exception e) 
        {
			System.out.println(e);
		} 
		Thread.sleep(5000);
		WebElement  Pay  = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		Pay.click();
		Thread.sleep(5000);

	}
	

	@Test(priority = -1) // verify dropdown navigate to my payment method
	void Verify_Proxie_configuration_page_should_be_oppen() throws Exception  {
		
		driver.get(url2);
		
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now '])[1]")));    
		WebElement  Try_now  = driver.findElement(By.xpath("(//button[text()=' Try now '])[1]"));
		Try_now.click();	    					
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()=' Configure '])[1]")));	
		WebElement  Buy_now  = driver.findElement(By.xpath("(//span[text()=' Configure '])[1]"));
		Buy_now.click();		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));		
		WebElement  checkbox  = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		if(!checkbox.isSelected()) {
			System.out.println("check box is diselected");
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

	
		WebElement  Save_Generate  = driver.findElement(By.xpath("//button[text()=' Save & Generate ']"));
		Save_Generate.click();




	}
	
	
	
}
