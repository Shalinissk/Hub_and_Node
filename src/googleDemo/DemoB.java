package googleDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;
//If we want to specify browser version, platform and all
public class DemoB {
	public WebDriver driver;
	 @Test
	 public void DemoGoogle(XmlTest t) throws MalformedURLException
	 {
		 String browser = t.getParameter("browser");
		 String url=t.getParameter("url");
		 Reporter.log(browser, true);
		 URL rd = new URL(url);
		 DesiredCapabilities c = new DesiredCapabilities();
		 c.setBrowserName(browser);
		 WebDriver driver = new RemoteWebDriver(rd, c);
//		 System.setProperty("webdriver.chrome.driver", "D:/RS1/cd.exe/");
//		 driver = new ChromeDriver();
		 driver.get("http://www.google.com/");
		 driver.close();
	 }
	}
