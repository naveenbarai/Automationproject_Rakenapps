package StepExecute;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import commom_method.ChromeCommonMethod;
import commom_method.FireFoxCommomMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.YDownload;

public class EbookDownload {
	
	WebDriver driver;
	ChromeCommonMethod cm;
	YDownload down;
	Actions act;
	JavascriptExecutor js;
	
	@Given("I want open broswer")
	public void i_want_open_broswer() {
	   cm=new ChromeCommonMethod();
	   driver=cm.launchBrowser();
	   cm.launchAplication();
	   down=new YDownload(driver);
	}

	@Given("I want to open resources section")
	public void i_want_to_open_resources_section() throws Exception {
		
	    down.addsbtn1.click();
	    Thread.sleep(1000);
	    act=new Actions(driver);
	    act.moveToElement(down.resourceHover1).build().perform();
	    act.moveToElement(down.Ebook).click().build().perform();
	    //Thread.sleep(2000);
	}

	@When("I want Open successfully")
	public void i_want_Open_successfully() throws Exception {
		Thread.sleep(3000);
		 js=(JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)");
		  Thread.sleep(1000);
		  down.cardCTD.click();
		  
	   
	}

	//@SuppressWarnings("deprecation")
	@When("I want to click Ebook download button")
	public void i_want_to_click_Ebook_download_button() throws Exception {
	   Thread.sleep(2000);
	   String sourceLink=  down.downloadcopy.getAttribute("href");
	   System.out.println(sourceLink);
	   String finalcommand = "cmd /c C:\\Wget\\wget.exe -P D:\\mavenproject_automation\\naveen_rakenapps\\src\\main\\resources\\download --no-check-certificate "+ sourceLink;
	   System.out.println(finalcommand);
	   
	   Process exec=Runtime.getRuntime().exec(finalcommand);
	   
	   
	   
//	   try {
//	  		
//			Process exec=Runtime.getRuntime().exec(finalcommand);
//	  		   int Exitvalue=exec.waitFor();
//	  		   System.out.println("Exit value :"+Exitvalue);
//	   } 
//	    catch (InterruptedException ex) 
//	   {
//				System.out.println(ex.toString());
//	   }
	   
	   System.out.println("Download successful");
}
    @Then("Ebook download successfully")
	public void ebook_download_successfully() throws Exception {
    	
		cm.closebrowser();
    }


}
