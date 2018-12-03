package page_object_factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory
{

	   WebDriver driver;
	   
	 public PageFactory(WebDriver driver)
	 {
		this.driver=driver;
	 }

	 /* By username = By.xpath("//input[@id='login1']");
	  By password=  By.xpath("//input[@id='password']");
	  By searchbox= By.xpath("//input[@id='srchword']");
	  By submit=    By.xpath("//input[@type='submit']");*/
	   
	  @FindBy(xpath="//input[@id='login1']")
	  WebElement username;
	  @FindBy(xpath="//input[@id='password']")
	  WebElement password;
	  @FindBy(xpath="//input[@id='srchword']")
	  WebElement searchbox;
	  @FindBy(xpath="//input[@type='submit']")
	  WebElement submit;
	  
	  
	  public WebElement EmailId()
	  {
		  return username;
	  }
	  public WebElement Paswd()
	  {
		  return password;
	  }
	  public WebElement searching()
	  {
		return searchbox;	  
	  }
	  public WebElement clickonsearch()
	  {
		return submit;	  
	  }
}
