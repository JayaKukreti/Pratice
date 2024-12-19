package mainNinja;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import testNinja.CanonDs;
import testNinja.NinjaFirstPage;

public class NinjaTutorial {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		NinjaFirstPage FirstPage = new NinjaFirstPage(driver);
		FirstPage.CurrencyBtn().click();
		FirstPage.EuroBtn().click();
		FirstPage.CanonDsBtn().click();
		//CanonDs Canon = new CanonDs(driver);
		//Canon.CanonDsBtn().click();
		
		

	}

}
