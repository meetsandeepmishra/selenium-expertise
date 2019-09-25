package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	
public class ProfilePOM {
	private WebDriver driver; 
	
	public ProfilePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}

	@FindBy(linkText="Homepage")
	private WebElement homepage; 
	
	@FindBy(linkText="Edit profile")
	private WebElement editProfile;
	
	@FindBy(id="profile_password0")
	private WebElement pass;
	
	@FindBy(id="password1")
	private WebElement newPassword;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement confirmationmessage;
	
	@FindBy(id="profile_password2")
	private WebElement confirmPassword;
	
	@FindBy(id="profile_apply_change")
	private WebElement savesettingsBtn;
	
	public void sendCurrentPassword(String pass) {
		this.pass.clear();
		this.pass.sendKeys(pass); }
	
	public void sendNewPasword(String newPassword) {
		this.newPassword.clear();
		this.newPassword.sendKeys(newPassword);}
	
	public void confirmPassword(String confirmPassword) {
		this.confirmPassword.clear();
		this.confirmPassword.sendKeys(confirmPassword);}
	
	public void clickhomepageBtn() {
		this.homepage.click();}
	
	public void clickEditProfileBtn() {
		this.editProfile.click();}
	
	public void clickSavesettingsBtn() {
		this.savesettingsBtn.click();
	}
	
	public void confirMessage() {
		Boolean confirm= this.confirmationmessage.isDisplayed();
		System.out.println("Password change has been done: " +confirm);
	}
		
	}
	
	
	
	
	
	
