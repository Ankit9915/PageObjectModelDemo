package objectrepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RediffHomePagePF {
	
	WebDriver driver;
	public  RediffHomePagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//By search=By.id("srchquery_tbox");
//	By btn = By.xpath("//div[@class='div_newssearch']//input[@type='submit']");
	
	//BY USING PAGE FACTORY
	
	@FindBy(id="srchquery_tbox")
	WebElement search;
	@FindBy(xpath="//div[@class='div_newssearch']//input[@type='submit']")
	WebElement btn;
	//Adding somemore functionalty
	@FindBy(xpath="//a//h4[text()='Points Table: IPL 2023']")
	WebElement table;
	@FindBy(xpath="//div[@class='bigtable']//following-sibling::tr/td/span")
	WebElement topper;
	
	public WebElement search() {
		return  search;
	}
	public WebElement clicksrch() {
		return btn;
	}
	public WebElement table() {
		return table;
	}
	public void tableTopper() {
		System.out.println(topper.getText());
	}
	

	
	

}
