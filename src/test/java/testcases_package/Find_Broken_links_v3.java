package testcases_package;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Links;

public class Find_Broken_links_v3 extends Base_class {

	
	public void findbrokenlinks(String urllink, WebElement singleLink) {
	    try {
	        if (urllink == null) {
	            System.out.println("URL link is null for element: " + singleLink.getText());
	            return;
	        }

	        if (urllink.startsWith("mailto:")) {
	            // Handle mailto link
	            System.out.println("This is a mailto link: " + urllink);
	            return;
	        }

	        URL url = new URL(urllink);
	        HttpURLConnection httpurl = (HttpURLConnection) url.openConnection();
	        httpurl.setConnectTimeout(2000);
	        httpurl.connect();

	        if (httpurl.getResponseCode() == 200) {
	            System.out.println("The link is working Fine: " + singleLink.getText());
	        } else {
	            System.out.println("The link is Broken: " + singleLink.getText());
	        }
	    } catch (MalformedURLException e) {
	        System.out.println("Malformed URL: " + urllink);
	        e.printStackTrace();
	    } catch (IOException e) {
	        System.out.println("Error connecting to URL: " + urllink);
	        e.printStackTrace();
	    }
	}

	
	
	@Test(enabled = false)  // find single link
	void test001() throws Exception {
		
		try {
			
			WebDriverWait wait = new WebDriverWait(driver,30000);
			
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Go to Oculus proxies 2.0']")));
			
			WebElement v3Link =  driver.findElement(By.xpath("//a[text()='Go to Oculus proxies 2.0']"));
			v3Link.click();
					
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li//a[@id='login']")));
			
			WebElement loginb =  driver.findElement(By.xpath("//a[@id='login']"));
			loginb.click();
			
			
			Thread.sleep(5000);
			
			WebElement forgotPass =  driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
			
			String urllink = "https://oculusproxies.com/forgotpassword";
			URL url = new URL(urllink);
			
			HttpURLConnection httpurl=(HttpURLConnection) url.openConnection();
			
			httpurl.setConnectTimeout(2000);
			httpurl.connect();
			
			if(httpurl.getResponseCode()==200)
			{
				System.out.println("The link is working Fine: "+ forgotPass.getText());
			}
			else {
				System.out.println("The link is Broken: "+ forgotPass.getText());
			}
			

		
			
		}
	
	catch (Exception e) {
			System.out.println(e);	
	}
		}
	
	@Test(priority = 1)
	void test002() throws Exception {
		
		try {
			int count = 0;
			WebDriverWait wait = new WebDriverWait(driver,30000);
			
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Go to Oculus proxies 2.0']")));
			
			WebElement v3Link =  driver.findElement(By.xpath("//a[text()='Go to Oculus proxies 2.0']"));
			v3Link.click();
					
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
		 	System.out.println("Total Links on Page "+count);
			
		}
	
	catch (Exception e) {
			System.out.println(e);	
	}
		}
	
	
	
}
