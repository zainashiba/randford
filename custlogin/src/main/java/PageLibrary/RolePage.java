package PageLibrary;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class RolePage extends Base {
	
	public static WebElement newrole_btn(WebDriver driver)
	{
		
        return driver.findElement(getlocator("newrole"));
	
		
	}
	
	public static WebElement Role_name(WebDriver driver)
	{
		
        return driver.findElement(getlocator("role_name"));
	
		
	}
	
	public static WebElement role_type(WebDriver driver)
	{
		
        return driver.findElement(getlocator("role_type"));
	
		
	}
	
	public static WebElement role_submit_btn (WebDriver driver)
	{
		
        return driver.findElement(getlocator("role_submitBtn"));
	
		
	}
	
	public static WebElement role_reset_btn(WebDriver driver)
	{
		
        return driver.findElement(getlocator("role_resetbtn"));
	
		
	}
	
	public static WebElement role_cancel_btn (WebDriver driver)
	{
		
        return driver.findElement(getlocator("role_cancelbtn"));
	
		
	}
	
	

}
