package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlightBookingModel extends PageObjectBase {

	public FlightBookingModel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//finding element for fromCityInputBox
	@FindBy(how=How.XPATH, using="//input[@data-cy='fromCity']")
	WebElement fromCityInputBox;
	
		
	//finding element for toCityInputBox
	@FindBy(how=How.XPATH, using="//input[@id='toCity']")
	WebElement toCityInputBox;
	
	//finding element for search button
	@FindBy(how=How.XPATH, using="//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	WebElement searchButton;

	public void enterFromCity() throws InterruptedException
	{
		fromCityInputBox.sendKeys(Constants.fromCity);
		Thread.sleep(5000);
		WebElement puneCityAutoSuggestlist=driver.findElement(By.id("react-autowhatever-1-section-0-item-0"));
		Actions actions = new Actions(driver);
		actions.moveToElement(puneCityAutoSuggestlist).click().build().perform();
	}
	public void enterToCity() throws InterruptedException
	{
		toCityInputBox.sendKeys(Constants.toCity);
		Thread.sleep(5000);
	}
	public void clickOnSubmitButton()
	{
		searchButton.click();
	}
}