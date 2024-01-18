package mphasis.FirstCry.testSteps;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\User\\eclipse-workspace\\selenium\\FirstCry1\\Features\\myprofile.feature",
		glue = "mphasis.FirstCry.testSteps"
		)

public class TestRunner extends AbstractTestNGCucumberTests
{
	
}
