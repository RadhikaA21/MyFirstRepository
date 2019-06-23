package workingwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterDetails {
	
	WebDriver driver;
	
	
	
	public EnterDetails(WebDriver driver2) {
		driver=driver2;
	}



	public void EnterData()
	{
	//select gender
	WebElement gender1=driver.findElement(By.id("uniform-id_gender1"));
	gender1.click();
    
	//first name
	WebElement fname= driver.findElement(By.name("customer_firstname"));
	fname.sendKeys("abcd");
	
	//last name
	WebElement lname= driver.findElement(By.name("customer_lastname"));
	lname.sendKeys("efgh");
	
	//password
	WebElement pswd = driver.findElement(By.id("passwd"));
	pswd.sendKeys("Radhika21");
	
	//DOB days
	WebElement days1=driver.findElement(By.name("days"));
	Select sel=new Select(days1);
	sel.selectByValue("21");
	
	//DOB month
	WebElement months1=driver.findElement(By.name("months"));
	Select sel1 = new Select(months1);
	sel1.selectByValue("1");
	
//DOB year
	
	WebElement year1=driver.findElement(By.name("years"));
	Select sel2 = new Select(year1);
	sel2.selectByValue("1996");
	
	//address
	WebElement addres1= driver.findElement(By.name("address1"));
	addres1.sendKeys("abcde efghi 1");

	//city
	WebElement city1= driver.findElement(By.name("city"));
	city1.sendKeys("pune");

	//state
	
	WebElement state1=driver.findElement(By.name("id_state"));
	Select sel3 = new Select(state1);
	sel3.selectByValue("14");
	
	//postal code
	WebElement pstlcode= driver.findElement(By.name("postcode"));
	pstlcode.sendKeys("12345");
	
	//country
	WebElement country1=driver.findElement(By.id("id_country"));
	Select sel4=new Select(country1);
	country1.sendKeys("21");

	//mobile
	WebElement mblphn= driver.findElement(By.id("phone_mobile"));
	mblphn.sendKeys("1234567890");

	//address
	WebElement addr1= driver.findElement(By.id("alias"));
	addr1.sendKeys("test address");
	
	//register acc
	WebElement registerme = driver.findElement(By.name("submitAccount"));
	registerme.click();

	}
}
