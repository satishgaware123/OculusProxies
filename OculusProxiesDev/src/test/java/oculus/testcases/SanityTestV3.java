package oculus.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SanityTestV3 extends BaseClass2{

	@Test(priority = 1)
	void verify_naviagate_to_ISP_ProductPage() throws Exception {
		driver.get(url2);
		WebElement signup =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='navbar-drop2']")));
		signup.click();
		
		WebElement Static_residential_ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Static Residential (ISP)']")));
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
		WebElement signup =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbar-drop2']")));
		signup.click();
		
		WebElement Static_residential_ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Static Residential (ISP+)']")));
		Static_residential_ISP.click();
		
		String expectedUrl = "https://dev.oculusproxies.com/products/isp-plus";
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl, expectedUrl, "Incorrect tab is opened. Expected: " + expectedUrl + ", Actual: " + actualUrl);
		} catch (Exception e) {
			System.out.println(e);
}	driver.navigate().back();	
}			
	@Test(priority = 3)
	void verify_naviagate_to_sharedDc_ProductPage() throws Exception {
		WebElement signup =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbar-drop2']")));
		signup.click();
		
		WebElement Static_residential_ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Shared Datacenter']")));
		Static_residential_ISP.click();
		
		String expectedUrl = "https://dev.oculusproxies.com/products/shared-dc";
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl, expectedUrl, "Incorrect tab is opened. Expected: " + expectedUrl + ", Actual: " + actualUrl);
		} catch (Exception e) {
			System.out.println(e);
}		driver.navigate().back();
}	
	
	@Test(priority = 4)
	void verify_naviagate_to_dedicatedDC_ProductPage() throws Exception {
		WebElement signup =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbar-drop2']")));
		signup.click();
		
		WebElement Static_residential_ISP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Dedicated Datacenter']")));
		Static_residential_ISP.click();
		
		String expectedUrl = "https://dev.oculusproxies.com/products/dedicated-dc";
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl, expectedUrl, "Incorrect tab is opened. Expected: " + expectedUrl + ", Actual: " + actualUrl);
		} catch (Exception e) {
			System.out.println(e);
}	driver.navigate().back();	
}		
	
	@Test(priority = 5)
	void verifyProductValues_ProxiesPricing() throws Exception {
		WebElement price =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/pricing']")));
		price.click();
		
		WebElement pricePage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' $1.2/GB ']")));
		String actualTXT = pricePage.getText();
		String expectSTR = "$1.2/GB";
		try {
			Assert.assertEquals(actualTXT, expectSTR, "Incorrect tab is opened. Expected: " + expectSTR + ", Actual: " + actualTXT);
		} catch (Exception e) {
			System.out.println(e);
}	driver.navigate().back();	
}		
	

	@Test(priority = 6)
	void verifyALLProductInProductDropdown() throws Exception {
		driver.get(url2);
		WebElement price =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbar-drop2']")));
		price.click();
		
		WebElement pricePage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Static Residential (ISP)']")));
		String ActualText = pricePage.getText();
		String ExpectedText = "Static Residential (ISP)";
		
		try {
			Assert.assertEquals(ActualText, ExpectedText);
		} catch (Exception e) {
			System.out.println(e);
}
		WebElement pricePage2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Static Residential (ISP+)']")));
		String ActualTextispPlus = pricePage2.getText();
		String ExpectedTextispPlus = "Static Residential (ISP+)";
		
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
}	
		@Test(priority = 7) 
		void verify_dropdown_values_ISP() throws Exception  {
			driver.get(url2);
			 WebElement  StartNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/pricing']")));
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
	    	void verify_dropdown_values_ISPplus() throws Exception  {
			WebElement  dropdownElementISPPlus  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[2]")));
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
	    	void verify_dropdown_values_SharedDC() throws Exception  {
			WebElement  dropdownElementISPPlus  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[3]")));
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
			        System.out.println("Value '" + expectedValue2 + "' is missing from ISPplus.");
		}	
	}
 }		
		   @Test(priority = 10) 
	    	void verify_dropdown_values_DedicatedDC() throws Exception  {
			WebElement  dropdownElementISPPlus  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[4]")));
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
			        System.out.println("Value '" + expectedValue2 + "' is missing from ISPplus.");
			}
	   }				
}
			@Test(priority = 11) 
			void verify_dropdown_Price_changed_ISP() throws Exception  {

				driver.get(url2);
				 WebElement  StartNow  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/pricing']")));
				 StartNow.click();	    			

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
				WebElement  dropdownElementISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[3]")));
				Select dropdown = new Select(dropdownElementISP);
				dropdown.selectByVisibleText("200 GB - $50");
				
				 WebElement  Price1  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='size ng-star-inserted'])[3]")));
				 String priceeString =  Price1.getText();

				try {
					Assert.assertEquals(priceeString, "$0.25/GB");
				} catch (Exception e) {
					System.out.println(e);
				}
		        }
			
			@Test(priority = 14) 
			void verify_dropdown_Price_changed_shareDC2() throws Exception  {
				WebElement  dropdownElementISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[3]")));
				Select dropdown = new Select(dropdownElementISP);
				dropdown.selectByVisibleText("100 GB - $27");
				
				 WebElement  Price1  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='size ng-star-inserted'])[3]")));
				 String priceeString =  Price1.getText();

				try {
					Assert.assertEquals(priceeString, "$0.27/GB");
				} catch (Exception e) {
					System.out.println(e);
				}
		        }
			
			@Test(priority = 15) 
			void verify_dropdown_Price_changed_DedicatedDc() throws Exception  {  			

				WebElement  dropdownElementISP  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@class='select-box'])[4]")));
				Select dropdown = new Select(dropdownElementISP);
				dropdown.selectByVisibleText("200 IP, 20 TB - $200");
				
				 WebElement  Price1  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='size ng-star-inserted'])[4]")));
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
			
			WebElement  dropdownElementISP2  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Sign Up']")));
			String actualString = dropdownElementISP2.getText();			

				try {
					Assert.assertEquals(actualString, "Sign Up");
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
		void verify_reverse_flow_V4_HP_workingas_Expecetd(){  			
			driver.get(url3);					
			WebElement  Try_now_for_free  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Try now for free ']")));
			Try_now_for_free.click();		
			WebElement  dropdownElementISP2  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[text()='Select the product you need'])[2]")));
			String actualString = dropdownElementISP2.getText();			

				try {
					Assert.assertEquals(actualString, "Select the product you need");
				} catch (Exception e) {
					System.out.println(e);
				}													
    }
		@Test(priority = 27) 
		void verify_reverse_flow_V4_HP(){  
			driver.get(url3);				
			JavascriptExecutor javas = (JavascriptExecutor)driver;
			WebElement  Try_now  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Try now ']")));		
			javas.executeScript("arguments[0].scrollIntoView;", Try_now);
			WebElement  Try_now_b = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Try now ']")));
			Try_now_b.click();			
			WebElement  dropdownElementISP2  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[text()='Select the product you need'])[2]")));
			String actualString = dropdownElementISP2.getText();			

				try {
					Assert.assertEquals(actualString, "Select the product you need");
				} catch (Exception e) {
					System.out.println(e);
				}													
    }
		
		@Test(priority = 28)
		void verify_DetectMyIP_isFunctional() throws Exception {
			driver.get(url3);				
			WebElement  Try_now_b = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' Try it yourself '])[1]")));
			Try_now_b.click();	
			
			WebElement detectMyIP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Detect my IP ']")));
			detectMyIP.click();
			Thread.sleep(1000);
			WebElement add =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Add ']")));
			add.click();
			
			WebElement getIP =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' 49.36.81.181 ']")));
			String actString = getIP.getText();

			try {
				Assert.assertEquals(actString, "49.36.81.181");
			} catch (Exception e) {
				System.out.println(e);
	}	
			driver.navigate().back();
	}	
		
		
		
		
}
