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


	
public class ProjectCreationPOM {
	private WebDriver driver; 
	
	public ProjectCreationPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}

	@FindBy(xpath="//div[@class='block-title']/h5/a[@alt='Maths']")
	private WebElement courseSelect;
	
	@FindBy (id="istooldesc_6549")
	private WebElement projects;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[3]/a/img")
	private WebElement createProject;
	
	@FindBy(id="add_blog_blog_name")
	private WebElement projectTitle;
	
	@FindBy(id="add_blog_blog_subtitle")
	private WebElement projectSubtitle;
	
	@FindBy(id="add_blog_submit")
	private WebElement saveProjectName;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement projectcreatedMessage;
	
	@FindBy(linkText="Test007")
	private WebElement projectName;
	
	@FindBy(xpath="//*[@id=\"post-151\"]/div/div/h3/a")
	private WebElement welcomeNote;
	
	@FindBy(xpath="//*[@id=\"toolbar\"]/div/div/a[2]/img")
	private WebElement newTask;
	
	@FindBy (id="add_post_title")
	private WebElement taskTitle;
	
	@FindBy (id="add_post_save")
	private WebElement savetaskName;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[3]/div/div[2]")
	private WebElement tasksavedMessage;
	
	@FindBy(xpath="//div[@class='col-sm-12']/a[3]/img")
	private WebElement rolesMgmt;
	
	@FindBy(xpath="//div[@class='col-md-12']/div/div/a[1]/img")
	private WebElement addRole;
	
	@FindBy(xpath="//div[@class='control-group']/div[1]/input")
	private WebElement roleTitle;
	
	@FindBy(xpath="//div[@class='controls']/button")
	private WebElement saveRole;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[3]/div/div[2]")
	private WebElement roleadded;
	
	@FindBy(xpath="//div[@class='col-md-12']/div/div/a[2]/img")
	private WebElement assignRoles;
	
	@FindBy(id="assign_task_task_user_id")
	private WebElement userdropdown;
	
	@FindBy(xpath="//*[@id=\"assign_task_submit\"]")
	private WebElement submitRoleAssigment;
	
	@FindBy(xpath="//div[@class='col-xs-12 col-md-12']/div[2]")
	private WebElement RoleAssignMessage;
	
	@FindBy(xpath="//div[@class='col-xs-12 col-md-12']/div/div/div/a[4]/img")
	private WebElement usersMgmt;
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/div/legend[1]//parent::div/form/div/table/tbody/tr[2]/td/input")
	private WebElement userCheckBox;
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div/div/div/legend[1]//parent::div/form/div/table/tbody/tr[2]/td[5]/a")
	private WebElement registerUser;
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[3]/div/div[2]")
	private WebElement registration;
	
	public void registrationConfirmation() {
		String registermessage=this.registration.getText();
		System.out.println("User Registration Confirmation says: "+ registermessage);
	}
	
	public void registertheUser() {
		this.registerUser.click();
	}
	
	public void selectUser() {
		this.userCheckBox.click();
	}
	
	public void clickUsersMgmt() {
		this.usersMgmt.click();
	}
	
	public void RoleAssignConfirmation() {
		String roleConfirmMessage=this.RoleAssignMessage.getText();
		System.out.println("Role Assignment confirmation message is: " +roleConfirmMessage);
		
	}
	
	public void clickSubmitRole() {
		this.submitRoleAssigment.click();
	}
	
	public void userSelection() {
		Select sel= new Select(userdropdown);
		sel.selectByVisibleText("Site Owner");
	}
	
	public void assignRoles() {
		this.assignRoles.click();
	}
	
	public void Roleaddedmessage() {
		String roleMessage= this.roleadded.getText();
				System.out.println("Alert message says: " +roleMessage);}
	
	
	
	public void savenewRole() {
		this.saveRole.click();
	}
	
	public void enterRoleTitle(String roletext) {
		this.roleTitle.clear();
		this.roleTitle.sendKeys(roletext);
	}
	
	public void clickAddRole() {
		this.addRole.click();
	}
	
	public void clickRolesMgmt() {
		this.rolesMgmt.click();
	}
	
	public void taskcreationmessage() {
		String TaskMessage= this.tasksavedMessage.getText();
				System.out.println("Alert message says: " +TaskMessage);}
	
	public void saveNewTaskName() {
		this.savetaskName.click();
	}
	
	public void enterTaskname(String newtaskTitle) {
		this.taskTitle.clear();
		this.taskTitle.sendKeys(newtaskTitle);
	}
	
	public void clickNewTask() {
		this.newTask.click();
	}
	
	
	
	public void welcomeMessage() {
		String Message= this.welcomeNote.getText();
				System.out.println("Alert message says: " +Message);}
	
	public void clickprojectName() {
		this.projectName.click();
	}
	
	
	public void successmessage() {
	String ProjectCreationMessage= this.projectcreatedMessage.getText();
			System.out.println("Alert message says: " +ProjectCreationMessage);}
	
	
	public void submitProjectName() {
		this.saveProjectName.click();
	}
	
	public void enterProjectSubTitle(String subtitle) {
		this.projectSubtitle.clear();
		this.projectSubtitle.sendKeys(subtitle);
	}
	
	public void enterProjectTitle(String title) {
		this.projectTitle.clear();
		this.projectTitle.sendKeys(title);
	}
	
	public void clickCreateProject() {
		this.createProject.click();
	}
	
	
	public void clickProjects() {
	this.projects.click();}
	


	public void clickCourse() {
	this.courseSelect.click();}
	
	
	
	}
	

	
	
	
	
