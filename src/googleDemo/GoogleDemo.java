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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//If we want to specify simply browser specify this code
public class GoogleDemo 
{
	public WebDriver driver;
	ExtentReports e = new ExtentReports("./ExtentReports/ExtentReport.html");
 @Test
 public void DemoA() throws MalformedURLException
 {
	 
	 ExtentTest t = e.startTest("DemoGoogle");
	 t.log(LogStatus.PASS, "Hi!!!!!!!!!");
	 e.endTest(t);
	 //e.flush();
//	 URL remoteaddress = new URL("http://10.10.4.61:4444/wd/hub");
//	 DesiredCapabilities dc=new DesiredCapabilities();
//	 dc.setBrowserName("firefox");
//	 dc.setVersion("46");
//	 //dc.setPlatform(Platform.WINDOWS);
//	 WebDriver driver = new RemoteWebDriver(remoteaddress,DesiredCapabilities.firefox());
//	 WebDriver driver = new FirefoxDriver();
	 
//	 System.setProperty("webdriver.chrome.driver", "D:/RS1/cd.exe/");
//	 driver = new ChromeDriver();
//	 driver.get("http://www.google.com/");
//	 driver.close();
 }
 
 @Test
 public void DemoB() throws MalformedURLException
 {
	 ExtentTest t = e.startTest("DemoFail");
	 t.log(LogStatus.FAIL, "Failed");
	 e.endTest(t);
	 e.flush();
//	 URL remoteaddress = new URL("http://10.10.4.61:4444/wd/hub");
//	 DesiredCapabilities dc=new DesiredCapabilities();
//	 dc.setBrowserName("firefox");
//	 dc.setVersion("46");
//	 //dc.setPlatform(Platform.WINDOWS);
//	 WebDriver driver = new RemoteWebDriver(remoteaddress,DesiredCapabilities.firefox());
////	 WebDriver driver = new FirefoxDriver();
	 
//	 System.setProperty("webdriver.chrome.driver", "D:/RS1/cd.exe/");
//	 driver = new ChromeDriver();
//	 driver.get("http://www.google.com/");
//	 driver.close();
 }
}
