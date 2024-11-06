package testscript;

public class Navigationcommands extends Base {
	public void navigateCommands()
	{
	driver.navigate().to("https://www.amazon.in/");	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Navigationcommands navigate=new Navigationcommands();
		navigate.initialiseBrowser();
		navigate.navigateCommands();
		
	}

}
