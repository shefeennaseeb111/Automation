package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Inputmethodfield extends Base {
	public void getMessage()
	{
		
		WebElement input=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		input.click();
		WebElement getmessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		getmessage.sendKeys("Welcome");
		WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessage.click();
		WebElement valuea=driver.findElement(By.xpath("//input[@id='value-a']"));
		valuea.sendKeys("40");
		WebElement valueb=driver.findElement(By.xpath("//input[@id='value-b']"));
		valueb.sendKeys("30");
		WebElement total=driver.findElement(By.xpath("//button[@id='button-two']"));
		total.click();		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inputmethodfield inputmethode=new Inputmethodfield();
		inputmethode.initialiseBrowser();
		inputmethode.getMessage();
		

	}

}
