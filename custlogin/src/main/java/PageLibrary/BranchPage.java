package PageLibrary;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class BranchPage extends Base{
	
	
	
	public static WebElement newBranch_button(WebDriver driver) {

		return driver.findElement(getlocator("newBranch"));

	}
	
	public static WebElement branchName_Textbox(WebDriver driver) {

		return driver.findElement(getlocator("branchName"));

	}
	
	public static WebElement address1_TextBox(WebDriver driver) {

		return driver.findElement(getlocator("branch_address1"));

	}

	public static WebElement zipCode_Textbox(WebDriver driver) {

		return driver.findElement(getlocator("branch_zipcode"));

	}
	
	
	public static WebElement country_Textbox(WebDriver driver) {

		return driver.findElement(getlocator("branch_country"));

	}
	
	public static WebElement state_Textbox(WebDriver driver) {

		return driver.findElement(getlocator("branch_state"));

	}
	
	public static WebElement city_Textbox(WebDriver driver) {

		return driver.findElement(getlocator("branch_city"));

	}
	
	
	
	public static WebElement submit_button(WebDriver driver) {

		return driver.findElement(getlocator("branch_submitBtn"));

	}
	
	public static WebElement Reset_button(WebDriver driver) {

		return driver.findElement(getlocator("branch_reset_buttn"));

	}
   
	public static WebElement cancel_button(WebDriver driver) {

		return driver.findElement(getlocator("branch_cancel_btn"));

	}
	
	
}
