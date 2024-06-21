package oculus.utilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakingScreenshot {

	public static void takesSS(WebDriver driver, String scrennshotName) throws IOException {
	   
      String path = "/home/hp/git/repository4/OculusProxiesDev/Oculus_Report/screenshots"+scrennshotName+".png";
      File destination = new File(path);
      
      File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(source, destination);
	
	
	}	
	
}
