package testcases_loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.ObjectRepository;


public class Loginpage 
{

	@Test
	public void Login()
	{
        System.setProperty("webdriver.chrome.driver", "E:\\sainath\\workspace\\browsers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		ObjectRepository rd = new ObjectRepository(driver);
		
		rd.EmailId().sendKeys("Sainath");
		rd.Paswd().sendKeys("Sridevik@1");
		
	}
}
