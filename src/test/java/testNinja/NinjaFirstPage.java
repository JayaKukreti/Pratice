package testNinja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NinjaFirstPage {
	WebDriver driver;
	public NinjaFirstPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='btn-group']//span[text()='Currency']")WebElement CurrencyBtn;
	public WebElement CurrencyBtn() {
		return CurrencyBtn;
		
	}
	@FindBy(xpath = "//*[@type='button' and @name='EUR']")WebElement EuroBtn;
	public WebElement EuroBtn() {
		return EuroBtn;
			}
	@FindBy(linkText="Canon EOS 5D")WebElement CanonDsBtn;
	public WebElement CanonDsBtn() {
		return CanonDsBtn;
		
	}
	@FindBy()WebElement IphoneBtn;
	public WebElement IphoneBtn() {
		return IphoneBtn;
			}
	
	
	

}
