package sce4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class third3 {
	
 static WebDriver driver;

@Given("Entering username")
public void entering_username() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	driver=new ChromeDriver();
  	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	 
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	 
	driver.findElement(By.id("userName")).sendKeys("Lalitha");

	Thread.sleep(2000);

}

@Given("Enter password")
public void enter_password() {
	driver.findElement(By.id("password")).sendKeys("Password123");
}

@Given("Signin")
public void signin() {
	driver.findElement(By.xpath("//input[@name='Login']")).click();
}

@When("Search headphone")
public void search_headphone() throws InterruptedException {
	driver.findElement(By.id("myInput")).sendKeys("h");

	Thread.sleep(2000);
	 
	driver.findElement(By.id("myInput")).sendKeys("e");

	Thread.sleep(2000);
	 
	driver.findElement(By.id("myInput")).sendKeys("a");

	Thread.sleep(2000);
	 
	driver.findElement(By.id("myInput")).sendKeys("d");//myInputautocomplete-list
	 
	Thread.sleep(2000);
	 
	driver.findElement(By.id("myInputautocomplete-list")).click();
	 
	driver.findElement(By.xpath("//input[@type='submit']")).submit();

	Thread.sleep(3000);

}

@When("if the cart is not shown in page")
public void if_the_cart_is_not_shown_in_page() throws InterruptedException {

Thread.sleep(5000);
 
Assert.assertNotSame("Cart Checkout", driver.getTitle());


 
driver.quit();

	
}

@Then("the test is passed")
public void the_test_is_passed() {
}

}


