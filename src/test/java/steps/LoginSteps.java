package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LoginSteps {

    WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        driver.get("https://the-internet.herokuapp.com/login");
    }
    @And("User enters valid username")
    public void user_enters_valid_username() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
    }
    @And("User enters valid password")
    public void user_enters_valid_password() {
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    }
    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        driver.findElement(By.cssSelector(".fa")).click();
    }
    @Then("User should be taken to the welcome page")
    public void user_should_be_taken_to_the_welcome_page() {
        Assert.assertTrue(driver.findElement(By.cssSelector(".icon-2x")).isDisplayed());
    }




}
