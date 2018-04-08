package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewScreenshot
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Study Material\\Selenium Neon3 Workspace\\BIZZ COREL\\Web Drivers\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\Study Material\\Selenium Neon3 Workspace\\BIZZ COREL\\Screenshot\\BibhutiSS.png");
		org.apache.commons.io.FileUtils.copyFile(source, destination); //For old version
		//For new version just write :-
		//FileUtils.copyFile(source, destination);
	}

}
