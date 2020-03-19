package Utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import groovy.transform.Undefined.EXCEPTION;

public class ReadPropertiesAndBrowser {

	Properties readprop;

	public ReadPropertiesAndBrowser() throws Exception{
		try{
			readprop=new Properties();
	    FileInputStream fis=new FileInputStream("C:\\Users\\anush\\eclipse-workspace\\CucumberFrameworkWithPageFatory\\target\\config.properties");
		readprop.load(fis);
		}
		catch(EXCEPTION e) {
			e.printStackTrace();
		}
		
	}
	
	public ChromeDriver openBrowser(String name,String url) {
		
		ChromeDriver driver = null;
		if(readprop.getProperty(name).equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	        driver=new ChromeDriver();
	    
		
		}
		driver.get(readprop.getProperty(url));
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    return driver;
	
	}
}

