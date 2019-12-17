package sce2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class third {
	WebDriver driver;
	@Given("User navigates to URL")
	public void user_navigates_to_URL() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
	  	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	      // Write code here that turns the phrase above into concrete actions
	      //throw new cucumber.api.PendingException();
	  }

	  @And("click signin")
	  public void click_signin() {
	  	driver.findElement(By.linkText("SignIn")).click();
	      // Write code here that turns the phrase above into concrete action
	     // throw new cucumber.api.PendingException();
	  }

	  @And("user enters {string} and {string}")
	  public void user_enters_and(String lalitha, String Password123) {
	  	driver.findElement(By.id("userName")).sendKeys(lalitha);
	  	driver.findElement(By.id("password")).sendKeys(Password123);
	  	
	      // Write code here that turns the phrase above into concrete action
	     // throw new cucumber.api.PendingException();
	  }

	  @And("click login")
	  public void click_login() {
	  	driver.findElement(By.name("Login")).click();
	      // Write code here that turns the phrase above into concrete actions
	      //throw new cucumber.api.PendingException();
	  }

	  @Then("welcome to the page")
	  public void welcome_to_the_page() {
	  	System.out.println("Welcome page");
	      // Write code here that turns the phrase above into concrete actions
	     // throw new cucumber.api.PendingException();
	  }
  
}
