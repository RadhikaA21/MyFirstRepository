package workingwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Placeorder1 {
	WebDriver driver;
	
	public Placeorder1(WebDriver driver2) {
		driver=driver2;
	}

	public void placeorder() throws InterruptedException
    {
 	   //order
		
		WebElement orderdetails = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=history\']"));
		orderdetails.click();
		
		//women
		WebElement women1 = driver.findElement(By.xpath("//a[@title='Women']"));
		women1.click();
		
		/*tops
		WebElement tops1 = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category'][@title='Dresses']"));
		tops1.click();
		*/
		//image
		WebElement img1 = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		img1.click();
		
		WebElement frameEle = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frameEle);
		
		//Quantity
		WebElement qty= driver.findElement(By.xpath("//i[@class='icon-plus']"));
		//Select sel6=new Select(qty);
		qty.click();
		
		//size
		WebElement size1=driver.findElement(By.id("group_1"));
		Select sel5=new Select(size1);
		size1.sendKeys("2");
		
		/*color
		WebElement color1= driver.findElement(By.id("color13"));
		color1.sendKeys("");*/
		
		//add to cart
		WebElement addtocart = driver.findElement(By.name("Submit"));
		addtocart.click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		
		//proceed to checkout- add to cart screen
		WebElement proceed = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		proceed.click();

    }


}
