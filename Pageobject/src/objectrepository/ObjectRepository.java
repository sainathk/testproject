package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectRepository
{

	   WebDriver driver;
	   
	 public ObjectRepository(WebDriver driver)
	 {
		this.driver=driver;
	 }

	  By username = By.xpath("//input[@id='login1']");
	  By password=  By.xpath("//input[@id='password']");
	  By searchbox= By.xpath("//input[@id='srchword']");
	  By submit=    By.xpath("//input[@type='submit']");
	   
	  public WebElement EmailId()
	  {
		  return driver.findElement(username);
	  }
	  public WebElement Paswd()
	  {
		  return driver.findElement(password);
	  }
	  public WebElement searching()
	  {
		return driver.findElement(searchbox);	  
	  }
	  public WebElement clickonsearch()
	  {
		return driver.findElement(submit);	  
	  }
}
