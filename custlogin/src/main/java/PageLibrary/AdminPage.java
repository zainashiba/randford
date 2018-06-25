package PageLibrary;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class AdminPage extends Base{

	public static WebElement branches_button(WebDriver driver) {
		
        //return driver.findElement(By.id(OR1("branches_btn")));
		return driver.findElement(getlocator("branches_btn"));

	}

	public static WebElement roles_button(WebDriver driver) {

		return driver.findElement(getlocator("roles_btn"));

	}

	public static WebElement users_button(WebDriver driver) {

		return driver.findElement(getlocator("users_btn"));

	}

	public static WebElement employee_button(WebDriver driver) {

		return driver.findElement(getlocator(""));

	}
	
	
	
	public static WebElement country_search_Textbox(WebDriver driver) {

		return driver.findElement(getlocator("branch_country_search"));

	}
	
	public static WebElement state_search_Textbox(WebDriver driver) {

		return driver.findElement(getlocator("branch_state_search"));

	}
	
	public static WebElement city_search_Textbox(WebDriver driver) {

		return driver.findElement(getlocator("branch_city_search"));

	}
	
	
	public static WebElement search_button(WebDriver driver) {

		return driver.findElement(getlocator("branch_searchBtn"));

	}
	
	public static WebElement clear_button(WebDriver driver) {

		return driver.findElement(getlocator("branch_clearBtn"));

	}
	


}
