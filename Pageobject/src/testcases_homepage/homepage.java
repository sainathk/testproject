
package testcases_homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.ObjectRepository;


public class homepage 
{
    @Test
    public void home()
    {
        System.setProperty("webdriver.chrome.driver", "E:\\sainath\\workspace\\browsers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		
		ObjectRepository rp = new ObjectRepository(driver);
		rp.searching().sendKeys("laptops");
		rp.clickonsearch().click();
    }
}
