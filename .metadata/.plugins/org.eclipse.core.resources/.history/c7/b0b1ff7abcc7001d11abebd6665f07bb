package commom_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxCommomMethod 
{

WebDriver driver;
	
	public WebDriver launchBrowser()
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\mavenproject_automation\\naveen_rakenapps\\src\\main\\resources\\lib_server\\geckodriver.exe");
		 driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  return driver;
}
	public void launchAplication() 
	{
		driver.get("https://www.rakenapp.com/construction-checklists/demolition");
	}
	
	public void closebrowser() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}
}
