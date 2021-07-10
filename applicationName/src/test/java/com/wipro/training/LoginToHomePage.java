package com.wipro.training;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wipro.module.PageObjects.LandningPage;
import com.wipro.module.applicationName.BaseClass;

import junit.framework.Assert;


public class LoginToHomePage extends BaseClass {
	LandningPage lp = new LandningPage(driver);
	
	@BeforeTest
	public void launchApp() throws IOException
	{
		driver=intializeDriver();
		
		driver.get(prop.getProperty("url"));
	}
	@Test
	//public void 
	public void validateTitle() {
		Assert.assertEquals("Simple to start. Easy to run.", lp.getvalidateTitle());
	}
	
//	@DataProvider
//	public Object[][] getData()
//	{
//		Object[][] data = new Object[2][3];
//		data[0][0]="sai@gmal.com";
//		data[0][1]="fhsh";
//		data[0][2]="fsdhshg";
//		
//		data[1][0]="sai12@gmal.com";
//		data[1][1]="fhsh";
//		data[1][2]="fsdhshg";
//		
//		return data;
//	}
	
	@AfterTest
	public void quit()
	{
		driver.quit();
		driver=null;
	}
	
}
