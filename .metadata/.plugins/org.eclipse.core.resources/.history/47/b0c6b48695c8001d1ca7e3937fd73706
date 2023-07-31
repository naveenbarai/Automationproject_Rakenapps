package StepExecute;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import commom_method.ChromeCommonMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PlayVideoObjectRepo;

public class PlayVideoStep 
{
   WebDriver driver;
   ChromeCommonMethod cm;
   PlayVideoObjectRepo ply;
   Actions act;
   JavascriptExecutor js1;
   
   @Given("I want to open borswer")
   public void i_want_to_open_borswer() 
   {
      cm=new ChromeCommonMethod();
      driver=cm.launchBrowser();
      cm.launchAplication();
      ply=new PlayVideoObjectRepo(driver);
      
   }

   @Given("I want to click resources section")
   public void i_want_to_click_resources_section() throws Exception 
   {
	   Thread.sleep(2000);
    ply.addsbtn.click();
    act=new Actions(driver);
    act.moveToElement(ply.resourceHover).build().perform();
    act.click(ply.caseStudiesCTD).build().perform();
    Thread.sleep(3000);
   
   }

   @When("It open successfully")
   public void it_open_successfully() throws Exception
   {
	 
	   js1 = (JavascriptExecutor) driver;
	   js1.executeScript("window.scrollBy(0,1200)");
	   ply.projectVideo.click();
	   Thread.sleep(1000);
	   
   }

   @When("To enter play button")
   public void to_enter_play_button() throws Exception 
   {
	   js1 = (JavascriptExecutor) driver;
	   js1.executeScript("window.scrollBy(0,200)");
	   ply.playbtn.click();
	   
	 }
  @Then("It successfully play video")
   public void it_successfully_play_video() throws Exception {
	   Thread.sleep(30000);
	   cm.closebrowser();
     
   }



}
