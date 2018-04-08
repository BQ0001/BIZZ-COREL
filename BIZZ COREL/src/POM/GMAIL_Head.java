package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GMAIL_Head {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Study Material\\Selenium Neon3 Workspace\\BIZZ COREL\\Web Drivers\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		
		GMAIL_Body obj1=new GMAIL_Body(driver);
		obj1.Login("bibhuti0001@gmail.com", "pintu@445");
	}

}
