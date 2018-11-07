package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(how = How.XPATH,using="//*[@id='miniCartSlot']/ul/li[3]/a/span")
	public WebElement signIn;
	
	@FindBy(how = How.XPATH,using="//h3[text()='Register']")
	public WebElement register;
	
	@FindBy(how = How.XPATH,using="//span[@class='label']")
//	@FindBy(how = How.XPATH,using="//*[@id='tjxRegisterForm']/div[1]/div/div/div/div/div[2]/span")
	public WebElement title;
	
//	@FindBy(how = How.XPATH,using="//li[contains(text(),'Mr.')]")
	@FindBy(how = How.XPATH,using="//div[@class='selectric-scroll']/ul/li")
	public List<WebElement> selectTitle;
	

	@FindBy(how = How.XPATH,using="//input[@id='registerFirstName']")
	public WebElement firstName;
	
	@FindBy(how = How.XPATH,using="//input[@id='registerLastName']")
	public WebElement lastName;
	
	@FindBy(how = How.XPATH,using="//input[@id='registerMobileNumber']")
	public WebElement mobileNumber;
	
	@FindBy(how = How.XPATH,using="//input[@id='registerEmail']")
	public WebElement email;

	@FindBy(how = How.XPATH,using="//input[@id='registerPassword']")
	public WebElement password;
	
	@FindBy(how = How.XPATH,using="//input[@id='checkPwd']")
	public WebElement confirmPassword;
	
//	@FindBy(how = How.XPATH,using="//label[@class='control-label'][@for='tkmaxxPreferences']")
//	@FindBy(how = How.XPATH,using="//label[@for='tkmaxxPreferences']/input[@name='_tkmaxxPreferences']")
	@FindBy(how = How.ID,using="tkmaxxPreferences")
	public WebElement signMeUp;
	
//	@FindBy(how = How.XPATH,using="//label[@class='control-label'][@for='homesensePreferences']")
	@FindBy(how = How.ID,using="homesensePreferences")
	public WebElement inspireMe;
	
	@FindBy(how = How.XPATH,using="//button[text()='Register']")
	public WebElement registerSubmit;
	
	
	
//	@FindBy(how = How.ID,using=".//*[@id='miniCartSlot']/ul/li[3]/a/span")
//	public WebElement logout;
	
//	public void clickSignIn(){
//		try {
//			signIn.click();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			System.out.println("exception catched"+this.toString()); 
//		}
//	}
//	
}
