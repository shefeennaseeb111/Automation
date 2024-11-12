package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxnRadiobutton extends Base {
	
	public void checkbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbx=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkbx.click();
		System.out.println(checkbx.isSelected()); 
		
	}
	public void radiobutton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobn=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		radiobn.click();
		
		
	}
	public void enablemessagebox()
	{
		WebElement input=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		input.click();
		WebElement messagenable=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		System.out.println(messagenable.isEnabled());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckboxnRadiobutton chkbox=new CheckboxnRadiobutton();
		chkbox.initialiseBrowser();
		
		chkbox.checkbox();
		chkbox.enablemessagebox();
		chkbox.radiobutton();
		

	}

}
