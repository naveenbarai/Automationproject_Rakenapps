package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectRepo_LoginTeam {
	
	WebDriver driver;
	
	public ObjectRepo_LoginTeam(WebDriver driver) 
	{
	  this.driver=driver;
	  PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[@href=\"https://app.rakenapp.com\"]")
	public WebElement LoginCTD;
	
	@FindBy(xpath = "//input[@id=\"username\"]")
	public WebElement username;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement password;
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	public WebElement loginbtn;
	
	@FindBy(xpath = "//a[@href=\"/team\"]")
	public WebElement Teambtn;
	
	@FindBy(xpath = "(//button[@type=\"button\"])[6]")
	public WebElement addteam;
	
	@FindBy(xpath = "(//input[@type=\"text\"])[5]")
	public WebElement firstname;
	
	@FindBy(xpath = "(//input[@type=\"text\"])[6]")
	public WebElement lastname;
	
	@FindBy(xpath = "(//input[@type=\"text\"])[7]")
	public WebElement email;
	
	@FindBy(xpath = "(//input[@type=\"text\"])[8]")
	public WebElement EID;
	
	@FindBy(xpath = "//input[@placeholder=\"Number\"]")
	public WebElement phonenum;
	
	@FindBy(xpath = "(//input[@type=\"text\"])[9]")
	public WebElement role;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement addbtn;
	
	@FindBy(xpath = "(//span[@class=\"MuiButton-label\"])[3]")
	public WebElement nextbtn;
	
	@FindBy(xpath = "(//input[@type=\"radio\"])[2]")
	public WebElement radiobtn;
	
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[4]")
	public WebElement namebtn;
	
	@FindBy(xpath = "//button[@form=\"projects\"]")
	public WebElement savebtn;
	
	@FindBy(xpath = "//img[@src=\"https://cdn.rakenapp.com/ui/prd/raken-redesign-ui/images/avatar.png\"]")
	public WebElement profilebtn;
	
	@FindBy(xpath = "(//ul)/a[8]")
	public WebElement loguotbnt;
	



}
