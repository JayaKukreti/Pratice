package testNinja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CanonDs {
	WebDriver driver;
	public CanonDs(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy()WebElement CanonDsBtn;
	public WebElement CanonDsBtn() {
		return CanonDsBtn;
		
	}
}
