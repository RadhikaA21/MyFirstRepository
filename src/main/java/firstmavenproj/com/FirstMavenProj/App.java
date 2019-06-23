package firstmavenproj.com.FirstMavenProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
	static WebDriver driver;
    public static void main( String[] args )
   
    {
    	
    	App ref=new App();
    	ref.setup();
    	DemoMaven1 dmv1=new DemoMaven1(driver);
    	dmv1.registeracc();
    }
    
    
    void setup()
   	{
   		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
   		driver = new ChromeDriver();
   		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
      
   	}

}

