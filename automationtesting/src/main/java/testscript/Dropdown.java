package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base {
	
	public void dropdown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectcolor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		
		//selectcolor.click();
		Select dropdn=new Select(selectcolor);
		//dropdn.selectByVisibleText("Red");
		//dropdn.selectByIndex(2);
		dropdn.selectByValue("Red");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dropdown drpdwn=new Dropdown();
		drpdwn.initialiseBrowser();
		drpdwn.dropdown();

	}

}
