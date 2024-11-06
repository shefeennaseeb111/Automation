package testscript;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void idlocater()
	{
		
		
		WebElement messagetext=driver.findElement(By.id("single-input-field"));
		WebElement valuea=driver.findElement(By.id("value-a"));
		WebElement valueb=driver.findElement(By.id("value-a"));
		
		//WebElement elementname=driver.findElement(By.locator(locatornameor "attribute vale"));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locator=new Locators();
		locator.initialiseBrowser();
		locator.idlocater();
		
	}

}
