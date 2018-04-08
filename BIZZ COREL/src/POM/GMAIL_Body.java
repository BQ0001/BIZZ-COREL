package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GMAIL_Body 
{
	@FindBy(id="identifierId")
	private WebElement w1;
	@FindBy(xpath="//span[@class='RveJvd snByac']")
	private WebElement w2;
	//@FindBy(xpath="//input[@type='password']")
	@FindBy(xpath="//*[@id='password']/div[1]/div/div[1]/input")
	private WebElement w3;
	@FindBy(xpath="//span[@class='RveJvd snByac']")
	private WebElement w4;
	
	public GMAIL_Body(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String UN,String PW)
	{
		w1.clear();
		w1.sendKeys(UN);
		w2.click();
		w3.clear();
		w3.sendKeys(PW);
		w4.click();
	}
}
