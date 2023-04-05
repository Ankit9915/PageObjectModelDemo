package objectrepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RediffHomePage {
	
	WebDriver driver;
	public  RediffHomePage(WebDriver driver) {
		this.driver=driver;
	}
	By search=By.id("srchquery_tbox");
	By btn = By.xpath("//div[@class='div_newssearch']//input[@type='submit']");
	
	public WebElement search() {
		return  driver.findElement(search);
	}
	public WebElement clicksrch() {
		return driver.findElement(btn);
	}
	

	
	

}
