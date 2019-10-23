package com.training.sanity.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.UserAddPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.mysql.jdbc.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Complex_ELTC_072_UserAdd {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private UserAddPOM userAddPOM;
	private static Properties properties;
	private ScreenShot screenShot;
  
  @BeforeClass
  public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
  }
  @BeforeMethod
  public void setUp() throws Exception {
	  	driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
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
 
@Test(dataProvider="useraddTest")
  public void loginAdmin(String Firstname, String Lastname, String email, String PhoneNo, String loginID, String Password, String Profiletext) throws InterruptedException {
	  loginPOM.sendUserName("admin");
	  loginPOM.sendPassword("admin@123");
	  loginPOM.clickLoginBtn();
	  userAddPOM.clickAdminTab();
	  userAddPOM.clickAddUser();
	  userAddPOM.enterFName(Firstname);
	  userAddPOM.enterLName(Lastname);
	  userAddPOM.enterEmail(email);
	  userAddPOM.enterPhoneNo(PhoneNo);
	  userAddPOM.enterLogInID(loginID);
	  userAddPOM.clickManualPswdMode();
	  userAddPOM.enterPassword(Password);
	  userAddPOM.enterProfile(Profiletext);
	  userAddPOM.clickAdd();
	  userAddPOM.clickLogoutButton();
	  
  }
  
	  @DataProvider (name="useraddTest")
	  public Object[][] useraddTestMethod(){	
		  return new Object[][] {
			 {"TestFname001","TestLname001","Test001@gmail.com","9976543211","TestFname001","TestFname001","Learner"},
			 {"TestFname002","TestLname002","Test002@gmail.com","9976543212","TestFname002","TestFname002","Trainer"},
		     {"TestFname003","TestLname003","Test003@gmail.com","9976543213","TestFname003","TestFname003","Invitee"},
		     {"TestFname004","TestLname004","Test004@gmail.com","9976543214","TestFname004","TestFname004","Student's superior"},
		     //*{"manzoor","mehadi","manzoor@gmail.com","9876543210","Manzoor","manzoor","Learner"},
			 /*{"alex","hales","alex@gmail.com","9876543211","Alex","alex","Trainer"},
		     {"george","bush","george@gmail.com","9876543212","George","george","Invitee"},
		     {"mark","angel","mark@gmail.com","9876543213","Mark","mark","Student's superior"},*/
		  };
	  }
}

  
  /*@Test(dataProvider="useraddTest", priority=2)
  public void addUserFunction(String fname, String lname, String eMail, String PhoNeNo, String lOginID, String PAssword) throws InterruptedException{
	  driver.findElement(By.id("firstname")).sendKeys(fname);
	  driver.findElement(By.id("lastname")).sendKeys(lname);
	  driver.findElement(By.id("email")).sendKeys(eMail);
	  driver.findElement(By.id("phone")).sendKeys(PhoNeNo);
      driver.findElement(By.id("username")).sendKeys(lOginID);
	  userAddPOM.clickManualPswdMode();
	  driver.findElement(By.id("password")).sendKeys(PAssword);
	  driver.findElement(By.xpath("//div[@class='dropdown-menu open']/div/input")).sendKeys("test");
      userAddPOM.clickAdd();
	    }
 
  }
  
}*/