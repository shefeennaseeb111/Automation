package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initialiseBrowser()
	{
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/index.php");//for open the web page
	driver.manage().window().maximize();//to maximise the window or webpage
	}
	public void quitClose()
	{
		driver.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base o=new Base();
		o.initialiseBrowser();
		o.quitClose();//multiple windows close(page linked with another pages,then all are closed)
		
	}

}
