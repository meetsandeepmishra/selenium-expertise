package com.training.sanity.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.training.generics.ScreenShot;
import com.training.pom.AdminTestPOM;
import com.training.pom.CourseCatalogPOM;
import com.training.pom.CourseTestPOM;
import com.training.pom.LoginPOM;
import com.training.pom.ProfilePOM;
import com.training.pom.ProjectCreationPOM;
import com.training.pom.UserAddPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.mysql.jdbc.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class AdminTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private CourseCatalogPOM courseCatalogPOM;
	private CourseTestPOM courseTestPOM;
	private AdminTestPOM adminTestPOM;
	private UserAddPOM userAddPOM;
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
		courseTestPOM= new CourseTestPOM(driver);
		adminTestPOM= new AdminTestPOM(driver);
        userAddPOM= new UserAddPOM(driver);
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
  public void adminTestModule() throws InterruptedException {
	  loginPOM.sendUserName("admin");
	  loginPOM.sendPassword("admin@123");
	  loginPOM.clickLoginBtn();
	  courseCatalogPOM.clickHomePage();
	  courseTestPOM.myCourses();
	  courseTestPOM.clickCourse();
	  courseTestPOM.TakeTest();
	  adminTestPOM.clickCreateTest();
	  adminTestPOM.enterTestName("ComplexTC Test");
	  adminTestPOM.clickAdvancedSettings();
	  adminTestPOM.giveContexttoTest("ComplexTC-contexttoTest");
	  adminTestPOM.clickfeedbackEndofTest();
	  adminTestPOM.enableStartTime();
	  adminTestPOM.enterPassPercentage("80");
	  adminTestPOM.clickProceedtoQuestions();
	  adminTestPOM.clickMultiChoice();
	  adminTestPOM.enterQ1("Which course are you learning?");
	  adminTestPOM.Option1("Selenium");
	  adminTestPOM.Option2("JAVA");
	  adminTestPOM.Option3("C");
	  adminTestPOM.Option4("C#");
	  adminTestPOM.markTrueAnswer();
	  adminTestPOM.assignScore("10");
	  adminTestPOM.addtheQuestion();
	  adminTestPOM.clickMultiChoice();
	  adminTestPOM.enterQ1("which language are you using in selenium?");	
	  adminTestPOM.Option1("Python");
	  adminTestPOM.Option2("JAVA");
	  adminTestPOM.Option3("C");
	  adminTestPOM.Option4("C#");
	  adminTestPOM.markTrueAnswer2();
	  adminTestPOM.assignScore2("10");
	  adminTestPOM.addtheQuestion();
	  adminTestPOM.clickPreview();
	  adminTestPOM.clickStartTest();
	  adminTestPOM.clickAdminans1();
	  adminTestPOM.clickAdminNextQues();
	  adminTestPOM.clickAdminans2();
	  adminTestPOM.clickAdminEndTest();
	  adminTestPOM.testResultdisplay();
	  userAddPOM.clickLogoutButton();
	  loginPOM.sendUserName("admin");
	  loginPOM.sendPassword("admin@123");
	  loginPOM.clickLoginBtn();
	  adminTestPOM.clickReporting();
	  adminTestPOM.clickFollowedteachers();
	  adminTestPOM.enterTeachername("manzoor");
	  adminTestPOM.clicksearchteacherbtn();
	  adminTestPOM.clickuserdetail();
	  adminTestPOM.clickTeachercoursedetails();
	  adminTestPOM.clicklatestAttempt();
	  adminTestPOM.clicksendEmailcheckbox();
	  adminTestPOM.clickcorrectTest();
	  adminTestPOM.notificationMessage();
	  adminTestPOM.clickAdmincourselink();
	  
	  
  }
}