package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayVideoObjectRepo {
	
	WebDriver driver;
	
	public PlayVideoObjectRepo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id=\"app\"]/header/div/div/div/span")
	public WebElement addsbtn;
	
	@FindBy(xpath = "//div[@id=\"app\"]/header/div/nav/div/div/div/div/div/div/div[3]")
	public WebElement resourceHover;
	
	@FindBy(xpath = "//a[@href=\"/case-studies\"]")
	public WebElement caseStudiesCTD ;
	
	@FindBy(xpath = "//a[@href=\"/case-studies/how-raken-helps-manage-large-scale-demolition-projects\"]")
	public WebElement projectVideo;
	
	@FindBy(xpath = "//h3[text()=\"Watch the case study\"]")
	public WebElement  playbtn;
	
	
	
	

}
