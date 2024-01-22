package BaseLayer;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	//changes in base class
	public BaseClass()  
	{
		File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\ConfigurationLayer\\Config.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			  prop=new Properties();
			prop.load(fis);
			} 
			
		 catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initiliazation()
	{
		  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		String url=prop.getProperty("URL");
		driver.get(url);
	}
}
