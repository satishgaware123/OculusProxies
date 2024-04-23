package testcases_package;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Find_Broken_links_legasy extends Base_class {
	
	public void findbrokenlinks(String urllink, WebElement singleLink) {
	    try {
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        if (urllink == null) {
	        	// Handle Null link
	           // System.out.println("URL link is null for element: " + singleLink.getText());
	            return;
	        }

	        if (urllink.startsWith("mailto:")) {
	            // Handle mailto link
	            //System.out.println("This is a mailto link: " + urllink);
	            return;
	        }

	        URL url = new URL(urllink);
	        HttpURLConnection httpurl = (HttpURLConnection) url.openConnection();
	        httpurl.setConnectTimeout(2000);
	        httpurl.connect();

	        
	        if (httpurl.getResponseCode() == 200) {
	            //System.out.println("The link is working Fine: " + singleLink.getText());
	        } else {
	            System.out.println(" Broken Link ==>: "+"'" + url+"' " + singleLink.getText());
	        }
	    } catch (MalformedURLException e) {
	        System.out.println("Malformed URL: " + urllink);
	        e.printStackTrace();
	    } catch (IOException e) {
	        System.out.println("Error connecting to URL: " + urllink);
	        e.printStackTrace();
	    }
	}


	@Test(priority = 1)  // find broken links in legacy
	void test001() throws Exception {
		
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			int count = 0;
		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    WebDriverWait wait = new WebDriverWait(driver,30000);  //explicity wait
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li//a[@id='login']")));
			
			//WebElement loginb =  driver.findElement(By.xpath("//a[@id='login']"));
			//loginb.click();
			
			
			Thread.sleep(5000);
			
		 	List <WebElement> forgotPass = driver.findElements(By.xpath("//a"));
			
		 	
		 	Iterator<WebElement> it = forgotPass.iterator();
		 	
		 	while (it.hasNext()) 
		 	
		 	{
				WebElement singleLink = it.next();
				
				String urllink= singleLink.getAttribute("href");
				
				findbrokenlinks(urllink, singleLink);
				
			   count =  count+1;
			   
			}
		 	System.out.println("Total links on the homepage of Legacy: "+count);
			
		}
	
	catch (Exception e) {
			System.out.println(e);	
	}
		}
	

	@Test(priority = 2) // find broken links in v3
	void test002() throws Exception {
		
		try {
			int count = 0;
			WebDriverWait wait = new WebDriverWait(driver,30000);
						
			driver.get(url2);
			
			
		 	List <WebElement> forgotPass = driver.findElements(By.xpath("//a"));
			
		 	
		 	Iterator<WebElement> it = forgotPass.iterator();
		 	
		 	while (it.hasNext()) 
		 	
		 	{
				WebElement singleLink = it.next();
				
				String urllink= singleLink.getAttribute("href");
				
				findbrokenlinks(urllink, singleLink);
				
			   count =  count+1;
			   
			}
		 	System.out.println("Total links on the homepage of V3: "+count);
			
		}
	
	catch (Exception e) {
			System.out.println(e);	
	}
		}
	
	
	

	@Test(priority = 3)  // find broken links in v4
	void test003() throws Exception {
		
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url3);
			
			int count = 0;
			WebDriverWait wait = new WebDriverWait(driver,30000);  //Explicitly wait
			//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Go to Oculus proxies 2.0']")));
			
		 	List <WebElement> forgotPass = driver.findElements(By.xpath("//a"));
			
		 	
		 	Iterator<WebElement> it = forgotPass.iterator();
		 	
		 	while (it.hasNext()) 
		 	
		 	{
				WebElement singleLink = it.next();
				
				String urllink= singleLink.getAttribute("href");
				
				findbrokenlinks(urllink, singleLink);
				
			   count =  count+1;
			   
			}
		 	System.out.println("Total links on the homepage of V4: "+count);
			
		}
	
	catch (Exception e) {
			System.out.println(e);	
	}
		}
	
	
	
	
	
}
