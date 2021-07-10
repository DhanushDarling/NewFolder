package com.wipro.training;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.logging.LogManager;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wipro.module.PageObjects.LandningPage;
import com.wipro.module.applicationName.BaseClass;

import test.configuration.Base;


public class HomePage extends BaseClass {
	LandningPage lp ;
	//public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void launchApp() throws IOException
	{
		driver=intializeDriver();
		
		driver.get(prop.getProperty("url"));
		lp= new LandningPage(driver);
	}
	
	@Test
	public void validateRegisterBtn()
	{
	  AssertJUnit.assertTrue(lp.getRegister().isDisplayed());
		//lp.userLogin();
	}

	@AfterTest
	public void quit()
	{
		driver.quit();
		driver=null;
	}
}
