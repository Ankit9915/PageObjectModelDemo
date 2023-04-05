package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import objectrepository.RediffHomePagePF;
import objectrepository.RediffLoginPagePF;

public class LoginApplication {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		// to resolve the chrome version error
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeoption);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
		RediffLoginPagePF rd=new RediffLoginPagePF(driver);
		rd.emailId().sendKeys("hello");
		rd.password().sendKeys("bye");
		rd.submit().click();
		rd.home().click();
		RediffHomePagePF hp=new RediffHomePagePF(driver);
		hp.search().sendKeys("ipl2023");
		hp.clicksrch().click();
		hp.table().click();
		hp.tableTopper();
		
	}
	
}
