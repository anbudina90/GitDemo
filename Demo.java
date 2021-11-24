import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Driver Object for Chrome Browser
			/* Class name = ChromeDriver,
				
			Class x
				x driver=new x(); */
		// invoke .exe file for Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
			
		
		
	}

}
