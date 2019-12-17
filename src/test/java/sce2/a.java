
package sce2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class a{
	static WebDriver driver;
	
@Given("Enter password")
public void enter_password() {
	
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	driver=new ChromeDriver();
  	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	
   
}

@Given("Signin")
public void signin() {
   
}

@When("Search headphone")
public void search_headphone() {
 
}

@When("if the cart is not shown in page")
public void if_the_cart_is_not_shown_in_page() {
   
}

@Then("the test is passed")
public void the_test_is_passed() {
  
}

}