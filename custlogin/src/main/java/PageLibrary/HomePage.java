package PageLibrary;


	//import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

import TestBase.Base;

	public class HomePage extends Base {
		
		
		
		public static WebElement UserName_editbox(WebDriver driver)
		{
			
	        return driver.findElement(getlocator("username_id"));
		
			
		}

		public static  WebElement  Password_editbox(WebDriver driver)
		{
			
			return driver.findElement(getlocator("Password_id"));
			
		}
		
		public static  WebElement  login_button(WebDriver driver)
		{
			
			return driver.findElement(getlocator("login_id"));
			
		}

	


	

}
