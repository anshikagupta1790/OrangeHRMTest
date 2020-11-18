package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static constants.Constant.*;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver=null;
	//public static Logger _logger= Logger.getLogger(BaseClass.class);
	
	public BaseClass() {
		prop = new Properties();
		try {
			FileInputStream fp = new FileInputStream(PROPERTY_PATH);
			
			prop.load(fp);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
	}
	
	
	public static void initialization()
	{
		String browser_name=prop.getProperty(BROWSER);
		if(DRIVER_NAME.equals(browser_name))
		{
			String os = System.getProperty("os.name").toLowerCase();
			System.err.println("operating system name: "+os);
			if (OPERATING_SYSTEM_NAME.equalsIgnoreCase(os)) {
				System.setProperty(DRIVER_PROP,
						System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver/chromedriver");
			}
			else {
				System.setProperty(DRIVER_PROP,
						System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver/chromedriver.exe");
			}
			driver= new ChromeDriver();
			
		}
		
		driver.get(prop.getProperty(URL));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty(PAGE_TIMEOUT)),TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty(IMPLICIT_TIMEOUT)),TimeUnit.SECONDS);
	}
	
}



