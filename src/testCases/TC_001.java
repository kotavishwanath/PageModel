package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class TC_001 {
	public static WebDriver driver;
	public utils.KeyWords kw;
	
	@BeforeClass
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "/Users/VishwanathKota/Documents/WorkSpace/chromedriver");
		driver = new ChromeDriver();
		kw = new utils.KeyWords();
	}
	
	@Test
	public void testCase() throws InterruptedException{
		/*
		System.out.println(this.toString());
		System.out.println(this.getClass().getName()); 
		String[] classname = this.getClass().getName().split("\\.");
		System.out.println(classname[1]);
		*/
		
		String sheetName = this.getClass().getName().split("\\.")[1];
//		utils.ReadXlsFiles
		
		modules.HomePage hp = new modules.HomePage(driver, kw, sheetName);
		
		driver.get("https://www.tkmaxx.com/uk/en/");
		
//		pages.HomePage hp = new pages.HomePage(driver, kw);
//		hp.clickSignIn();
//		kw.click(hp.signIn, "Sign In");
		
		hp.clickSignIn();
		hp.registeration();
	}
	
	/*
	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}
*/
	
}
