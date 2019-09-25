package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	
public class CourseCatalogPOM {
	private WebDriver driver; 
	
	public CourseCatalogPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}

	@FindBy(xpath="//a[@class='btn btn-primary btn-large']")
	private WebElement courseCatalog; 
	
	
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/ul/li")
	private WebElement courseCatalogPage;
	
	@FindBy(xpath="//div/input[@class='form-control']")
	private WebElement searchBar;
	
	@FindBy(xpath="//div/button[@class='btn btn-default']")
	private WebElement clickSearchBar;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/p/strong")
	private WebElement searchResultPage;
	
	
	public void clickCourseCatalog() {
	this.courseCatalog.click();
	}

	
	public void searchTextEnter(String searchText) {
		this.searchBar.sendKeys(searchText);
	}
	
	public void clickSearchBtn() {
		this.clickSearchBar.click();
	}
	
	public void validateSearchResult() {
	String searchPage= this.searchResultPage.getText();
	System.out.println("Search Result Page says: " + searchPage);}
	}
	
	
