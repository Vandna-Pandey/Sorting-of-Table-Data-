package SortTableData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SortTableData {
	WebDriver driver;
	Properties prop;
	
	@Test
	
	public void sortTabData() throws IOException {
		
		FileInputStream fi=new FileInputStream(Constants.sortProp);
		prop= new Properties();
		prop.load(fi);
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.Url);
		
		SortTabDataMethod sort=new SortTabDataMethod(driver, prop);
		sort.lastNameMethod();
		sort.firstNameMethod();
		sort.emailMethod();
		sort.websiteMethod();
		sort.priceMethod();
	}
}
