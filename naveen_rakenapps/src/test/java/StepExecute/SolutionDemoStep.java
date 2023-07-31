package StepExecute;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import commom_method.ChromeCommonMethod;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.ObjectRepo_LoginTeam;
import objectRepository.SolutionObjectRepo;

public class SolutionDemoStep {
	
	WebDriver driver;
	ChromeCommonMethod cm;
	SolutionObjectRepo sul;
	Select sel;
	 
	Actions act;
	JavascriptExecutor jse;
	
	
	
	@Given("To click on Solution and general contractor software")
	public void to_click_on_Solution_and_general_contractor_software() throws Exception 
	{
	    cm=new ChromeCommonMethod();
	    driver=cm.launchBrowser();
	    cm.launchAplication();
	    sul=new SolutionObjectRepo(driver);
	    
	   
	    Thread.sleep(2000);
	   
	    
	    
	}

	@Given("I want to click Schedule Demo")
	public void i_want_to_click_Schedule_Demo() throws Exception
	{    
		act=new Actions(driver);
		 act.moveToElement(sul.solutionhover).build().perform();
		 act.click(sul.generalclick).build().perform();
		 Thread.sleep(3000);
		 sul.scheduledemo.click();
		 Thread.sleep(2000);
	   
	}

	@When("I enter a valid emailid")
	public void i_enter_a_valid_emailid() throws Exception {
	   sul.emailenter.sendKeys("nva@gmail.com");
	   sul.nextbnt.click();
	   Thread.sleep(2000);
	}

	@When("I enter valid contractor person detail")
	public void i_enter_valid_contractor_person_detail() {
		
	    sul.firstname.sendKeys("hfiwhafih");
	    sul.lastname.sendKeys("ghdtgd");
	    sul.companyname.sendKeys("titan");
	    sel=new Select(sul.companyrole); 
	    sel.selectByIndex(4);
	    sel.getFirstSelectedOption();
	    
	    sel=new Select(sul.companysize);
	    sel.selectByIndex(3);
	    sul.countrycode.click();
	    sul.countryindia.click();
	    sul.phonenum.click();
	    sul.phonenum.sendKeys("7586874678");
	   
	    
	}

	@Then("To submit successfully.")
	public void to_submit_successfully() throws Exception 
	
	{
		 jse=(JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,200)");
		  sul.submitbtn.click();
	      cm.closebrowser();
	}




}
