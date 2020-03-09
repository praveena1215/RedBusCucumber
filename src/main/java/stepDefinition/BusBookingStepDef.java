package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BusBookingStepDef {

	public RemoteWebDriver driver;
	

	@Given("^launch the browser \"([^\"]*)\"$")
	public void launch_the_browser(String url) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	@Then("^enter the destination From \"([^\"]*)\"$")
	public void enter_the_destination_From(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='src']")).click();
		driver.findElementByXPath("//input[@id='src']").sendKeys(Keys.TAB);

	}

//	@Then("^enter the destination TO \"([^\"]*)\"$")
//	public void enter_the_destination_TO(String arg1) throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys(arg1);
//		driver.findElementByXPath("//input[@id='dest']").sendKeys(Keys.TAB);
//
//	}
//
//	@Then("^select the onward date$")
//	public void select_the_onward_date() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
//		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[5]")).click();
//	}
//
//	@Then("^click on search button to list the buses$")
//	public void click_on_search_button_to_list_the_buses() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
////	    WebElement click = driver.findElementByXPath("//button[text()='Search Buses']");
////		Actions obj = new Actions(driver);
////		obj.moveToElement(click).perform();
//	   
//		
//		
//	}

}
