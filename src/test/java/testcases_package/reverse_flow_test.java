package testcases_package;

import java.io.File;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class reverse_flow_test extends Base_class2 {

	@Test  //before login
	void reverseFlowTest_before_login() {	
		driver.get(url3);

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now '])[1]")));
		    WebElement tryNow = driver.findElement(By.xpath("(//button[text()=' Try now '])[1]"));
		    tryNow.click();

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try it yourself '])[4]")));
		    WebElement TryItYourself = driver.findElement(By.xpath("(//button[text()=' Try it yourself '])[4]"));
		    TryItYourself.click();
		
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@rows='4']")));
		    WebElement Authenticated_IPs = driver.findElement(By.xpath("//textarea[@rows='4']"));
		    Authenticated_IPs.sendKeys("3.3.3.3");
		    
		    WebElement add = driver.findElement(By.xpath("//button[@value='Add']"));
		    add.click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' 3.3.3.3 ']")));
		    WebElement ip = driver.findElement(By.xpath("//div[text()=' 3.3.3.3 ']"));
		   String ips = ip.getText();
		    
		   String expeString = "3.3.3.3";
		   
		    try {
				Assert.assertEquals(ips, expeString);
			} catch (Exception e) {
				System.out.println(e);
			}
	      
		    WebElement save = driver.findElement(By.xpath("//button[text()=' Save & Purchase ']"));
		    save.click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Buy now ']")));
		    WebElement BuyNow = driver.findElement(By.xpath("//button[text()=' Buy now ']"));
		    BuyNow.click();
	
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='submit']")));
		    WebElement signupb = driver.findElement(By.xpath("//button[@name='submit']"));
			   String signup = signupb.getText();
			    
			   String expeString2 = "Sign Up";
			   
			    try {
					Assert.assertEquals(signup, expeString2);
				} catch (Exception e) {
					System.out.println(e);
				}

	}
	
	

	@Test(priority = 2)
	void reverseFlowTest2_before_login() {	
		driver.get(url3);

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try now '])[2]")));
		    WebElement tryNow = driver.findElement(By.xpath("(//button[text()=' Try now '])[2]"));
		    tryNow.click();

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try it yourself '])[4]")));
		    WebElement TryItYourself = driver.findElement(By.xpath("(//button[text()=' Try it yourself '])[4]"));
		    TryItYourself.click();
		
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@rows='4']")));
		    WebElement Authenticated_IPs = driver.findElement(By.xpath("//textarea[@rows='4']"));
		    Authenticated_IPs.sendKeys("3.3.3.3");
		    
		    WebElement add = driver.findElement(By.xpath("//button[@value='Add']"));
		    add.click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' 3.3.3.3 ']")));
		    WebElement ip = driver.findElement(By.xpath("//div[text()=' 3.3.3.3 ']"));
		   String ips = ip.getText();
		    
		   String expeString = "3.3.3.3";
		   
		    try {
				Assert.assertEquals(ips, expeString);
			} catch (Exception e) {
				System.out.println(e);
			}
	      
		    WebElement save = driver.findElement(By.xpath("//button[text()=' Save & Purchase ']"));
		    save.click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Buy now ']")));
		    WebElement BuyNow = driver.findElement(By.xpath("//button[text()=' Buy now ']"));
		    BuyNow.click();
	
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='submit']")));
		    WebElement signupb = driver.findElement(By.xpath("//button[@name='submit']"));
			   String signup = signupb.getText();
			    
			   String expeString2 = "Sign Up";
			   
			    try {
					Assert.assertEquals(signup, expeString2);
				} catch (Exception e) {
					System.out.println(e);
			}
	}
	

	@Test(priority = 3)
	void reverseFlowTest3_before_login() {	
		driver.get(url3);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try it yourself '])[1]")));
		    WebElement TryItYourself = driver.findElement(By.xpath("(//button[text()=' Try it yourself '])[1]"));
		    TryItYourself.click();
		
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@rows='4']")));
		    WebElement Authenticated_IPs = driver.findElement(By.xpath("//textarea[@rows='4']"));
		    Authenticated_IPs.sendKeys("3.3.3.3");
		    
		    WebElement add = driver.findElement(By.xpath("//button[@value='Add']"));
		    add.click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' 3.3.3.3 ']")));
		    WebElement ip = driver.findElement(By.xpath("//div[text()=' 3.3.3.3 ']"));
		   String ips = ip.getText();
		    
		   String expeString = "3.3.3.3";
		   
		    try {
				Assert.assertEquals(ips, expeString);
			} catch (Exception e) {
				System.out.println(e);
			}
	      
		    WebElement save = driver.findElement(By.xpath("//button[text()=' Save & Purchase ']"));
		    save.click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Buy now ']")));
		    WebElement BuyNow = driver.findElement(By.xpath("//button[text()=' Buy now ']"));
		    BuyNow.click();
	
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='submit']")));
		    WebElement signupb = driver.findElement(By.xpath("//button[@name='submit']"));
			   String signup = signupb.getText();
			    
			   String expeString2 = "Sign Up";
			   
			    try {
					Assert.assertEquals(signup, expeString2);
				} catch (Exception e) {
					System.out.println(e);
				}

	}
	
	

	@Test(priority = 4)
	void reverseFlowTest4_before_login() {	
		driver.get(url3);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try it yourself '])[2]")));
		    WebElement TryItYourself = driver.findElement(By.xpath("(//button[text()=' Try it yourself '])[2]"));
		    TryItYourself.click();
		
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@rows='4']")));
		    WebElement Authenticated_IPs = driver.findElement(By.xpath("//textarea[@rows='4']"));
		    Authenticated_IPs.sendKeys("3.3.3.3");
		    
		    WebElement add = driver.findElement(By.xpath("//button[@value='Add']"));
		    add.click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' 3.3.3.3 ']")));
		    WebElement ip = driver.findElement(By.xpath("//div[text()=' 3.3.3.3 ']"));
		   String ips = ip.getText();
		    
		   String expeString = "3.3.3.3";
		   
		    try {
				Assert.assertEquals(ips, expeString);
			} catch (Exception e) {
				System.out.println(e);
			}
	      
		    WebElement save = driver.findElement(By.xpath("//button[text()=' Save & Purchase ']"));
		    save.click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Buy now ']")));
		    WebElement BuyNow = driver.findElement(By.xpath("//button[text()=' Buy now ']"));
		    BuyNow.click();
	
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='submit']")));
		    WebElement signupb = driver.findElement(By.xpath("//button[@name='submit']"));
			   String signup = signupb.getText();
			    
			   String expeString2 = "Sign Up";
			   
			    try {
					Assert.assertEquals(signup, expeString2);
				} catch (Exception e) {
					System.out.println(e);
				}

	}
	
	

	@Test(priority = 5)
	void reverseFlowTest5_before_login() {	
		driver.get(url3);

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try it yourself '])[3]")));
		    WebElement TryItYourself = driver.findElement(By.xpath("(//button[text()=' Try it yourself '])[3]"));
		    TryItYourself.click();
		
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@rows='4']")));
		    WebElement Authenticated_IPs = driver.findElement(By.xpath("//textarea[@rows='4']"));
		    Authenticated_IPs.sendKeys("3.3.3.3");
		    
		    WebElement add = driver.findElement(By.xpath("//button[@value='Add']"));
		    add.click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' 3.3.3.3 ']")));
		    WebElement ip = driver.findElement(By.xpath("//div[text()=' 3.3.3.3 ']"));
		   String ips = ip.getText();
		    
		   String expeString = "3.3.3.3";
		   
		    try {
				Assert.assertEquals(ips, expeString);
			} catch (Exception e) {
				System.out.println(e);
			}
	      
		    WebElement save = driver.findElement(By.xpath("//button[text()=' Save & Purchase ']"));
		    save.click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Buy now ']")));
		    WebElement BuyNow = driver.findElement(By.xpath("//button[text()=' Buy now ']"));
		    BuyNow.click();
	
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='submit']")));
		    WebElement signupb = driver.findElement(By.xpath("//button[@name='submit']"));
			   String signup = signupb.getText();
			    
			   String expeString2 = "Sign Up";
			   
			    try {
					Assert.assertEquals(signup, expeString2);				
					String randomename = UUID.randomUUID().toString();
					String screenshotPath  = "/home/hp/git/repository3/Oculus_Report/"+randomename+".jpg";
					
					try {
						File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						
						FileUtils.copyFile(screenshot, new File(screenshotPath));
						System.out.println("Screenshot saved to: " + screenshotPath);						
					} catch (Exception e) {
						System.out.println(e);		
					}
				
				} catch (Exception e) {
					System.out.println(e);
				}

	}
	
	
	
	
	
	
	
}
