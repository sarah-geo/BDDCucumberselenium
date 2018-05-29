package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class testingsteps {

	static WebDriver driver;

	@Given("^User is in the home page of github$")
	public void user_is_in_the_home_page_of_github() {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://github.com");

	}

	@Given("^User enters an already existing account$")
	public void user_enters_an_already_existing_account() {
		driver.findElement(By.id("user[login]")).sendKeys("sarah-geo");
		driver.findElement(By.id("user[email]")).sendKeys("xxxxx.com");
		driver.findElement(By.id("user[password]")).sendKeys("xxxxx");

	}

	@Given("^clicks on signup button$")
	public void clicks_on_signup_button() {
		driver.findElement(By.xpath("//button[text()='Sign up for GitHub']")).click();
	}

	@Then("^User should be given a message that login is already taken$")
	public void user_should_be_given_a_message_that_username_is_already_taken() {
		String result = driver.findElement(By.xpath("//dd[@class = 'error']")).getText();
		System.out.println(result);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Login is already taken", result);
		System.out.println("test completed successfully");
		sa.assertAll();
	}

}
