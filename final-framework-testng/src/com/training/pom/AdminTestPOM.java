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


	
public class AdminTestPOM {
	private WebDriver driver; 
	
	public AdminTestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}

	@FindBy(xpath="//*[@id='cm-content']/div/div[3]/a[1]/img")
	private WebElement createTest;
	
	@FindBy(id="exercise_title")
	private WebElement testName;
	
	@FindBy(id="advanced_params")
	private WebElement advancedsettings;
	
	@FindBy(xpath="//html[@dir='ltr']/body")
	private WebElement contextText;
	
	@FindBy(id="exerciseType_0")
	private WebElement FeedbackEOT;
	
	@FindBy(name="activate_start_date_check")
	private WebElement EnableStartTime;
	
	@FindBy(xpath="//*[id='date_time_wrapper_start_time']/span")
	private WebElement date;
	
	@FindBy(id="pass_percentage")
	private WebElement passpercentage;
	
	@FindBy(id="exercise_admin_submitExercise")
	private WebElement Prcd;
	
	@FindBy(xpath="//div[@class='panel panel-default']/div/ul/li/div/a/img")
	private WebElement multiChoice;
	
	@FindBy(id="question_admin_form_questionName")	
	private WebElement question1;
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, answer[1]']")
	private WebElement q1Frame1;
	

	@FindBy(xpath="//iframe[@title='Rich Text Editor, answer[2]']")
	private WebElement q1Frame2;
	

	@FindBy(xpath="//iframe[@title='Rich Text Editor, answer[3]']")
	private WebElement q1Frame3;
	

	@FindBy(xpath="//iframe[@title='Rich Text Editor, answer[4]']")
	private WebElement q1Frame4;
	
	@FindBy(xpath="//html/body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement optionText;
	
	@FindBy(xpath="//tbody/tr/td[2]/input[@value='1']")
	private WebElement correctanswer;
	
	@FindBy(name="weighting[1]")
	private WebElement score;
	
	@FindBy(id="submit-question")
	private WebElement addQuestion;
	
	@FindBy(xpath="//tbody/tr/td[2]/input[@value='2']")
	private WebElement correctanswer2;

	@FindBy(name="weighting[2]")
	private WebElement score2;
	
	@FindBy(xpath="//div[@class='actions']/a[2]/img")
	private WebElement preview;
	
	@FindBy(linkText="Start test")
	private WebElement startTest;
	
    @FindBy(xpath="//div[@class='question_options']/label/input")	
    private WebElement ans1;
    
    @FindBy(xpath="//div[@class='form-actions']/button")
    private WebElement nextQues;
    
    @FindBy(xpath="//div[@class='question_options']/label[2]/input")
    private WebElement ans2;
    
    @FindBy(xpath="//div[@class='form-actions']/button[2]")
    private WebElement adminendTest;
    
    @FindBy(xpath="//*[@id=\"cm-content\"]/div/div[6]/div/h4")
    private WebElement resultdisplay;
    
    @FindBy(linkText="Reporting")
    private WebElement reporting;
    
    @FindBy(linkText="Followed teachers")
    private WebElement followedTeachers;
    
    @FindBy(id="search_user_keyword")
    private WebElement teachersearch;
    
    @FindBy(id="search_user_submit")
    private WebElement teachersearchbtn;
    
    @FindBy(id="details_manzoor")
    private WebElement teacherdetail;
    
    @FindBy(xpath="//*[@id=\"cm-content\"]/div/div[7]/table/tbody/tr[6]/td[7]/a")
    private WebElement teachercoursedetails;
    
    @FindBy(xpath="//*[@id=\"cm-content\"]/div/div[8]/table/tbody/tr/td[5]/a")
    private WebElement latestattempt;
    
    @FindBy(name="send_notification")
    private WebElement clickcheckbox;
    
    @FindBy(id="form-email_submit")
    private WebElement correctest;
    
    @FindBy(xpath="//div[@class='alert alert-info']")
    private WebElement notificationmessage;
    
    @FindBy(xpath="//*[@id=\"cm-content\"]/div/ul/li[1]/a")
    private WebElement Admincourselink;
    
    public void clickAdmincourselink() {
    	this.Admincourselink.click();
    }
    public void notificationMessage() {
    	String NotifyMessage=this.notificationmessage.getText();
    	System.out.println("Confirmation Message" +NotifyMessage);
    }
    
    public void clickcorrectTest() {
    	this.correctest.click();
    }
    
    public void clicksendEmailcheckbox() {
    	this.clickcheckbox.click();
    }
    
    public void clicklatestAttempt() {
    	this.latestattempt.click();
    }
    
    public void clickTeachercoursedetails() {
    	this.teachercoursedetails.click();
    	
    }
    
    public void clickuserdetail() {
    	this.teacherdetail.click();
    }
    
    public void clicksearchteacherbtn() {
    	this.teachersearchbtn.click();
    }
    
    public void enterTeachername(String teacherName) {
    	this.teachersearch.sendKeys(teacherName);
    }
    
    public void clickFollowedteachers() {
    	this.followedTeachers.click();
    }
    
    public void clickReporting() {
    	this.reporting.click();
    }
    
    public void testResultdisplay() {
    	String TestAdminResultMessage= this.resultdisplay.getText();
    	System.out.println("Test Result: " +TestAdminResultMessage);
    }
    
    public void clickAdminEndTest() {
    	this.adminendTest.click();
    }
    public void clickAdminans2() {
    	this.ans2.click();
    }
    
    public void clickAdminNextQues() {
    	this.nextQues.click();
    }
    
    public void clickAdminans1() {
    	this.ans1.click();
    }
    
	public void clickStartTest() {
		this.startTest.click();
	}
	public void clickPreview() {
		this.preview.click();
	}
	
	public void assignScore2(String Marks2) {
		this.score2.sendKeys(Marks2);
	}
	
	public void markTrueAnswer2() {
		this.correctanswer2.click();
	}
	
	
	public void addtheQuestion() {
		this.addQuestion.click();
	}
	
	public void assignScore(String Marks) {
		this.score.sendKeys(Marks);
	}
	
	public void markTrueAnswer() {
		this.correctanswer.click();
	}
	
	public void Option4(String q1ans4) {
		driver.switchTo().frame(q1Frame4);
		this.optionText.sendKeys(q1ans4);
		driver.switchTo().defaultContent();
	}
	
	public void Option3(String q1ans3) {
		driver.switchTo().frame(q1Frame3);
		this.optionText.sendKeys(q1ans3);
		driver.switchTo().defaultContent();
	}
	
	public void Option2(String q1ans2) {
		driver.switchTo().frame(q1Frame2);
		this.optionText.sendKeys(q1ans2);
		driver.switchTo().defaultContent();
	}
	
	public void Option1(String q1ans1) {
		driver.switchTo().frame(q1Frame1);
		this.optionText.sendKeys(q1ans1);
		driver.switchTo().defaultContent();
	}
	
	public void enterQ1(String QuestionOne) {
		this.question1.sendKeys(QuestionOne);
	}
	public void clickMultiChoice() {
		this.multiChoice.click();
	}
	
	public void clickProceedtoQuestions() {
		this.Prcd.click();
	}
	
	public void enterPassPercentage(String Percentage) {
		this.passpercentage.sendKeys(Percentage);
	}
	
	
	
	public void clickCalendar() {
		this.date.click();
	}
	
	public void enableStartTime() {
		this.EnableStartTime.click();
	}
	
	public void clickfeedbackEndofTest() {
		this.FeedbackEOT.click();
	}
	
	public void giveContexttoTest(String ContexttoTest) {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
		this.contextText.sendKeys(ContexttoTest);
		driver.switchTo().parentFrame();
		
	}
	public void clickAdvancedSettings() {
		this.advancedsettings.click();
	}
	
	public void enterTestName(String testname) {
		this.testName.sendKeys(testname);
	}
	
	public void clickCreateTest() {
		this.createTest.click();
	}
	
	
	
}