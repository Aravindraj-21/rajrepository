package Cucumber1.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"json:src/test/java/Cucumber1.cucumber/git.json"})
public class calcrunnerfile {


	
}

