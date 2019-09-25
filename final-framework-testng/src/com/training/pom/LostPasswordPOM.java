package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LostPasswordPOM {
	private WebDriver driver; 
	
	public LostPasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"lost_password\"]/fieldset/legend")
	private WebElement lostPswdPage;
	
	@FindBy(xpath="//div[@class='panel-body']/ul//li[2]/a")
	private WebElement ILostmyPswdBtn;
	
	@FindBy(id="lost_password_user")
	private WebElement userNameorEmail; 
	
	@FindBy(id="lost_password_submit")
	private WebElement submitLostPswdRequest;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
    private WebElement finalMessage;
	
	public void clickLostpswdBtn() {
	this.ILostmyPswdBtn.click();}
	
	
	public void enterUserDetails(String userNameorEmail) {
		this.userNameorEmail.sendKeys(userNameorEmail);
	}

	public void submitLostPswdRequest() {
		this.submitLostPswdRequest.click();
	}
	
	public void confirmLostpswdmessage() {
		boolean confirm= this.lostPswdPage.isDisplayed();
		System.out.println("I lost my password message is displayed: " +confirm);
	}
	
	public void printFinalMessage () {
		String Message= this.finalMessage.getText();
		System.out.println("Final message says: " +Message);
	}
}