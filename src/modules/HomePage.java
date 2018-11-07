package modules;

import org.openqa.selenium.WebDriver;

import utils.KeyWords;

public class HomePage {
	WebDriver driver;
	pages.HomePage hp;
	public KeyWords kw;
	utils.ReadXlsFiles excel;
	
	public HomePage(WebDriver driver, KeyWords kw, String sheetNM){
		this.driver = driver;
		this.kw = kw;
		hp = new pages.HomePage(driver);
		excel = new utils.ReadXlsFiles("/Users/VishwanathKota/Desktop/TestTK.xlsx", sheetNM); //  /Users/VishwanathKota/Documents/TC_001.xls
	}

	public void clickSignIn(){
		kw.click(hp.signIn, "Sign In");
	}
	
	public void registeration() throws InterruptedException{
		kw.click(hp.register, "Registeration");
		kw.sleepThread();
		kw.click(hp.title, "Title");
		kw.click(hp.selectTitle, excel.getTestData("Title"), "Title selection");
		kw.enterText(hp.firstName, excel.getTestData("First Name"), "First Name");
		kw.enterText(hp.lastName, excel.getTestData("Last Name"), "Last Name");
		kw.enterText(hp.mobileNumber, excel.getTestData("Mobile Number"), "Mobile Number");
		kw.enterText(hp.email, excel.getTestData("Email"), "Email Address");
		kw.enterText(hp.password, excel.getTestData("Password"), "Password");
		kw.enterText(hp.confirmPassword, excel.getTestData("Confirm password"), "Confirm Password");
		kw.scrollByPixels(0, 800, driver, "Scrolling drown the webpage");
		kw.javaScriptClick(driver, hp.signMeUp, "SignMe up checkbox");
//		kw.click(hp.signMeUp, "SignMe up checkbox");
//		kw.keyboardEnter(hp.signMeUp, "SignMe up checkbox");
//		kw.click(hp.inspireMe, "Inspire Me checkbox");
		kw.javaScriptClick(driver, hp.inspireMe, "Inspire Me checkbox");
//		kw.click(hp.registerSubmit, "Submit Register");
	}
	
	
	
	
	
}
