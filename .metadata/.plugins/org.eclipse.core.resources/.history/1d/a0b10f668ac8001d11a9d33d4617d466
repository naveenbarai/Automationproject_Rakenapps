package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YDownload {
	
	WebDriver driver;
	
	public YDownload(WebDriver driver) {
		this.driver=driver;
	    PageFactory.initElements(driver, this);
		}
     @FindBy(xpath = "//div[@id=\"app\"]/header/div/div/div/span")
     public WebElement addsbtn1;
     
	@FindBy(xpath = "//div[@id=\"app\"]/header/div/nav/div/div/div/div/div/div/div[3]")
	public WebElement resourceHover1 ;
	
	@FindBy(xpath = "(//a[@href=\"/ebooks\"])[1]")
	public WebElement Ebook ;
	
	@FindBy(xpath = "(//div[@class=\"c-card__body\"])[1]")
	public WebElement  cardCTD;
	
	@FindBy(xpath = "//a[contains(text(),\" Download a Copy\")]")
	public WebElement downloadcopy;
	
}
