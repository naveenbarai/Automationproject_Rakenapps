package commom_method;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeCommonMethod {
	WebDriver driver;
	
	public WebDriver launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\mavenproject_automation\\naveen_rakenapps\\src\\main\\resources\\lib_server\\chromedriver.exe");
		  ChromeOptions co=new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		   driver=new ChromeDriver(co);
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
	
	public  void downloadprocesses() throws Exception {
		 try {
  		   
  		   String finalcommand = "cmd /c C:\\Wget\\wget.exe -P D:\\wget --no-check-certificate ";
		@SuppressWarnings("deprecation")
		Process pro=Runtime.getRuntime().exec(finalcommand);
  		   int Exitvalue=pro.waitFor();
  		   System.out.println("Exit value :"+Exitvalue);
			
		} 
		 catch (InterruptedException ex) {
			System.out.println(ex.toString());
		
	}
		 
		// https://peter.sh/experiments/chromium-command-line-switches/ unable to socket
	}
}
	
	


