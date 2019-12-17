package sce3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class third {
WebDriver driver;

@Given("User navigates to URL")
public void user_navigates_to_URL() {
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	driver=new ChromeDriver();
  	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
}

@Given("click signin")
public void click_signin() {
	driver.findElement(By.linkText("SignIn")).click();
}

@Given("user enters {string} and {string}")
public void user_enters_and(String string, String string2) {
	driver.findElement(By.id("userName")).sendKeys("lalitha");
  	driver.findElement(By.id("password")).sendKeys("Password123");
}

@Given("click login")
public void click_login() {
	driver.findElement(By.name("Login")).click();
}

@Given("Enter head in search")
public void enter_head_in_search() throws InterruptedException {
	driver.findElement(By.id("myInput")).sendKeys("h");

	Thread.sleep(2000);
	 
	driver.findElement(By.id("myInput")).sendKeys("e");

	Thread.sleep(2000);
	 
	driver.findElement(By.id("myInput")).sendKeys("a");

	Thread.sleep(2000);
	 
	driver.findElement(By.id("myInput")).sendKeys("d");//myInputautocomplete-list
	 
	Thread.sleep(2000);
	 
	driver.findElement(By.id("myInputautocomplete-list")).click();

	

}

@Given("find details")
public void find_details() {
	driver.findElement(By.xpath("//input[@type='submit']")).submit();
}

@Given("add to cart")
public void add_to_cart() {
	driver.findElement(By.linkText("Add to cart")).click();
}

@Given("click cart")
public void click_cart() {
	driver.findElement(By.cssSelector("i[class='fa fa-shopping-cart']")).click();
}

@Then("checkout")
public void checkout() {
	driver.findElement(By.linkText("Checkout")).click();
	Assert.assertEquals("Cart Checkout", driver.getTitle());
}


}
