package workingwithtestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
	  
	//email address
      
      WebElement emailad = driver.findElement(By.id("email_create"));
		emailad.sendKeys("testng93@gmail.com");
      
		//create account
		WebElement createac = driver.findElement(By.name("SubmitCreate"));
		createac.click(); 	
		
		//class 1
		EnterDetails ent1=new EnterDetails(driver);
		ent1.EnterData();
		
		//class2
		Placeorder1 po1=new Placeorder1(driver);
		po1.placeorder();
		
		//class3
		ProceedToCheckout ptc1=new ProceedToCheckout(driver);
		ptc1.proceedtocheck();
		
	  
  } 
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
      driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

  }
 

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
