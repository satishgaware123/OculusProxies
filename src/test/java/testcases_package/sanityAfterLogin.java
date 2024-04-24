package testcases_package;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
import org.testng.annotations.Test;

public class sanityAfterLogin extends Base_class {



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
  
			AssertJUnit.assertEquals( curentTXT,expectedTXT);
			   
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
  
			AssertJUnit.assertEquals( curentTXT,expectedTXT);
			   
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
	
	

	
	@Test(priority = 5) // verify dropdown navigate to my proxies page
	void verify_right_side_dropdown() throws Exception  {
		driver.get(url2);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbardropUser']")));
	    
		WebElement  StartNow  = driver.findElement(By.xpath("//a[@id='navbardropUser']"));
		 StartNow.click();	    			
		
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='myOrders']")));
	
		WebElement  dropdownElement  = driver.findElement(By.xpath("//a[@id='myOrders']"));
		Select dropdown = new Select(dropdownElement);
		
		
		String currentUrlString =  driver.getCurrentUrl();
	    String expectedURLString  = "https://dev.oculusproxies.com/orders/ispProxy";	
	    
	    Assert.assertEquals(currentUrlString, expectedURLString);
	
	
	}
	
	
	@Test(priority = 6) // verify dropdown navigate to my proxies page
	void verify_right_side_dropdown2() throws Exception  {
		driver.get(url2);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbardropUser']")));
	    
		WebElement  StartNow  = driver.findElement(By.xpath("//a[@id='navbardropUser']"));
		 StartNow.click();	    			
		
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='profile'])[1]")));
	
		WebElement  dropdownElement  = driver.findElement(By.xpath("(//a[@id='profile'])[1]"));
		Select dropdown = new Select(dropdownElement);
		
		
		//String currentUrlString =  driver.getCurrentUrl();
		WebElement  expectedelement  = driver.findElement(By.xpath("(//a[@id='profile'])[1]"));
		String currentTXT= expectedelement.getText();
	    String expectedTXT  = "My Profile";	
	    
	    Assert.assertEquals(currentTXT, expectedTXT);
	
	
	}
}
