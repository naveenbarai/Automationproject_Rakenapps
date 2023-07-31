package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolutionObjectRepo {
	WebDriver driver;
	
	public SolutionObjectRepo( WebDriver driver)
	{
		   this.driver=driver;
		  PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[@id=\"app\"]/header/div/nav/div/div/div/div/div/div[2]/div[2]")
	public WebElement solutionhover;
	
	@FindBy(xpath = "//a[@href=\"/general-contractors\"]")
	public WebElement generalclick;
	
	@FindBy(xpath = "//main[@class=\"main\"]/section[1]/div/p[2]/a")
	public WebElement scheduledemo;
	
	@FindBy(xpath = " //input[@type=\"email\"]")
	public WebElement emailenter;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement nextbnt;
	
	@FindBy(xpath = "//input[@id=\"field-2\"]")
	public WebElement firstname;
	
	@FindBy(xpath = "//input[@id=\"field-3\"]")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[@id=\"field-4\"]")
	public WebElement companyname ;
	
	@FindBy(xpath = " (//select)[1]")
	public WebElement companyrole;
	
	@FindBy(xpath = " (//select)[2]")
	public WebElement companysize ;
	
	@FindBy(xpath = " //div[@class=\"vti__dropdown\"]")
	public WebElement countrycode;
	
	@FindBy(xpath = "//ul[@class=\"vti__dropdown-list above\"]/li[103]")
	public WebElement countryindia;
	
	@FindBy(xpath = " //input[@class=\"vti__input\"]")
	public WebElement phonenum;
	
	@FindBy(xpath = "//button[@id=\"btnSubmit\"]")
	public WebElement submitbtn ;
	
}
	 

	
	


