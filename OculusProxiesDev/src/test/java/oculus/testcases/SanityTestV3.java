package oculus.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

@Listeners(oculus.utilities.listeners.class)

public class SanityTestV3 extends BaseClass2{

	@Test(priority = 1)
	void verify_naviagate_to_ISP_ProductPage() throws Exception {
		driver.get(url2);
		WebElement signup =  wait.until(ExpectedConditions.elementToBeClickable(By.id("navbar-drop2")));
		signup.click();
		
		WebElement Static_residential_ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div//a[contains(text(),'ISP')])[1]")));
		Static_residential_ISP.click();
		
		String expectedUrl = "https://dev.oculusproxies.com/products/isp";
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl, expectedUrl, "Incorrect tab is opened. Expected: " + expectedUrl + ", Actual: " + actualUrl);
		} catch (Exception e) {
			System.out.println(e);
}	
		driver.navigate().back();
}	
	
	@Test(priority = 2)
	void verify_naviagate_to_ISPplus_ProductPage() throws Exception {
		WebElement signup =  wait.until(ExpectedConditions.elementToBeClickable(By.id("navbar-drop2")));
		signup.click();
		
		WebElement Static_residential_ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//a[contains(text(),'ISP Premium')]")));
		Static_residential_ISP.click();
		
		String expectedUrl = "https://dev.oculusproxies.com/products/isp-plus";
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl, expectedUrl);
		} catch (Exception e) {
			System.out.println(e);
}	driver.navigate().back();	
}			
	@Test(priority = 3)
	void verify_naviagate_to_sharedDc_ProductPage() throws Exception {
		WebElement signup =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbar-drop2']")));
		signup.click();
		
		WebElement Static_residential_ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//a[contains(text(),'Shared Datacenter')]")));
		Static_residential_ISP.click();
		
		String expectedUrl = "https://dev.oculusproxies.com/products/shared-dc";
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl, expectedUrl);
		} catch (Exception e) {
			System.out.println(e);
}		driver.navigate().back();
}	
	
	@Test(priority = 4)
	void verify_naviagate_to_dedicatedDC_ProductPage() throws Exception {
		WebElement signup =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbar-drop2']")));
		signup.click();
		
		WebElement Static_residential_ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//a[contains(text(),'Dedicated Datacenter')]")));
		Static_residential_ISP.click();
		
		String expectedUrl = "https://dev.oculusproxies.com/products/dedicated-dc";
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl, expectedUrl);
		} catch (Exception e) {
			System.out.println(e);
}	driver.navigate().back();	
}		
	@Test(priority = 4)
	void verify_naviagate_to_Residential_ProductPage() throws Exception {
		WebElement signup =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbar-drop2']")));
		signup.click();
		
		WebElement Static_residential_ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//a[(text()='Residential')]")));
		Static_residential_ISP.click();	
		
		String expectedUrl = "https://dev.oculusproxies.com/products/residential";
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl,expectedUrl );
		} catch (Exception e) {
			System.out.println(e);
}	driver.navigate().back();	
}	
	@Test(priority = 4)
	void verify_naviagate_to_Residential_Pricing_Page_From_ProductPage() throws Exception {
		WebElement signup =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbar-drop2']")));
		signup.click();		
		WebElement Static_residential_ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//a[(text()='Residential')]")));
		Static_residential_ISP.click();	
		WebElement TryNow =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Try now']")));
		TryNow.click();			
		String expectedUrl = "https://dev.oculusproxies.com/pricing/residential?planType=residential";
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl,expectedUrl );
		} catch (Exception e) {
			System.out.println(e);
}	driver.navigate().back();	
}		
	
	@Test(priority = 5)
	void verifyProductValues_ProxiesPricing_free() throws Exception {
		driver.get(url2);		
		WebElement price =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/pricing']")));
		price.click();
		WebElement Datacenter =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Datacenter')]")));
		Datacenter.click();
		WebElement pricePage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='size ng-star-inserted'][normalize-space()='$0'])[1]")));
		String actualTXT = pricePage.getText();
		String expectSTR = "$0";
		try {
			Assert.assertEquals(actualTXT, expectSTR);
		} catch (Exception e) {
			System.out.println(e);
}	
		WebElement pricePage2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'$0.3/GB')]")));
		String actualTXT2 = pricePage2.getText();

		try {
			Assert.assertEquals(actualTXT2, "$0.3/GB", "Incorrect tab is opened.");
		} catch (Exception e) {
			System.out.println(e);
}	
		WebElement pricePage3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'$1.2/IP')]")));
		String actualTXT3 = pricePage3.getText();
		try {
			Assert.assertEquals(actualTXT3, "$1.2/IP", "Incorrect tab is opened.");
		} catch (Exception e) {
			System.out.println(e);
}			
}		
	

	@Test(priority = 6)
	void verifyALLProductInProductDropdown() throws Exception {
		WebElement price =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbar-drop2']")));
		price.click();
		
		WebElement ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'ISP')]")));
		ISP.click();
		WebElement pricePage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div//a[contains(text(),'ISP')])[1]")));
		String ActualText = pricePage.getText();
		String ExpectedText = "Static Residential (ISP)";
		
		try {
			Assert.assertEquals(ActualText, ExpectedText);
		} catch (Exception e) {
			System.out.println(e);
}
		WebElement pricePage2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//a[contains(text(),'ISP Premium')]")));
		String ActualTextispPlus = pricePage2.getText();
		String ExpectedTextispPlus = "Static Residential (ISP Premium)";
		
		try {
			Assert.assertEquals(ExpectedTextispPlus, ActualTextispPlus);
		} catch (Exception e) {
			System.out.println(e);
}
		WebElement pricePage3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Shared Datacenter']")));
		String ActualTextispShared = pricePage3.getText();
		String ExpectedTextiShered = "Shared Datacenter";
		
		try {
			Assert.assertEquals(ExpectedTextiShered, ActualTextispShared);
		} catch (Exception e) {
			System.out.println(e);
}
		WebElement pricePage4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Dedicated Datacenter']")));
		String ActualTextispDDC = pricePage4.getText();
		String ExpectedTextiDDC = "Dedicated Datacenter";
		
		try {
			Assert.assertEquals(ExpectedTextiDDC, ActualTextispDDC);
		} catch (Exception e) {
			System.out.println(e);
}	
		WebElement pricePage5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/products/free']")));
		String FreeActual = pricePage5.getText();
		String FreeExpected = "Free Datacenter";
		
		try {
			Assert.assertEquals(FreeExpected, FreeActual);
		} catch (Exception e) {
			System.out.println(e);
   }
		WebElement residential = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//a[text()='Residential']")));
		String residentialtxt = residential.getText();
		String residentialExpectedTXT= "Residential";
		try {
			Assert.assertEquals(residentialtxt, residentialExpectedTXT);
		} catch (Exception e) {
			System.out.println(e);
   }
		
		
		
}	
	@Test(priority = 7) 
	void verify_ISP_product_values_from_dropdown() throws Exception  {
		driver.get(url2);
		 WebElement  StartNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div//button[(text()=' Start now ')])[1]")));
		 StartNow.click();	    			
		 
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
   
	        @Test(priority = 8) 
	    	void verify_ISPplus_product_values_from_dropdown() throws Exception  {	        	
	    	driver.get(url2);
	   		 WebElement  StartNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div//button[(text()=' Start now ')])[2]")));
	   		 StartNow.click();	    			

			WebElement  dropdownElementISPPlus  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[1]")));
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
	
		   @Test(priority = 9) 
	    	void verify_SharedDc_product_values_from_dropdown() throws Exception  {
			   driver.get(url2);
			   WebElement  StartNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div//button[(text()=' Start now ')])[3]")));
			   StartNow.click();	       
			   WebElement  dropdownElementISPPlus  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[1]")));
			   Select dropdown2 = new Select(dropdownElementISPPlus);
			   List<String> expectedValues2 = Arrays.asList("30 GB - $9","100 GB - $27","200 GB - $50");
			
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
			        System.out.println("Value '" + expectedValue2 + "' is missing from SharedDC.");
		}	
	}
 }		
		   @Test(priority = 10) 
	    	void verify_DedicatedDc_product_values_from_dropdown() throws Exception  {
			   driver.get(url2);
			   WebElement  StartNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div//button[(text()=' Start now ')])[4]")));
			   StartNow.click();	   
			WebElement  dropdownElementISPPlus  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[1]")));
			Select dropdown2 = new Select(dropdownElementISPPlus);

			
			List<String> expectedValues2 = Arrays.asList("25 IP, 2.5 TB - $30","75 IP, 7.5 TB - $82.5","200 IP, 20 TB - $200");
			
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
			        System.out.println("Value '" + expectedValue2 + "' is missing from Dedicated DC.");
			}
	   }				
}
			@Test(priority = 11) 
			void verify_dropdown_Price_changed_ISP() throws Exception  {

				driver.get(url2);
				 WebElement  StartNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/pricing']")));
				 StartNow.click();	    			
				 Thread.sleep(2000);
				 WebElement  ISPCTA  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'ISP')]")));
				 ISPCTA.click();
				WebElement  dropdownElementISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[1]")));
				Select dropdown = new Select(dropdownElementISP);
				dropdown.selectByVisibleText("150 GB - $150");
				try {
					 WebElement  Price1  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='size ng-star-inserted'])[1]")));
					 String priceeString =  Price1.getText();

					Assert.assertEquals(priceeString, "$1/GB");

				} catch (Exception e) {
				System.out.println(e);
				}
		        }

			@Test(priority = 12) 
			void verify_dropdown_Price_changed_ISPplus() throws Exception  {
				driver.get(url2);
				 WebElement  StartNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/pricing']")));
				 StartNow.click();	
				 Thread.sleep(2000);
				 WebElement  ISPCTA  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'ISP')]")));
				 ISPCTA.click();
				WebElement  dropdownElementISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[2]")));
				Select dropdown = new Select(dropdownElementISP);
				dropdown.selectByVisibleText("200 IP, 8 TB - $300");
				
				 WebElement  Price1  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='size ng-star-inserted'])[2]")));
				 String priceeString =  Price1.getText();

				try {
					Assert.assertEquals(priceeString, "$1.5/IP");
				} catch (Exception e) {
					System.out.println(e);
		}
   }
			@Test(priority = 13) 
			void verify_dropdown_Price_changed_sharedDC() throws Exception  {
				driver.get(url2);
				 WebElement  StartNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/pricing']")));
				 StartNow.click();	
				 
				WebElement  dropdownElementISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[2]")));
				Select dropdown = new Select(dropdownElementISP);
				dropdown.selectByVisibleText("200 GB - $50");
				
				 WebElement  Price1  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'$0.25/GB')]")));
				 String priceeString =  Price1.getText();

				try {
					Assert.assertEquals(priceeString, "$0.25/GB");
				} catch (Exception e) {
					System.out.println(e);
				}
		        }
			
			@Test(priority = 14) 
			void verify_dropdown_Price_changed_shareDC2() throws Exception  {
				WebElement  dropdownElementISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[2]")));
				Select dropdown = new Select(dropdownElementISP);
				dropdown.selectByVisibleText("100 GB - $27");
				
				 WebElement  Price1  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'$0.27/GB')]")));
				 String priceeString =  Price1.getText();

				try {
					Assert.assertEquals(priceeString, "$0.27/GB");
				} catch (Exception e) {
					System.out.println(e);
				}
		        }
			
			@Test(priority = 15) 
			void verify_dropdown_Price_changed_DedicatedDc() throws Exception  {  			

				WebElement  dropdownElementISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[3]")));
				Select dropdown = new Select(dropdownElementISP);
				dropdown.selectByVisibleText("200 IP, 20 TB - $200");
				
				 WebElement  Price1  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'$1/IP')]")));
				 String priceeString =  Price1.getText();
					try {
						Assert.assertEquals(priceeString, "$1/IP");
					} catch (Exception e) {
						System.out.println(e);
					}
					
			}				
		@Test(priority = 16) 
		void verify_navigateTo_ISP_from_Product_Page() throws Exception  {  			
			driver.get("https://dev.oculusproxies.com/products/isp");
		
			WebElement  dropdownElementISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Try now ']")));
			dropdownElementISP.click();
			
			wait.until(ExpectedConditions.urlContains("https://dev.oculusproxies.com/pricing/premium?planType=isp_proxy"));
			String actualURL = driver.getCurrentUrl();
 			

				try {
					Assert.assertEquals(actualURL, "https://dev.oculusproxies.com/pricing/premium?planType=isp_proxy");
				} catch (Exception e) {
					System.out.println(e);
				}
								
		}
		@Test(priority = 17) 
		void verify_navigateTo_ISPplus_from_Product_Page() throws Exception  {  			
			driver.get("https://dev.oculusproxies.com/products/isp-plus");	
			
			WebElement  dropdownElementISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Try now ']")));
			dropdownElementISP.click();
			
			wait.until(ExpectedConditions.urlContains("https://dev.oculusproxies.com/pricing/premium?planType=isp_plus_proxy"));
			String actualURL = driver.getCurrentUrl();
 			

				try {
					Assert.assertEquals(actualURL, "https://dev.oculusproxies.com/pricing/premium?planType=isp_plus_proxy");
				} catch (Exception e) {
					System.out.println(e);
				}
					
		}				
		@Test(priority = 18) 
		void verify_navigateTo_SharedDC_pricepage_from_Product_Page() throws Exception  {  			
			driver.get("https://dev.oculusproxies.com/products/shared-dc");
			
			WebElement  dropdownElementISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Try now ']")));
			dropdownElementISP.click();
			
			wait.until(ExpectedConditions.urlContains("https://dev.oculusproxies.com/pricing/sharedDC?planType=shared_dc"));
			String actualURL = driver.getCurrentUrl();
 			

				try {
					Assert.assertEquals(actualURL, "https://dev.oculusproxies.com/pricing/sharedDC?planType=shared_dc");
				} catch (Exception e) {
					System.out.println(e);
				}
					
		}				
		@Test(priority = 19) 
		void verify_navigateTo_dedicatedDc_pricePage_from_Product_Page() throws Exception  {  			
			driver.get("https://dev.oculusproxies.com/products/dedicated-dc");
					
			WebElement  dropdownElementISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Try now ']")));
			dropdownElementISP.click();
			
			wait.until(ExpectedConditions.urlContains("https://dev.oculusproxies.com/pricing/sharedDC?planType=dedicated_dc"));
			String actualURL = driver.getCurrentUrl();
 			

				try {
					Assert.assertEquals(actualURL, "https://dev.oculusproxies.com/pricing/sharedDC?planType=dedicated_dc");
				} catch (Exception e) {
					System.out.println(e);
				}
								
				
		}				
		@Test(priority = 20) 
		void verify_navigateTo_MyProxiesPage_from_Product_Page() throws Exception  {  			
			driver.get("https://dev.oculusproxies.com/products/free");
					
			WebElement  Try_now_for_free  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Try now for free ']")));
			Try_now_for_free.click();
			
			WebElement  GET_STARTED  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Get started']")));
			GET_STARTED.click();
			
			WebElement  dropdownElementISP2  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Login']")));
			String actualString = dropdownElementISP2.getText();			

				try {
					Assert.assertEquals(actualString, "Login");
				} catch (Exception e) {
					System.out.println(e);
				}	
													
    }
		
		@Test(priority = 20) 
		void verify_liks_onSignUp_page_LOGINL_INK() throws Exception  {  
			driver.get(url2);
			WebElement  signup  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signup")));
			signup.click();
			
			WebElement  lg  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Log In']")));
			lg.click();
			

			wait.until(ExpectedConditions.urlMatches("https://dev.oculusproxies.com/login"));
				String currentURL = driver.getCurrentUrl();
		
				try {
					Assert.assertEquals(currentURL, "https://dev.oculusproxies.com/login");
				} catch (Exception e) {
					System.out.println(e);
				}	
				driver.navigate().back();
								
	}

		@Test(priority = 21) 
		void verify_navigate_To_SignUp_Page_From_LOGINL_Page() throws Exception  {  
			driver.get(url2);
			WebElement  signup  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
			signup.click();

			WebElement  SignUpNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sign Up Now']")));
			SignUpNow.click();

				wait.until(ExpectedConditions.urlMatches("https://dev.oculusproxies.com/register"));
				String currentURL = driver.getCurrentUrl();
		
				try {
					Assert.assertEquals(currentURL, "https://dev.oculusproxies.com/register");
				} catch (Exception e) {
					System.out.println(e);
				}	
									
	}
		
		
		@Test(priority = 22) 
		void verify_navigate_To_TAC_From_SIGNUP_Page()  {  
			driver.get(url2);
			WebElement  signup  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signup")));
			signup.click();
			String owindow = driver.getWindowHandle();
			
			WebElement  TAC  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Terms and Conditions']")));
			TAC.click();

			for(String window:driver.getWindowHandles()) {
			
				if(!window.equals(owindow)) {
					
					driver.switchTo().window(window);				
				}				
			}		
				wait.until(ExpectedConditions.urlMatches("https://dev.oculusproxies.com/terms_conditions"));
				String currentURL = driver.getCurrentUrl();
		
				try {
					Assert.assertEquals(currentURL, "https://dev.oculusproxies.com/terms_conditions");
				} catch (Exception e) {
					System.out.println(e);
				}	
				driver.close();
				driver.switchTo().window(owindow);			
	}

		@Test(priority = 23) 
		void verify_navigate_To_PrivcyPolicy_From_SIGNUP_Page() {  
			driver.get(url2);
			WebElement  signup  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signup")));
			signup.click();
			String owindow = driver.getWindowHandle();		
			WebElement  TAC  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Privacy Policy']")));
			TAC.click();
			for(String window:driver.getWindowHandles()) {		
				if(!window.equals(owindow)) {			
					driver.switchTo().window(window);				
				}				
			}		
				wait.until(ExpectedConditions.urlMatches("https://dev.oculusproxies.com/privacy_policy"));
				String currentURL = driver.getCurrentUrl();		
				try {
					Assert.assertEquals(currentURL, "https://dev.oculusproxies.com/privacy_policy");
				} catch (Exception e) {
					System.out.println(e);
				}	
				driver.close();
				driver.switchTo().window(owindow);			
	}
		
		

		@Test(priority = 24) 
		void verify_navigate_To_forgotPass_From_LOGIN_Page()  {  
			driver.get(url2);
			WebElement  signup  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
			signup.click();
			WebElement  SignUpNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Forgot Password?']")));
			SignUpNow.click();
				wait.until(ExpectedConditions.urlMatches("https://dev.oculusproxies.com/forgotpassword"));
				String currentURL = driver.getCurrentUrl();
				try {
					Assert.assertEquals(currentURL, "https://dev.oculusproxies.com/forgotpassword");
				} catch (Exception e) {
					System.out.println(e);
				}	
									
	}
		
		
		@Test(priority = 25) 
		void verify_navigate_To_SIGNUP_Page_From_ForgotPass_Page() {  
			driver.get(url2);
			WebElement  signup  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
			signup.click();
			WebElement  SignUpNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Forgot Password?']")));
			SignUpNow.click();
			WebElement  SP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sign Up Now']")));
			SP.click();			
				wait.until(ExpectedConditions.urlMatches("https://dev.oculusproxies.com/register"));
				String currentURL = driver.getCurrentUrl();
		
				try {
					Assert.assertEquals(currentURL, "https://dev.oculusproxies.com/register");
				} catch (Exception e) {
					System.out.println(e);
				}									
	}
		@Test(priority = 26) 
		void verify_Starting_Prcing_OF_Product_Home_Page() throws Exception  {
			driver.get(url2);
			 WebElement  ISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='symbol'])[1]")));
			 String ISPPrice=  ISP.getText().replace("\n", " ");    			

			 try {
				Assert.assertEquals(ISPPrice, "Starting from $1 /GB");
			} catch (Exception e) {
				System.out.println(e);
			}
			 
			 WebElement  ISPplus  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='symbol'])[2]")));
			 String ISPplusPrice=  ISPplus.getText().replace("\n", " ");    			

			 try {
				Assert.assertEquals(ISPplusPrice, "Starting from $1.5 /IP");
			} catch (Exception e) {
				System.out.println(e);
			}
			 
			 WebElement  SharedDC  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='symbol'])[3]")));
			 String SharedDCprice=  SharedDC.getText().replace("\n", " ");    			

			 try {
				Assert.assertEquals(SharedDCprice, "Starting from $0.25 /GB");
			} catch (Exception e) {
				System.out.println(e);
			}
			 
			 WebElement  dedicatedDC  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='symbol'])[4]")));
			 String dedicatedDCprice=  dedicatedDC.getText().replace("\n", " ");    			

			 try {
				Assert.assertEquals(dedicatedDCprice, "Starting from $1 /IP");
			} catch (Exception e) {
				System.out.println(e);
			}	 
	}
		
		@Test(priority = 27) 
		void verify_Discriptions_on_Product_Page_ISP() throws Exception  {
			driver.get(url2);
			// ISP
			WebElement ProductDropdown1 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='navbar-drop2']")));
			ProductDropdown1.click();
			
			WebElement Static_residential_ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Static Residential (ISP)']")));
			Static_residential_ISP.click();
			
			String Actualtxt=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//h4"))).getText();

			 try {
				Assert.assertEquals(Actualtxt, "High-Speed ISP Proxies: Optimize Your Data Operations with Reliable, Fast Internet Protocol Services");
			} catch (Exception e) {
				System.out.println(e);
			}	 
	}

		@Test(priority = 28) 
		void verify_Discriptions_on_Product_Page_ISPplus() throws Exception  {
			driver.get(url2);

				WebElement ProductDropdown2 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='navbar-drop2']")));
				ProductDropdown2.click();
			WebElement Static_residential_ISPplus =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Static Residential (ISP+)']")));
			Static_residential_ISPplus.click();
			
			String Actualtxt2=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//h4"))).getText();
		
			 try {
				Assert.assertEquals(Actualtxt2, "Enhanced Static Residential (ISP+) Proxies: Extend Your Scraping "
						+ "Capabilities to Google Servers, Major Social Media Platforms, eCommerce, Events, Business "
						+ "and many other websites");
			} catch (Exception e) {
				System.out.println(e);
			}	 
		}
	@Test(priority = 29) 
	void verify_Discriptions_on_Product_Page_SharedDc() throws Exception  {
		driver.get(url2);
		WebElement ProductDropdown3 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='navbar-drop2']")));
		ProductDropdown3.click();
		WebElement SharedDc =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Shared Datacenter']")));
		SharedDc.click();
		
		String Actualtxt3=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//h4"))).getText();

		try {
		Assert.assertEquals(Actualtxt3, "Cost-Effective Shared DC Proxies: Enhance Your Online Efficiency with Budget-"
				+ "Friendly, Shared Datacenter Solutions");
	} 	catch (Exception e) {
		System.out.println(e);
	}	 	 
	}	
		@Test(priority = 30) 
		void verify_Discriptions_on_Product_Page_DedicatedDc() throws Exception  {
			driver.get(url2);
			WebElement ProductDropdown4 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='navbar-drop2']")));
			ProductDropdown4.click();
			WebElement DedicatedDC =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Dedicated Datacenter']")));
			DedicatedDC.click();
			
			String Actualtxt4=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//h4"))).getText();
			
			try {
				Assert.assertEquals(Actualtxt4, "Premium Dedicated DC Proxies: Secure Exclusive Proxy Usage for Your High-Volume, Sensitive Tasks");
			} catch (Exception e) {
				System.out.println(e);
			}			
}
			
	@Test(priority = 31)
	void verify_naviagate_to_freeDataCenterPlanFromFAQ() throws Exception {
		driver.get(url2);
		WebElement TargateFAQ =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='What is an Static Residential (ISP) Proxy?']")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",TargateFAQ );
		
		WebElement FAQ =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("label[for='faq-drawer4']")));
		FAQ.click();
		
		WebElement GetTEXT =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Yes, after signup you "
				+ "can get a free package of 5 ')]")));
		String ActualTEXT = GetTEXT.getText();
		
		try {
			Assert.assertEquals(ActualTEXT, "Yes, after signup you can get a free package of 5 Datacenter IP’s with 100MB bandwidth, this plan is valid for 14 days.");
		} catch (Exception e) {
			System.out.println(e);
		}					
}	
	@Test(priority = 32)
	void verify_FAQ_Link_navigateToCorrectPage_FromFAQ() throws Exception {
		driver.get(url2);
		WebElement TargateFAQ =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='What is an Static Residential (ISP) Proxy?']")));
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].scrollIntoView();",TargateFAQ );		
		WebElement FAQ =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("label[for='faq-drawer4']")));
		FAQ.click();		
		WebElement GetTEXT =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'https://oculusproxies.com/pricing/sharedDC?planTyp')]")));
		GetTEXT.click();		
		String OWindow = driver.getWindowHandle();		
		for(String window:driver.getWindowHandles()) {			
			if(!window.equals(OWindow)) {
				driver.switchTo().window(window);				
				String curentURL =  driver.getCurrentUrl();				
				try {
					Assert.assertEquals(curentURL, "https://dev.oculusproxies.com/pricing/sharedDC?planType=free");
					driver.switchTo().window(OWindow);
				} 
				catch (Exception e) {
					System.out.println(e);
				}		
			}					
		}	
}	
	@Test(priority = 33)
	void verify_privacyPolicy_Link_is_Functional_under_Scale_with_Security() throws Exception {
		driver.get(url2);
		WebElement Scale_with_Security =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='Scale with Security']")));
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("arguments[0].scrollIntoView();",Scale_with_Security );		
		WebElement GetTEXT =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//u[normalize-space()='Privacy Policy.']")));
		GetTEXT.click();
		Thread.sleep(3000);
		String OWindow = driver.getWindowHandle();		
		for(String window:driver.getWindowHandles()) {
			
			if(!window.equals(OWindow)) {
				driver.switchTo().window(window);				
				String curentURL =  driver.getCurrentUrl();				
				try {
					Assert.assertEquals(curentURL, "https://dev.oculusproxies.com/privacy_policy");	
					driver.switchTo().window(OWindow);
				} catch (Exception e) {
					System.out.println(e);
				}					
			}					
		}					
}	
	@Test(priority = 34)
	void verify_Link_is_Functional_under_Can_I_test_my_proxies() throws Exception {
		driver.get(url2);
		WebElement Scale_with_Security =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='How do you price your proxies?']")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",Scale_with_Security );
		WebElement GetTEXT2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='Can I test my proxies?']")));
		GetTEXT2.click();
		
		WebElement GetTEXT =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'https://support.oculusproxies.com/hc/en-us/article')]")));
		GetTEXT.click();
		String OWindow = driver.getWindowHandle();		
		for(String window:driver.getWindowHandles()) {			
			if(!window.equals(OWindow)) {
				driver.switchTo().window(window);			
				String curentURL =  driver.getCurrentUrl();				
				try {
					Assert.assertEquals(curentURL, "https://support.oculusproxies.com/hc/en-us/articles/23101526359835-Integrate-your-proxies-into-any-browser");					
					driver.close();
					driver.switchTo().window(OWindow);	
				} catch (Exception e) {
					System.out.println(e);
				}					
			}					
		}				
}	
			
	@Test(priority = 35)
	void verify_Link_is_Functional_under_WherecanIgetproxiesforEvents() throws Exception {
		driver.get(url2);
		WebElement Scale_with_Security =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='How do you price your proxies?']")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",Scale_with_Security );
		WebElement GetTEXT2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='Where can I get proxies for Events?']")));
		GetTEXT2.click();
		
		WebElement GetTEXT =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='https://oculusproxies.com/legacy']")));
		GetTEXT.click();
		String OWindow = driver.getWindowHandle();		
		for(String window:driver.getWindowHandles()) {			
			if(!window.equals(OWindow)) {
				driver.switchTo().window(window);			
				String curentURL =  driver.getCurrentUrl();				
				try {
					Assert.assertEquals(curentURL, "https://dev.oculusproxies.com/legacy");					
					driver.switchTo().window(OWindow);	
				} catch (Exception e) {
					System.out.println(e);
				}					
			}					
		}
	}	
	@Test(priority = 36)
	void verify_NavigateTo_FAQ_page() throws Exception {
		driver.get(url2);
		WebElement GetTEXT2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("faq")));
		GetTEXT2.click();		
		String OWindow = driver.getWindowHandle();		
		for(String window:driver.getWindowHandles()) {			
			if(!window.equals(OWindow)) {
				driver.switchTo().window(window);			
				String curentURL =  driver.getCurrentUrl();				
				try {
					Assert.assertEquals(curentURL, "https://dev.oculusproxies.com/faq");					
					driver.switchTo().window(OWindow);	
				} catch (Exception e) {
					System.out.println(e);
				}					
			}					
		}
	}
	
		
	
	
	
	
	
}
