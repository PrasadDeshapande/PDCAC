package CDAC;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pdeshpande\\OneDrive - Rockwell Automation, Inc\\Desktop\\Sele\\geckodriver.exe");
		 WebDriver d= new FirefoxDriver(); 
		 d.get("https://demo.guru99.com/v4/");
		 WebElement we= d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		 Thread.sleep(2000);
		 we.sendKeys("sadsasasa");
		 we.clear();
		 we.sendKeys("2323");
		  String val = we.getAttribute("value");
		  System.out.println(val);
		// we.clear();
		 
			/*
			 * String originalWindow = d.getWindowHandle();
			 * 
			 * d.switchTo().newWindow(WindowType.TAB);
			 * 
			 * d.get("https://www.gmail.com"); d.switchTo().window(originalWindow);
			 */
//org.openqa.selenium.Dimension size = d.manage().window().getSize();
//System.out.println(d.manage().window().getSize());

//d.manage().window().setSize(new Dimension(400,200));
//Thread.sleep(4000);
//Dimension d2=d.manage().window().getSize();
//System.out.println(d2);
//d.manage().window().maximize();
//d.manage().window().minimize();
//d.manage().window().maximize();

		// wd.findElement(By.name("q")).sendKeys("Testing");
	}
}