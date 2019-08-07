package generics;

	import java.io.IOException;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class Generic_class implements Prj_Constant{
		public WebDriver driver;
		static
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
		}
		@BeforeMethod
		public void openappln()
		{
			driver=new FirefoxDriver();
			driver.get("http://edurary.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		@AfterMethod
		public void close_App(ITestResult res ) throws IOException
		{
			
			int status= res.getStatus();
			String tcname=res.getName();
			if(status == 2) {
				Screenshot.getphoto(driver,tcname);
				
				Reporter.log(tcname,true);
				
			}
		
			driver.close();
			
			
		}
		
		

	}



