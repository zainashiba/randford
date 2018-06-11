package PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class UsersPage extends Base{
	
	public static WebElement newUsers_btn(WebDriver driver)
	{
		
        return driver.findElement(getlocator("newusers"));
	
		
	}
	
	public static WebElement users_roletxt(WebDriver driver)
	{
		
        return driver.findElement(getlocator("users_role"));
	
		
	}
	
	
	public static WebElement users_branchtxt(WebDriver driver)
	{
		
        return driver.findElement(getlocator("users_branch"));
	
		
	}
	
	public static WebElement users_custID(WebDriver driver)
	{
		
        return driver.findElement(getlocator("users_custid"));
	
		
	}
	
	public static WebElement users_custName(WebDriver driver)
	{
		
        return driver.findElement(getlocator("users_custname"));
	
		
	}
	
	public static WebElement users_userName(WebDriver driver)
	{
		
        return driver.findElement(getlocator("users_username"));
	
		
	}
	
	
	public static WebElement users_loginPassword(WebDriver driver)
	{
		
        return driver.findElement(getlocator("users_loginpwd"));
	
		
	}
	
	public static WebElement users_Transactpwd(WebDriver driver)
	{
		
        return driver.findElement(getlocator("users_transactpwd"));
	
		
	}
	
	
	public static WebElement users_submit_Btn(WebDriver driver)
	{
		
        return driver.findElement(getlocator("users_submitbtn"));
	
		
	}
	
	
	public static WebElement users_reset_Btn(WebDriver driver)
	{
		
        return driver.findElement(getlocator("users_resetbtn"));
	
		
	}
	
	
	public static WebElement users_cancel_Btn(WebDriver driver)
	{
		
        return driver.findElement(getlocator("users_cancelbtn"));
	
		
	}
	

}
