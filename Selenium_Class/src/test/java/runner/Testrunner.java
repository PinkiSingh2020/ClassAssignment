package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
   features="src/test/java/features/",
   glue= {"stepdefinition"},
   tags= {"@RegressionTest"},
   plugin= {"pretty", "html:target/CucumberReport"} 
   )

public class Testrunner {

}
