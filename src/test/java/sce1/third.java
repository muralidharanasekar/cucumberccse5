package sce1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class third {
 WebDriver driver;
@Given("Enter the URL")
public void enter_the_URL() {
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	driver=new ChromeDriver();
  	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	
}

@And("click signup")
public void click_signup() {
	driver.findElement(By.linkText("SignUp")).click();
}

@And("Enter username{string}")
public void enter_username(String string) {
	driver.findElement(By.id("userName")).sendKeys(string);
}

@And("Enter firstname{string}")
public void enter_firstname(String string) {
	driver.findElement(By.id("firstName")).sendKeys(string);
}

@And("Enter lastname{string}")
public void enter_lastname(String string) {
	driver.findElement(By.id("lastName")).sendKeys(string);
}

@And("Enter password{string}")
public void enter_password(String string) {
	driver.findElement(By.id("password")).sendKeys(string);
}

@And("Confirm password{string}")
public void confirm_password(String string) {
	driver.findElement(By.id("pass_confirmation")).sendKeys(string);
}

@And("gender as {string}")
public void gender_as(String string) {
	driver.findElement(By.xpath("//input[@value='Male']")).click();
}

@And("email{string}")
public void email(String string) {
	driver.findElement(By.id("emailAddress")).sendKeys(string);
}

@And("mobileno {string}")
public void mobileno(String string) {
	driver.findElement(By.id("mobileNumber")).sendKeys(string);

}

@And("dob{string}")
public void dob(String string) {
	driver.findElement(By.name("dob")).sendKeys(string);
}

@And("address{string}")
public void address(String string) {
	driver.findElement(By.id("address")).sendKeys(string);
}

@And("security question")
public void security_question() {
	driver.findElement(By.cssSelector("option[value='411012']")).click();
}

@And("answer{string}")
public void answer(String string) {
	driver.findElement(By.name("answer")).sendKeys(string);
}

@When("click register")
public void click_register() {
	driver.findElement(By.name("Submit")).click();
	Assert.assertEquals("Login",driver.getTitle());
	driver.quit();
}


}
