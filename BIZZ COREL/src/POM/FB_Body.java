package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Body 
{
	@FindBy(id="email")
	private WebElement w1;
	@FindBy(id="pass")
	private WebElement w2;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement w3;
	
	public FB_Body(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String UN,String PW)
	{
		w1.clear();
		w1.sendKeys(UN);
		w2.clear();
		w2.sendKeys(PW);
		w3.click();
	}
	
}
