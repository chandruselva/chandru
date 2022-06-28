package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepdefinition {
	WebDriver driver;
	@Given("User is on homepage")
	public void user_is_on_homepage() {
	
		
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://retailm1.upskills.in/admin/");
	
	}

	@When("user enter invalid Username {string} and password {string}")
	public void user_enter_invalid_Username_and_password(String string, String string2) {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
	}

	@When("user click on Submit button")
	public void user_click_on_Submit_button() {
		 driver.findElement(By.className("btn")).click();
	     
	     
	}

	@When("user navigate ot orders")
	public void user_navigate_ot_orders() {
		 driver.findElement(By.id("button-menu")).click();
	      driver.findElement(By.id("menu-sale")).click();  
	      driver.findElement(By.xpath("//a[text()='Orders']")).click();
	}

	@When("click add icon button")
	public void click_add_icon_button() {
		 driver.findElement(By.xpath("//a[@data-original-title='Add New']")).click();
	}

	@When("User enter valid Message")
	public void user_enter_valid_Message() {
		 driver.findElement(By.name("firstname")).sendKeys("chandru");
	      driver.findElement(By.name("lastname")).sendKeys("chandru");
	      driver.findElement(By.name("email")).sendKeys("chandru123@gmail.com");
	      driver.findElement(By.name("telephone")).sendKeys("1234567890");
	      driver.findElement(By.xpath("//button[@id='button-customer']")).click();
	}


}