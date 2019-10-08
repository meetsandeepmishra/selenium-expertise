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


	
public class CourseAssessmentPOM {
	private WebDriver driver; 
	
	public CourseAssessmentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}


	@FindBy(xpath="//*[@id='toolimage_2778']")
	private WebElement assessment;

	
	public void clickAssessments() {
		this.assessment.click();
		
	}
	
	
	
	
	}
	

	
	
	
	
