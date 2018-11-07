package utils;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class KeyWords {
	public void click(WebElement ele, String info){
		try {
			ele.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failed to click on "+info);
		}
	}
	
	public void click(List<WebElement> ele, String str, String info){
		try {
			for (int i=0;i<=ele.size();i++){
				if (ele.get(i).getText().equalsIgnoreCase(str)){
					ele.get(i).click();
					break;
				}
			}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failed to click on "+info);
		}
	}
	
	public void enterText(WebElement ele, String sendText, String info){
		try{
			ele.sendKeys(sendText);
		} catch (Exception e) {
			System.out.println("Failed to enter text "+info);
		}
	}
	
	public void sleepThread() throws InterruptedException{
		System.out.println("Sleep method is called");
		Thread.sleep(2000);
	}
	
	public void scrollByPixels(int x, int y, WebDriver driver,String info){
		try{
			System.out.println("x Position "+x+" Y position "+y);
			JavascriptExecutor js = (JavascriptExecutor) driver;
	//		driver.manage().window().maximize();
			js.executeScript("window.scrollBy("+x+","+y+")");
		} catch (Exception e) {
			System.out.println("Failed to Scroll "+info);
		}
	}
	
	public void keyboardEnter(WebElement ele, String info){
		try{
			ele.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to enter text "+info);
		}
	} 
	
	public void javaScriptClick(WebDriver driver, WebElement ele, String info){
		try{
			JavascriptExecutor js = (JavascriptExecutor) driver;
	//		driver.manage().window().maximize();
			js.executeScript("arguments[0].click();", ele);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to Click "+info);
		}
	}

}
