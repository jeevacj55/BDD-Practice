package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".\\src\\test\\java\\featureFile\\Login.feature",
		glue = "stepDefinitions",
		dryRun = false
		//true -> No browser - feature file and generate step definition methods
		//false -> browser will launched - step definition will execute
		
		
		
		)

public class RunnerIO extends AbstractTestNGCucumberTests {

}
