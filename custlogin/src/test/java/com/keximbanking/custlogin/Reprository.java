package com.keximbanking.custlogin;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Excel.Excel_class;
import PageLibrary.AdminPage;
import PageLibrary.BranchPage;
import PageLibrary.EmpPage;
import PageLibrary.GenericPage;
import PageLibrary.HomePage;
import PageLibrary.RolePage;
import PageLibrary.UsersPage;
import Utility.validation;
//import table.WebTable;
//import TestBase.Base;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Reprository extends GenericPage{
	
	WebDriver driver;
	
	
/*public void launch(String browser) {
		
		

		if (browser.equalsIgnoreCase("FF")) {
			
		    driver = new FirefoxDriver();

			//driver.quit();

			

		} else if (browser.equalsIgnoreCase("chrome")) {

			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asif\\shiba_JAVA\\chromedriver_win32_new\\chromedriver.exe");

		    driver = new ChromeDriver();
			
			//driver.quit();

		}
		driver.get(config("build1"));
		driver.manage().window().maximize();

		
	}
	*/
	public void launch()
	{
		
		driver=new FirefoxDriver();
		
		driver.get(config("build1"));
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

	}		

	public void login()
	{
		HomePage.UserName_editbox(driver).sendKeys(config("username"));
		HomePage.Password_editbox(driver).sendKeys(config("password"));
		HomePage.login_button(driver).click();
		
        if (validation.isTextPresent(driver, "sdfghjkldfghj")){
			
			Reporter.log("text is passed");
			
			
		}else{
			
			Reporter.log("text not passed");
			//validation.emailSending(driver, "login");
			
		}
        

//		if(validation.isTitlePresent(driver, "KEXIM BANK"))
//		{
//            Reporter.log("text is passed");
//			  validation.takeScreenShot();
//		}else{
//			
//			Reporter.log("text not passed");
//		}
		
		
	}
	
	public void click_branch()
	{
		AdminPage.branches_button(driver).click();
	}
	
	/*public void del_edit(){
		
		WebTable.webTable(driver,"delete", "210");
	}*/
	
	public void create_newbranch(String bname,String address,String zipcode,String country,String state,String city)
	{
		BranchPage.newBranch_button(driver).click();
		BranchPage.branchName_Textbox(driver).sendKeys(bname);
		BranchPage.address1_TextBox(driver).sendKeys(address);
		BranchPage.zipCode_Textbox(driver).sendKeys(zipcode);
/*
		BranchPage.country_Textbox(driver).sendKeys(country);
		BranchPage.state_Textbox(driver).sendKeys(state);
		BranchPage.city_Textbox(driver).sendKeys(city);*/
		
		GenericPage.dropDownSelection(driver, getlocator("branch_country")).selectByVisibleText(country);
		GenericPage.dropDownSelection(driver, getlocator("branch_state")).selectByVisibleText(state);
		GenericPage.dropDownSelection(driver, getlocator("branch_city")).selectByVisibleText(city);
		BranchPage.submit_button(driver).click();
		
		
		

		if(validation.alertPresent(driver, "created successfully"))
		{
			Reporter.log("branch  created successfully");
			
		}else
		{
			Reporter.log("Branch name already exist");
			validation.emailSending(driver, "login");
			
		}
		
	}
	
	
	public Object[][] excelcontent(String filename,String sheetname)
	{
		
		Excel_class.excelconnection(filename, sheetname);
		
		int rc=Excel_class.rcount();
		
		int cc=Excel_class.ccount();
		
		String[][] data=new String[rc-1][cc];
		
		for(int r=1;r<rc;r++)
		{
			for(int c=0;c<cc;c++)
			{
				data[r-1][c]=Excel_class.readdata(c, r);
			}
		}
		return data;
		
				
	}
	
	
	
	public void click_role()
	{
		
		AdminPage.roles_button(driver).click();
	}
	
	public void create_newrole()
	{
		
		RolePage.newrole_btn(driver).click();
		RolePage.Role_name(driver).sendKeys("manager");
		RolePage.role_type(driver).sendKeys("management");
		RolePage.role_submit_btn(driver).click();
	}

	
	
	public void click_users()
	{
		
		AdminPage.users_button(driver).click();
	}
	
	public void create_newusers()
	{
		
		UsersPage.newUsers_btn(driver).click();
		GenericPage.dropDownSelection(driver, getlocator("users_roletxt")).selectByVisibleText("");
		GenericPage.dropDownSelection(driver, getlocator("users_branchtxt")).selectByVisibleText("");
		GenericPage.dropDownSelection(driver, getlocator("users_custID")).selectByVisibleText("");
		UsersPage.users_custName(driver).sendKeys("");
		UsersPage.users_userName(driver).sendKeys("");
		UsersPage.users_loginPassword(driver).sendKeys("");
		UsersPage.users_Transactpwd(driver).sendKeys("");
		UsersPage.users_submit_Btn(driver).click();
		
	}
	
	public void click_employee()
	{
		
		AdminPage.employee_button(driver).click();
	}
	
	public void create_newemployee()
	{
		
		EmpPage.emp_emplogin_Btn(driver).click();
		EmpPage.emp_empNametxt(driver).sendKeys("");
		EmpPage.emp_emplogin_Btn(driver).sendKeys("");
		GenericPage.dropDownSelection(driver, getlocator("emp_emprole_txt")).selectByVisibleText("");
		GenericPage.dropDownSelection(driver, getlocator("emp_empbranch_txt")).selectByVisibleText("");
		EmpPage.emp_submit_btn(driver).click();
	}
			
}
