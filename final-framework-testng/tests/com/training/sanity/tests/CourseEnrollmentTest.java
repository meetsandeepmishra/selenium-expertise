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
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.mysql.jdbc.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class CourseEnrollmentTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
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
  public void CourseCatalogSearchFunction() throws InterruptedException {
	  loginPOM.sendUserName("sandemis");
	  loginPOM.sendPassword("Test@2");
	  loginPOM.clickLoginBtn();
	  Thread.sleep(2000);
	  courseCatalogPOM.clickHomePage();
	  courseCatalogPOM.clickcourseCataloglink();
	  courseCatalogPOM.searchTextEnter("JAVA");
	  courseCatalogPOM.clickSearchBtn();
	  
	  courseCatalogPOM.validateSearchResult();
	  
  }

  
}
