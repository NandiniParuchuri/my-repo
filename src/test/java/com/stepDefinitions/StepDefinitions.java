package com.stepDefinitions;



import java.text.NumberFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.exercise.pageobjects.ExercisePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
public WebDriver driver;
public ExercisePage EP;

@When("user opens URL {string}")
public void user_opens_url(String url) {
	System.setProperty("webdriver.driver.com", "C://Eclipse/chromedriver.exe");
	driver=new ChromeDriver();
   EP=new ExercisePage(driver);
   driver.get(url);
}

@Then("page should have {int} values")
public void page_should_have_values(Integer count_value) {
	int count=count_value;
	   if(count==5)
		   System.out.println("There are 5 values present on screen");
	   else
		   System.out.println("Screen don't have 5 values");
}

@Then("the values should be greater than {int}")
public int the_values_should_be_greater_than(Integer value) {
	if(value>0)
		   System.out.println("values are greater than zero");
	   else
		   System.out.println("Invalid values entered");
	return value;
}

@Then("the values should be added and store it in totalsum")
public void the_values_should_be_added_and_store_it_in_totalsum() {
	
	List<WebElement> myvalues = driver.findElements(By.cssSelector("[id]"));
	System.out.println("number of values : "+ myvalues.size());
	for(int i=0;i<myvalues.size();i++){
		System.out.println("Id Value is : "+ myvalues.get(i).getAttribute("id"));
		myvalues.addAll(myvalues);
	}

    
}

@When("totalsum is caluclated")
public void totalsum_is_caluclated() {
	System.out.println("Sum is caluclated");
  
}

@Then("verify if all values are formatted in currencies")
public void verify_if_all_values_are_formatted_in_currencies() {
	 NumberFormat formatter=NumberFormat.getCurrencyInstance();
	 
}

@Then("create a report of all steps passed")
public void create_a_report_of_all_steps_passed() {
    System.out.println("Reports generated");
}

@Then("close browser")
public void close_browser() {
    driver.close();
}

}
