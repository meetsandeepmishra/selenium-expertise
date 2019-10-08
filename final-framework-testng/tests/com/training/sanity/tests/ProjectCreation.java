package com.training.sanity.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.training.generics.ScreenShot;
import com.training.pom.CourseCatalogPOM;
import com.training.pom.LoginPOM;
import com.training.pom.ProfilePOM;
import com.training.pom.ProjectCreationPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.mysql.jdbc.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class ProjectCreation {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ProjectCreationPOM projectCreationPOM;
	private CourseCatalogPOM courseCatalogPOM;
	private static Properties properties;
	private ScreenShot screenShot;
  
  @BeforeClass
  public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
  @BeforeMethod
  public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		courseCatalogPOM = new CourseCatalogPOM(driver);
		projectCreationPOM= new ProjectCreationPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

  @AfterMethod
  public void closebrowser() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
	  
  }

 
  @Test
  public void ProjectModule() throws InterruptedException {
	  loginPOM.sendUserName("admin");
	  loginPOM.sendPassword("admin@123");
	  loginPOM.clickLoginBtn();
	  Thread.sleep(2000);
	  courseCatalogPOM.clickHomePage();
	  projectCreationPOM.clickCourse();
	  projectCreationPOM.clickProjects();
	  projectCreationPOM.clickCreateProject();
	  projectCreationPOM.enterProjectTitle("Test007");
	  projectCreationPOM.enterProjectSubTitle("Test007-SubTitle");
	  projectCreationPOM.submitProjectName();
	  projectCreationPOM.successmessage();
	  screenShot.captureScreenShot("ProjectCreated");
	  projectCreationPOM.clickprojectName();
	  //projectCreationPOM.welcomeMessage();
	  projectCreationPOM.clickNewTask();
	  projectCreationPOM.enterTaskname("Task007");
	  projectCreationPOM.saveNewTaskName();
	 // projectCreationPOM.taskcreationmessage();
	  projectCreationPOM.clickRolesMgmt();
	  projectCreationPOM.clickAddRole();
	  projectCreationPOM.enterRoleTitle("Test007-Role");
	  projectCreationPOM.savenewRole();
	  projectCreationPOM.Roleaddedmessage();
	  screenShot.captureScreenShot("RoleAdded");
	  projectCreationPOM.assignRoles();
	  projectCreationPOM.userSelection();
	  projectCreationPOM.clickSubmitRole();
	  projectCreationPOM.RoleAssignConfirmation();
	  screenShot.captureScreenShot("RoleAssigned");
	  projectCreationPOM.clickUsersMgmt();
	  projectCreationPOM.selectUser();
	  projectCreationPOM.registertheUser();
	  projectCreationPOM.registrationConfirmation();
	  screenShot.captureScreenShot("UserRegistered");

	
  }

  
}
