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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//If we want to specify browser version, platform and all
public class DemoB {
	public WebDriver driver;
	ExtentReports e = new ExtentReports("./ExtentReports/ExtentReport.html");
	 @Test
	 public void DemoGoogle(XmlTest r) throws MalformedURLException
	 {
		 ExtentTest t1 = e.startTest("DemoGoogle");
		 t1.log(LogStatus.PASS, "Pass");
		 e.endTest(t1);
//		 String browser = r.getParameter("browser");
//		 String url=r.getParameter("url");
//		 Reporter.log(browser, true);
//		 URL rd = new URL(url);
//		 DesiredCapabilities c = new DesiredCapabilities();
//		 c.setBrowserName(browser);
//		 WebDriver driver = new RemoteWebDriver(rd, c);
////		 System.setProperty("webdriver.chrome.driver", "D:/RS1/cd.exe/");
////		 driver = new ChromeDriver();
//		 driver.get("http://www.google.com/");
//		 driver.close();
	 }
	 
	 @Test
	 public void DemoFail(XmlTest r) throws MalformedURLException
	 {
		 ExtentTest t2 = e.startTest("DemoGoogle");
		 t2.log(LogStatus.FAIL, "Fail");
		 e.endTest(t2);
		 e.flush();
//		 String browser = r.getParameter("browser");
//		 String url=r.getParameter("url");
//		 Reporter.log(browser, true);
//		 URL rd = new URL(url);
//		 DesiredCapabilities c = new DesiredCapabilities();
//		 c.setBrowserName(browser);
//		 WebDriver driver = new RemoteWebDriver(rd, c);
////		 System.setProperty("webdriver.chrome.driver", "D:/RS1/cd.exe/");
////		 driver = new ChromeDriver();
//		 driver.get("http://www.google.com/");
//		 driver.close();
	 }
	}
