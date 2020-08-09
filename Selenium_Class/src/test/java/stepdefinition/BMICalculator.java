package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BMICalculator {
	public static WebDriver driver;
	
	
	@Given("^Open the given URL$")
	public void open_the_given_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PinkiSingh\\Documents\\Selenium Project\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
       driver.get("https://www.calculator.net/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}


	@Then("^I validate the title of page$")
	public void i_validate_the_title_of_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Title of page is :" +driver.getTitle());
	   
	}

	@When("^I click on BMI Calculator$")
	public void i_click_on_BMI_Calculator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("BMI Calculator")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}
	
	@Then("^I validate the title of BMICalculator page$")
	public void i_validate_the_title_of_BMICalculator_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Title of page is :" +driver.getTitle());
	   
	}

	
	@When("^I Enter (\\d+), (\\d+), (\\d+)$")
	public void i_Enter(int Age, int Height, int Weight) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("cage")).clear();
		driver.findElement(By.id("cage")).sendKeys(""+Age);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("cheightmeter")).clear();
		driver.findElement(By.id("cheightmeter")).sendKeys(""+Height);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("ckg")).clear();
		driver.findElement(By.id("ckg")).sendKeys(""+Weight);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}
	
	@Then("^I click the on calculate$")
	public void i_click_the_on_calculate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@value='Calculate']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		

	@Then("^I capture the BMI Result value$")
	public void i_capture_the_BMI_Result_value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(driver.findElement(By.xpath("//div[@class='bigtext']")).getText());
		
	}

	@Then("^I Close the browser$")
	public void i_Close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	   
	}



}
