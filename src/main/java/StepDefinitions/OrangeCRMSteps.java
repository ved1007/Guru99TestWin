package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeCRMSteps {
	WebDriver driver;

	@Given("Guru demo page")
	public void guru_demo_page() {
    
		System.setProperty("webdriver.chrome.driver", "C:/Users/PC User1/Documents/Devops/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/");		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
}

	@Then("Click on Bank Project")
	public void click_on_Bank_Project() {
	driver.findElement(By.xpath("//a[normalize-space()='Bank Project']")). click();
}
	
	@Then("Close the Webpage")
	public void close_the_Webpage() {
	    driver.close();
	
}
	@Given("Guru demo pageTwo")
	public void guru_demo_pageTwo() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PC User1/Documents/Devops/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/");		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
	}
	
	@Then("click on customer name")
	public void click_on_customer_name() {
		driver.findElement(By.xpath("//a[normalize-space()='Bank Project']")). click();
	}

	@Then("Close the WebpageTwo")
	public void close_the_WebpageTwo() {
	    driver.close();
	
}
}