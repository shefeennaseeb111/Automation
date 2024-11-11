package testscript;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void idlocater()
	{
		
		
		WebElement messagetext=driver.findElement(By.id("single-input-field"));//webelement is an interface
		WebElement valuea=driver.findElement(By.id("value-a"));
		WebElement valueb=driver.findElement(By.id("value-a"));
		WebElement showmessage=driver.findElement(By.id("button-one"));
		
		//WebElement elementname=driver.findElement(By.locator(locatornameor "attribute vale"));
	}
	public void namelocator()
	{
		WebElement message=driver.findElement(By.name("viewport"));
	}
	public void classlocator()
	{
		WebElement message=driver.findElement(By.className("header-top"));
	}
	public void cssselector()
	{
		//first combination=tag#id
		WebElement css=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement valueacss=driver.findElement(By.cssSelector("button#button-one"));
		//second combination=tag.clas
		WebElement css2=driver.findElement(By.cssSelector("ul.navbar-nav"));
		WebElement css5=driver.findElement(By.cssSelector("button.navbar-toggler"));
		//third combination=tagname[attribute=value]
		WebElement css3=driver.findElement(By.cssSelector("input[id=single-input-field]"));
		//fourth combination=tagname.classname[attribute=value]
		WebElement css4=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
		
	}
	
	public void absolutexpath()
	{
		WebElement message=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	}
	public void relativexpath()
	{
		WebElement mesgrelativexpath=driver.findElement(By.xpath("//input[@placeholder='Message']"));// //tagname[@attributetype='attributevalue']
		WebElement mesgrelativexpath2=driver.findElement(By.xpath("//input[@id='value-a']"));
	}
	public void contains()
	
	{
	WebElement contains1=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
	
		////tagname[contains(@attributetype,'value')]
	}
	public void text()
	{
		WebElement textxpath=driver.findElement(By.xpath("//button[text()='Show Message']"));
		////tagname[text()='value']
	}
	public void axespath()
	{
		////tagnem[@attributetype='value']//parent::tagname
		
		WebElement axespath1=driver.findElement(By.xpath("//input[@placeholder='Message']//parent::div"));
		WebElement axespath2=driver.findElement(By.xpath("//a[@href='index.php']//child::img[@alt='logo']"));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locator=new Locators();
		locator.initialiseBrowser();
		locator.idlocater();
		locator.namelocator();
		locator.classlocator();
		locator.cssselector();
		
		
	}

}
