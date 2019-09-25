package com.training.sanity.tests;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LostPasswordPOM;
import com.training.pom.ProfilePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.mysql.jdbc.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class LostPswd {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private LostPasswordPOM lostPasswordPOM;
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
		lostPasswordPOM = new LostPasswordPOM(driver);
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
  public void editProfileResetPassword() {
	  
	  loginPOM.sendUserName("sandemis	");
	  lostPasswordPOM.clickLostpswdBtn();
	  lostPasswordPOM.confirmLostpswdmessage();
	  screenShot.captureScreenShot("Lostpswdpage");
	  lostPasswordPOM.enterUserDetails("sandemis");
	  screenShot.captureScreenShot("Lostpswduserdetail");
	  lostPasswordPOM.submitLostPswdRequest();
	  lostPasswordPOM.printFinalMessage();
	  screenShot.captureScreenShot("Lostpswdfinalmessage");

	 
  }
}
