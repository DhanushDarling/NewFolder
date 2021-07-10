package com.wipro.module.applicationName;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BaseClass {
	private static final String FileUtils = null;
	 //String timeStamp = null;
	public static WebDriver driver;
	public Properties prop;

	public WebDriver intializeDriver() throws IOException {
		
		//getting the property of project
		System.out.println(System.getProperty("user.dir"));
		
		prop= new Properties();
		
		//C:\Users\admin\eclipse-workspace\applicationName\src\main\java\com\wipro\module\applicationName\data.properties
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\wipro\\module\\applicationName\\data.properties");
		
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		System.out.println("Browser for execution"+ browserName);
		
		if(browserName.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Downloads\\chromedriver_w\\chromedriver.exe");
		
		   driver= new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		return driver;
		
	}
	
	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, 
				new File("C:\\Users\\admin\\eclipse-workspace\\applicationName\\Screenshot\\"+ result +"screenshot.png"));
	}
	
	
}

