package oculus.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
//String Path = "/home/hp/eclipse-workspace/OculusProxies/ConfigProperties/ConfigData";

import org.testng.annotations.DataProvider;

public class ConfigDataProvider {

	Properties Pro;	
	public ConfigDataProvider () {
	try {
	
	String Path = "/home/hp/git/repository4/OculusProxiesDev/ConfigProperties/ConfigData";
		
	File file = new File(Path);
	
	FileInputStream fis = new FileInputStream(file);
	
	Pro = new Properties();
	Pro.load(fis);
	
	}
	catch(Exception E) 
	{
		System.out.println(E);
		
	 }
	
	}
	
	public String getURL() {
		return Pro.getProperty("URL");
	}
	
	public String getUsername() {
		return Pro.getProperty("Email");
	}
	
	public String getPass() {
		return Pro.getProperty("Password");
	}
	public String getUrl2() {
		return Pro.getProperty("URL2");
	}
	public String getUrl3() {
		return Pro.getProperty("URL3");
	}
	
}
