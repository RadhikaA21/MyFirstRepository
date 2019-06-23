package workingwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProceedToCheckout {

	WebDriver driver;
	
	public ProceedToCheckout(WebDriver driver2) {
		driver=driver2;
	}

	public void proceedtocheck() throws InterruptedException
	{
		Thread.sleep(5000);
		//proceed to checkout-summary screen
			WebElement proceed1 = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']/span"));
			proceed1.click();
			
		//proceed to checkout-sign in screen
			WebElement proceed2 = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
			proceed2.click();
			
		//proceed to checkout-order screen
			WebElement proceed3 = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
			proceed3.click();	
			
			//I agree checkbox
			
			WebElement iagree = driver.findElement(By.xpath("//input[@type='checkbox']"));
			iagree.click();
			
			
		//proceed to checkout-shipping screen
			WebElement proceed4 = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
			proceed4.click();	
	}

}
