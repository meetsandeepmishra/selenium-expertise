package com.training.sanity.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.training.generics.ScreenShot;
import com.training.pom.CourseCatalogPOM;
import com.training.pom.CourseTestPOM;
import com.training.pom.LoginPOM;
import com.training.pom.ProfilePOM;
import com.training.pom.ProjectCreationPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.mysql.jdbc.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Medium_ELTC_041_CourseTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ProjectCreationPOM projectCreationPOM;
	private CourseCatalogPOM courseCatalogPOM;
	private CourseTestPOM courseTestPOM;
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
		courseTestPOM= new CourseTestPOM(driver);

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
  public void CourseTestModule() throws InterruptedException {
	  loginPOM.sendUserName("sandemis");
	  loginPOM.sendPassword("Test@2");
	  loginPOM.clickLoginBtn();
	  courseCatalogPOM.clickHomePage();
	  courseCatalogPOM.clickcourseCataloglink();
	  courseCatalogPOM.searchTextEnter("Selenium");
	  courseCatalogPOM.clickSearchBtn();
	  courseTestPOM.courseSubscribe();
	  courseTestPOM.subscribedAlert();
	  screenShot.captureScreenShot("CourseSubscribed");
	  courseTestPOM.myCourses();
	  courseTestPOM.clickCourse();
	  courseTestPOM.TakeTest();
	  courseTestPOM.takeQuiz();
	  courseTestPOM.startTest();
	  courseTestPOM.QuestionOne();
	  courseTestPOM.giveAnswer1();
	  screenShot.captureScreenShot("TestQuestion1");
	  courseTestPOM.clickNextQuestion();
	  courseTestPOM.QuestionTwo();
	  courseTestPOM.giveAnswer2();
	  screenShot.captureScreenShot("TestQuestion2");
	  courseTestPOM.submitTest();
	  courseTestPOM.testResult();
	  screenShot.captureScreenShot("TestResult");
  }
  
}