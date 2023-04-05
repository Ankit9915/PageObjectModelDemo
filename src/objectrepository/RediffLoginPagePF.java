package objectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	
	WebDriver driver;
	public  RediffLoginPagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	By username = By.xpath("//*[@id='login1']");
//	By password = By.name("passwd");
//	By sigin=By.name("proceed");
//	By home=By.linkText("rediff.com");
	
	
	//BY USING PAGE FACTORY
	@FindBy(xpath="//*[@id='login1']")
	WebElement username;
	@FindBy(name="passwd")
	WebElement password;
	@FindBy(name="proceed")
	WebElement sigin;
	@FindBy(linkText="rediff.com")
	WebElement home;
	
	public WebElement emailId() {
	return username;
	}
	public WebElement password() {
		return 	password;
		}
	
	public WebElement submit() {
		return sigin;
		}
	
	public WebElement home() {
		return home;
		}

}
