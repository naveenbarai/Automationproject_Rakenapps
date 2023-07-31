package StepExecute;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import commom_method.ChromeCommonMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.SalesContactObjectRepo;

public class SalesContactStep 
 {
  WebDriver driver;
  ChromeCommonMethod cm;
 SalesContactObjectRepo salcon;
  JavascriptExecutor js;
  Select sel;
	@Given("I want open borswer")
	public void i_want_open_borswer()
	{
	 cm=new ChromeCommonMethod();
	 driver=cm.launchBrowser();
	 cm.launchAplication();
	 salcon=new SalesContactObjectRepo(driver);
	 
	}

	@Given("I want click Contact sales")
	public void i_want_click_Contact_sales() throws InterruptedException {
		Thread.sleep(2000);
	    salcon.addsCTK.click();
	    salcon.contactbtn.click();
	    Thread.sleep(2000);
	}

	@When("Open successfully")
	public void open_successfully() throws Exception {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
	}

	@When("Enter All details are valid")
	public void enter_All_details_are_valid() {
		salcon.firstname.sendKeys("hitesh");
		salcon.lastname.sendKeys("jfdfr");
		salcon.phonenum.sendKeys("7563453456");
		salcon.emailid.sendKeys("nnsfhs@gmail.com");
	    salcon.companyname.sendKeys("kamal motor");
	    salcon.cookies.click();
		sel=new Select(salcon.companyrole);
		sel.selectByIndex(2);
		sel=new Select(salcon.companysize);
		sel.selectByIndex(3);
		
		
	   
	}

	@Then("submit successfully")
	public void submit_successfully() throws Exception {
		salcon.submitbtn.click();
		cm.closebrowser();
	    
	}



	
}
