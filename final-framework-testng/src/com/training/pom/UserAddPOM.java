package com.training.pom;

import java.awt.Desktop.Action;
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
	
	@FindBy(xpath="//*[@id='status_select']")
	private WebElement profile;
	
	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[10]/div[1]/div/div/div[2]/ul/li[1]/a/span")
	private WebElement TrainerOption;
	
	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[10]/div[1]/div/div/div[2]/ul/li[2]/a/span")
	private WebElement LearnerOption;
	
	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[10]/div[1]/div/div/div[2]/ul/li[3]/a/span")
	private WebElement HumanRseourcesManagerOption;
	
	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[10]/div[1]/div/div/div[2]/ul/li[4]/a/span")
	private WebElement sessionsAdminOption;
	
	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[10]/div[1]/div/div/div[2]/ul/li[5]/a/span")
	private WebElement studentsuperiorOption;
	
	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[10]/div[1]/div/div/div[2]/ul/li[6]/a/span")
	private WebElement InviteeOption;
	
	@FindBy(name="submit")
	private WebElement add;
	
	@FindBy(xpath="//*[@id='navbar']/ul[2]/li[2]/a")
	private WebElement siteowner;
	
	@FindBy(id="logout_button")
	private WebElement logout;
	
	public void clickLogoutButton() {
		Actions act= new Actions(driver);
		act.moveToElement(siteowner).click(siteowner).perform();
		this.logout.click();
		
	}
	

	public void clickAdd() {
		this.add.click();
	}
	
	public void enterProfile(String Profiletext) {
		Select sel= new Select(profile);
		sel.selectByVisibleText(Profiletext);
		
	}

	
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
