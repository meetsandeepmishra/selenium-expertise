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


	
public class CourseTestPOM {
	private WebDriver driver; 
	
	public CourseTestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}

	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[3]/div[1]/div/div[2]/div[4]/div/a")
	private WebElement courseSubscribtion;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[2]")
	private WebElement subscribedMessage;
	
	@FindBy(linkText="My courses")
	private WebElement myCoursestab;
	
	@FindBy(linkText="Automation - Selenium with JAVA")
	private WebElement takeCourse;
	
	@FindBy(xpath="//div[@class='col-xs-12 col-md-12']/section/div/div[2]/div/div[6]/div/div/a/img")
	private WebElement tests;
	
	@FindBy(linkText="Online Quiz")
	private WebElement onlineQuiz;
	
	@FindBy(linkText="Start test")
	private WebElement starttheTest;
	
	@FindBy(xpath="//*[@id=\"question_div_23\"]/div[1]/strong")
	private WebElement question1;
	
	@FindBy(id="choice-23-1")
	private WebElement answer1;
	
	@FindBy(xpath="//div[@class='form-actions']/button")
	private WebElement nextQuestion;
	
	@FindBy(xpath="//*[@id=\"question_div_24\"]/div[1]/strong")
	private WebElement question2;
	
	@FindBy(id="choice-24-2")
	private WebElement answer2;
	
	@FindBy(xpath="//*[@id=\"question_div_24\"]/div[3]/button[2]")
	private WebElement endTest;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[4]/div/h4")
	private WebElement testResultis;
	
	public void testResult() {
		String resultmessage=this.testResultis.getText();
		System.out.println("The Test result is: " +resultmessage);
	}
	
	public void submitTest() {
		this.endTest.click();
	}
	
	public void giveAnswer2() {
		this.answer2.click();
	}
	
	public void QuestionTwo() {
		String Qtwo=this.question2.getText();
		System.out.println("Question 2 is: " +Qtwo);
	}
	
	public void clickNextQuestion() {
		this.nextQuestion.click();
	}
	
	public void giveAnswer1() {
		this.answer1.click();
	}
	
	public void QuestionOne() {
		String Qone=this.question1.getText();
		System.out.println("Question 1 is: " +Qone);
	}
	
	public void startTest() {
		this.starttheTest.click();
	}
	
	public void takeQuiz() {
		this.onlineQuiz.click();
	}
	
	
	public void TakeTest() {
		this.tests.click();
	}
	
	
	public void clickCourse() {
		this.takeCourse.click();
	}
	public void myCourses() {
		this.myCoursestab.click();
	}
	
	public void subscribedAlert() {
		String Subscribedconfirmation = this.subscribedMessage.getText();
		System.out.println("Here is the confirmation: " +Subscribedconfirmation);
	}
	
	public void courseSubscribe() {
		this.courseSubscribtion.click();
	}
	
	
		
	
	
	}
	

	
	
	
	
