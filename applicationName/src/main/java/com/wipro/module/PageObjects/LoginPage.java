package com.wipro.module.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	public WebDriver driver; 
	By RegUsername =By.xpath("//input[@id=\"input-username\"]");
	By Firstname=By.xpath("//input[@id=\"input-firstname\"]");
	By Lastname=By.xpath("//input[@id=\"input-lastname\"]");
	By email=By.xpath("//input[@id=\"input-email\"]");
	By country1=By.xpath("//select[@id=\"input-country\"]");
	//By Title =By.
	//Select country = new Select(driver.findElement(country1));
	//cntry.selectByVisibleText("India");
	//List <WebElement> ls=country.getOptions();
	//int count =ls.size();
	//System.out.println(count);
//	for(int i =0;i<count;i++)
//	{
//		String optionsValue = ls.get(i).getText();
//		//System.out.println(optionsValue);
//		if(optionsValue.equals("INDIA")|| optionsValue.equals("India"))
//		{
//			country.selectByVisibleText("INDIA");
//		}
//	}
//	
	
}	




