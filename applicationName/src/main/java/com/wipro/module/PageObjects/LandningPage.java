package com.wipro.module.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandningPage {

	public WebDriver driver; 
		// TODO Auto-generated method 
  By Login=By.xpath("//a[@class=\"btn btn-link navbar-btn\"]");
  By Register=By.xpath("//a[@class=\"btn btn-black navbar-btn\"]");
  By Features=By.linkText("Features");
  By Demo=By.linkText("Demo");
  By Marketplace=By.linkText("Marketplace");
  By Blog=By.linkText("Blog");
  By Download=By.linkText("Download");
By Title=By.xpath("//h2[contains(text(),\"Simple to start.\") ]");

   public LandningPage(WebDriver driver){

	   this.driver=driver;
	} 
	public WebElement getLogin() {
		return driver.findElement(Login);
    }
	public WebElement getRegister() {
		return driver.findElement(Register);
    }
	public WebElement getDemo() {
		return driver.findElement(Demo);
    }
	public void userLogin(){
		driver.findElement(Login).click();
		
		
	}
	public WebElement getvalidateTitle() {
		return driver.findElement(Title);
	}
	
}

