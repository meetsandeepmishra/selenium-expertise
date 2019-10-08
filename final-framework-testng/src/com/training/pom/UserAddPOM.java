package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


	
public class UserAddPOM {
	private WebDriver driver; 
	
	public UserAddPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}

	@FindBy(linkText="Administration")
	private WebElement Admintab;
	
	@FindBy(linkText="Add a user")
	private WebElement addUser;
	
	@FindBy(id="firstname")
	private WebElement fName;
	
	@FindBy(id="lastname")
	private WebElement lName;
	
	@FindBy(id="email")
	private WebElement Email;
	
	@FindBy(id="phone")
	private WebElement Phone;
	
	@FindBy(id="username")
	private WebElement LoginID;
	
	@FindBy(xpath="//div[@class='col-sm-8']/div[2]")
	private WebElement Manualpswd;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(xpath="//div[@class='dropdown-menu open']/div/input")
	private WebElement profileTxt;
	
	@FindBy(name="submit")
	private WebElement add;
	
	public void clickAdd() {
		this.add.click();
	}
	
	public void enterProfile(String Profiletext) {
		this.profileTxt.sendKeys(Profiletext);}
	
	public void enterPassword(String Password) {
		this.Password.sendKeys(Password);
	}
	
	public void clickManualPswdMode() {
		this.Manualpswd.click();
	}
	public void enterLogInID(String loginID) {
		this.LoginID.sendKeys(loginID);
	}
	
	public void enterPhoneNo(String PhoneNo) {
		this.Phone.sendKeys(PhoneNo);
	}
	
	public void enterEmail(String email) {
		this.Email.sendKeys(email);
	}
	
	public void enterLName(String Lastname) {
		this.lName.sendKeys(Lastname);
	}
	
	public void enterFName(String Firstname) {
		this.fName.sendKeys(Firstname);
	}
	
	public void clickAdminTab() {
		this.Admintab.click(); }
	
	public void clickAddUser() {
		this.addUser.click();
	}
	
	
	
	
}
