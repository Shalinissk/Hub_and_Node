package googleDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

//If we want to specify simply browser specify this code
public class GoogleDemo 
{
	public WebDriver driver;
 @Test
 public void DemoGoogle() throws MalformedURLException
 {
	 URL remoteaddress = new URL("http://10.10.4.61:4444/wd/hub");
	 DesiredCapabilities dc=new DesiredCapabilities();
	 dc.setBrowserName("firefox");
	 dc.setVersion("47");
	 //dc.setPlatform(Platform.WINDOWS);
	 WebDriver driver = new RemoteWebDriver(remoteaddress,DesiredCapabilities.firefox());
//	 WebDriver driver = new FirefoxDriver();
	 
	 System.setProperty("webdriver.chrome.driver", "D:/RS1/cd.exe/");
	 driver = new ChromeDriver();
	 driver.get("http://www.google.com/");
//	 driver.close();
 }
}
