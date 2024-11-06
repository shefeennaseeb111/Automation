package testscript;

public class Browsercommands extends Base {
	public void browsercommands()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);//for get the url of the currentpage
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);//get the source code
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browsercommands browser=new Browsercommands();
		browser.initialiseBrowser();
		browser.browsercommands();
	}

}
