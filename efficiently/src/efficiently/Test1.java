package efficiently;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
	
	        // TODO Auto-generated method stub



	       System.setProperty("webdriver.chrome.driver","D:\\Images to upload\\chromedriver.exe");
	        ChromeDriver driver = new ChromeDriver();
	        // TODO Auto-generated method stub
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://login.efficiently.com/login");
	    
	}
}
