package Cucumber1.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class calcstepdefinition {
	@Given("I enter {int}")
	public void I_enter_50(int num)
	{
		System.out.println("I enter "+num);
	}
	@And("I press {word}")
	public void I_press_add(String symbol)
	{
		System.out.println("I press "+symbol);
	}
    @And("I enter {int} in calc")
    public void I_enter(int num)
    { 
	System.out.println("I enter "+num);
    }
    @When("I press {word} in calc")
    public void I_press_equal(String symbol)
    {
	System.out.println("I press "+symbol);
    }
    @Then("Answer {int} should be shown")
    public void Answer_100_should_be_shown(int num)
    {
    	System.out.println("Answer "+num+" should be shown");
    }
}
