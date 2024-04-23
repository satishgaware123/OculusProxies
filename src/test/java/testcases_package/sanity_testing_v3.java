package testcases_package;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class sanity_testing_v3 extends Base_class {

	
	@Test(enabled = false)
	void test001() throws Exception  {
		driver.navigate().refresh();
		driver.get(url2); //v3
		driver.navigate().refresh();
		  System.out.println("testing strat...........................");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/pricing']")));
	    
		WebElement dropdown = driver.findElement(By.xpath("//a[@href='/pricing']"));
		dropdown.click();	    
		
		String curenturl = driver.getCurrentUrl();
		String expectedUrl = "https://dev.oculusproxies.com/pricing";
    
	   try {
  
			AssertJUnit.assertEquals(expectedUrl, curenturl);
			   
		   }
	   catch (Exception e) 
		   {
			
			System.out.println(e);
		   }
	
	}
	
	

	@Test(enabled = false) // dropdown handle
	void test002() throws Exception  {
	  
		driver.get(url2); //v3
		
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbardrop']")));
	    
		WebElement pricing = driver.findElement(By.xpath("//a[@id='navbardrop']"));
		pricing.click();	    		
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/pricing/premium']")));
	    
		WebElement dropdown = driver.findElement(By.xpath("//a[@href='/pricing/premium']"));
		dropdown.click();
		
		String curenturl = driver.getCurrentUrl();
		String expectedUrl = "https://dev.oculusproxies.com/pricing/premium";
    
	   try {
  
			AssertJUnit.assertEquals(expectedUrl, curenturl);
			   
		   }
	   catch (Exception e) 
		   {
			
			System.out.println(e);
		   }
	


	}
	///3

	@Test(enabled = false) // dropdown handle
	void test003() throws Exception  {
	  
		driver.get(url2); //v3
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbardrop']")));
	    
		WebElement pricing = driver.findElement(By.xpath("//a[@id='navbardrop']"));
		pricing.click();	    		
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/pricing/sharedDC']")));
	    
		WebElement dropdown = driver.findElement(By.xpath("//a[@href='/pricing/sharedDC']"));
		dropdown.click();
		
		String curenturl = driver.getCurrentUrl();
		String expectedUrl = "https://dev.oculusproxies.com/pricing/sharedDC";
    
	   try {
  
			AssertJUnit.assertEquals(expectedUrl, curenturl);
			   
		   }
	   catch (Exception e) 
		   {
			
			System.out.println(e);
		   }

	}
	
	///4

		@Test(enabled = false) // Documentation
		void test004() throws Exception  {
		  
			driver.get(url2); //v3

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://support.oculusproxies.com/hc/en-us/categories/4403988697243-General']")));
		    
			WebElement Documentation = driver.findElement(By.xpath("//a[@href='https://support.oculusproxies.com/hc/en-us/categories/4403988697243-General']"));
			Documentation.click();	    		
			Thread.sleep(3000);
			
			String originalHandle=	driver.getWindowHandle();
			for(String handle: driver.getWindowHandles()) {
				if(!handle.equals(originalHandle)) {
					driver.switchTo().window(handle);
					break;
				}
			}
			
			String curenturl = driver.getCurrentUrl();
			String expectedUrl = "https://support.oculusproxies.com/hc/en-us/categories/4403988697243-General";
	    
		   try {
	  
				AssertJUnit.assertEquals( curenturl,expectedUrl);
				   
			   }
		   catch (Exception e) 
			   {
				
				System.out.println(e);
			   }

		}	
		///5

				@Test(priority = 5) // Documentation
				void test005() throws Exception  {
					 System.out.println("testing strat...........................");
					driver.get(url2); //v3
					System.out.println("testing strat...........................2");
				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now for free '])[1]")));
				    
					WebElement Documentation = driver.findElement(By.xpath("(//button[text()=' Try now for free '])[1]"));
					Documentation.click();	    		
					//Thread.sleep(3000);
					System.out.println("testing strat...........................3");
					
					
					WebElement header = driver.findElement(By.xpath("//div//h1[text()='Sign Up']"));
					String curentTXT = header.getText();
					String expectedTXT = "Sign Up";
					System.out.println("testing strat...........................4");
				   try {
			  
						AssertJUnit.assertEquals( curentTXT,expectedTXT);
						   
					   }
				   catch (Exception e) 
					   {
						
						System.out.println(e);
					   }
				   System.out.println("testing strat...........................5");
				}	
				
				///6

				@Test(priority = 6) // Documentation
				void test006() {
				  
					driver.get(url2); //v3

				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now for free '])[2]")));
				    
					WebElement Documentation = driver.findElement(By.xpath("(//button[text()=' Try now for free '])[2]"));
					Documentation.click();	    		
					//Thread.sleep(3000);

					
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//h1[text()='Sign Up']")));
					WebElement header = driver.findElement(By.xpath("//div//h1[text()='Sign Up']"));
					String curentTXT = header.getText();
					String expectedTXT = "Sign Up";
			    
				   try {
			  
						AssertJUnit.assertEquals( curentTXT,expectedTXT);
						   
					   }
				   catch (Exception e) 
					   {
						
						System.out.println(e);
					   }

				}
				///7

				@Test(priority = 7) //Start Now button
				void test007() {
				  
					driver.get(url2); //v3

				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Start Now']")));
				    
					WebElement Documentation = driver.findElement(By.xpath("//button[text()='Start Now']"));
					Documentation.click();	    		
					//Thread.sleep(3000);

					
					
					WebElement header = driver.findElement(By.xpath("//div//h1[text()='Sign Up']"));
					String curentTXT = header.getText();
					String expectedTXT = "Sign Up";
			    
				   try {
			  
						AssertJUnit.assertEquals( curentTXT,expectedTXT);
						   
					   }
				   catch (Exception e) 
					   {
						
						System.out.println(e);
					   }

				}
				///8

				@Test(priority = 8) //Try Today button
				void test008() {
				  
					driver.get(url2); //v3

				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Try Today ']")));
				    
					WebElement Documentation = driver.findElement(By.xpath("//button[text()=' Try Today ']"));
					Documentation.click();	    		
	
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//h1[text()='Sign Up']")));
					WebElement header = driver.findElement(By.xpath("//div//h1[text()='Sign Up']"));
					String curentTXT = header.getText();
					String expectedTXT = "Sign Up";
			    
				   try {
			  
						AssertJUnit.assertEquals( curentTXT,expectedTXT);
						   
					   }
				   catch (Exception e) 
					   {
						
						System.out.println(e);
					   }

				}
				//9

				@Test(priority = 9) //Login button
				void test009() {
				  
					driver.get(url2); //v3

				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
				    
					WebElement Documentation = driver.findElement(By.id("login"));
					Documentation.click();	    		
	
					
					wait.until(ExpectedConditions.urlContains("login"));
					String curentTXT = driver.getCurrentUrl();
					String expectedTXT = "https://dev.oculusproxies.com/login";
			    
				   try {
			  
						AssertJUnit.assertEquals( curentTXT,expectedTXT);
						   
					   }
				   catch (Exception e) 
					   {
						
						System.out.println(e);
					   }

				}
				//10

				@Test(priority = 10) //sign up button
				void test010() {
				  
					driver.get(url2); //v3

				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signup")));
				    
					WebElement Documentation = driver.findElement(By.id("signup"));
					Documentation.click();	    		
	
					
					wait.until(ExpectedConditions.urlContains("register"));
					String curentTXT = driver.getCurrentUrl();
					String expectedTXT = "https://dev.oculusproxies.com/register";
			    
				   try {
			  
						AssertJUnit.assertEquals( curentTXT,expectedTXT);
						   
					   }
				   catch (Exception e) 
					   {
						
						System.out.println(e);
					   }

				}
	
}
