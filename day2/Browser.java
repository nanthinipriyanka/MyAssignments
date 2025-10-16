package week1.day2;

public class Browser {

	public String launchbrowser (String browserName) 
	{
		
System.out.println("The best browser to launch application is" +" "+browserName);
return browserName;
	}
public String loadUrl()
{
	String loadStatus="Url loaded successfully";
	return loadStatus;
	
}
public static void main (String[] args) 
{
	
	Browser Brow=new Browser();
	Brow.launchbrowser("Edge");
	String status=Brow.loadUrl();
	System.out.println(status);
}
}

