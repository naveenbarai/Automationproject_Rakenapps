package StepExecute;

import java.sql.Driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commom_method.ChromeCommonMethod;
import commonAssertion.LoginAss;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.ObjectRepo_LoginTeam;

public class LoginTeamStep {
	WebDriver driver;
	ChromeCommonMethod cm;
	LoginAss la;
	
	ObjectRepo_LoginTeam obj;
	@Given("I want to click on login")
	public void i_want_to_click_on_login() {
	   cm=new ChromeCommonMethod();
	   driver=cm.launchBrowser();
	   obj=new ObjectRepo_LoginTeam(driver);
	   cm.launchAplication();
	   la=new LoginAss();
	   la.verifyTitle("RakenTitle",driver.getTitle());
	   
	   
	}

	@Given("I want enter username and password")
	public void i_want_enter_username_and_password() throws Exception 
	{
	   obj.LoginCTD.click();
	   Thread.sleep(3000);
	   obj.username.sendKeys("nav1996@gmail.com");
	   obj.password.sendKeys("Nav@1234");
	}

	@When("I want login successfully")
	public void i_want_login_successfully() throws Exception 
	{
		obj.loginbtn.click();
		Thread.sleep(4000);
	    
	}

	@When("I want click on Team and")
	public void i_want_click_on_team_and() throws Exception 
	{
	   obj.Teambtn.click();
	   Thread.sleep(1000);
	   obj.addteam.click();
	   Thread.sleep(1000);
	}

	@When("I want Add Team Members")
	public void i_want_add_team_members() throws InterruptedException {
		obj.firstname.sendKeys("jdishfohy");
		obj.lastname.sendKeys("ghftt");
		obj.email.sendKeys("Nvadd@gmail.com");
		obj.EID.sendKeys("jclsfhil");
		obj.phonenum.sendKeys("7563567");
		obj.role.click();
		obj.role.sendKeys(Keys.ARROW_DOWN);
		obj.role.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		obj.addbtn.click();
		Thread.sleep(1000);
		obj.nextbtn.click();
		Thread.sleep(1000);
	   
	}

	@Then("It should be successfully save")
	public void it_should_be_successfully_save() throws Exception 
	{
	  obj.radiobtn.click();
	  obj.namebtn.click();
	  Thread.sleep(1000);
	  obj.savebtn.click();
	 
	  Thread.sleep(2000);
	}
	
	@And("Logout successfully")
	public void Logout_successfully() throws Throwable {
		obj.profilebtn.click();
		obj.loguotbnt.click();
		cm.closebrowser();
	}
	
	

	

}