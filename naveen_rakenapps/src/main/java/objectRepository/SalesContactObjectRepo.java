package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesContactObjectRepo 
{
   WebDriver driver;
   
   public SalesContactObjectRepo(WebDriver driver) 
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath = "//div[@id=\"app\"]/header/div/div/div/span")
   public WebElement addsCTK;
   
   @FindBy(xpath = "//a[@href=\"/contact-sales\"]")
   public WebElement contactbtn;
   
   @FindBy(xpath = "//input[@id=\"field-1\"]")
   public WebElement firstname ;
   
   @FindBy(xpath = "//input[@id=\"field-2\"]")
   public WebElement lastname ;
   
   @FindBy(xpath = "//input[@id=\"field-3\"]")
   public WebElement phonenum;
   
   @FindBy(xpath = "//input[@id=\"field-4\"]")
   public WebElement emailid;
   
   @FindBy(xpath = "//input[@id=\"field-5\"]")
   public WebElement companyname;
   
   @FindBy(xpath = "(//button)[3]")
   public WebElement cookies;
   
   @FindBy(xpath = "(//select)[1]")
   public WebElement companyrole;
   
   @FindBy(xpath = "(//select)[2]")
   public WebElement companysize ;
   
   @FindBy(xpath = "//button[@type=\"submit\"]")
   public WebElement submitbtn ;
   
  
   
   
}
