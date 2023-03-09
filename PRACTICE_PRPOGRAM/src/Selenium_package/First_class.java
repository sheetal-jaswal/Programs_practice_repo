package Selenium_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.ConnectionFailedException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriverManager.chromedriver().browserVersion("111.0.5563.64").setup();

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		//options.addArguments("--headless");

		options.addArguments("--disable-notifications");

		options.addArguments("--disable-gpu");

		options.addArguments("--disable-extensions");

		options.addArguments("--no-sandbox");

		options.addArguments("--disable-dev-shm-usage");

		options.addArguments("--remote-allow-origins=*");  // this i added  this and it worked, Thanks a ton  xinchao zhang !! 

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		options.merge(capabilities);

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.javatpoint.com/fibonacci-series-in-java");

		driver.manage().window().maximize();

	}

}
