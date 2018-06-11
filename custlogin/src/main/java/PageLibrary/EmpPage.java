package PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class EmpPage extends Base {
	
	
	public static WebElement emp_newEmployee_Btn(WebDriver driver)
	{
		
        return driver.findElement(getlocator("emp_newemp"));
	
		
	}
	
	public static WebElement emp_empNametxt(WebDriver driver)
	{
		
        return driver.findElement(getlocator("emp_empname"));
	
		
	}
	
	public static WebElement emp_emplogin_Btn(WebDriver driver)
	{
		
        return driver.findElement(getlocator("emp_emploginpwd"));
	
		
	}
	
	public static WebElement emp_emprole_txt(WebDriver driver)
	{
		
        return driver.findElement(getlocator("emp_role"));
	
		
	}
	
	public static WebElement emp_empbranch_txt(WebDriver driver)
	{
		
        return driver.findElement(getlocator("emp_branch"));
	
		
	}
	
	public static WebElement emp_submit_btn(WebDriver driver)
	{
		
        return driver.findElement(getlocator("emp_submitbtn"));
	
		
	}
	
	public static WebElement emp_reset_btn(WebDriver driver)
	{
		
        return driver.findElement(getlocator("emp_resetbtn"));
	
		
	}
	
	public static WebElement emp_cancel_btn(WebDriver driver)
	{
		
        return driver.findElement(getlocator("emp_cancelbtn"));
	
		
	}

}
