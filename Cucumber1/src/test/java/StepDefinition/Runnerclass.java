package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/vigneswara.reddy/eclipse-workspace/Reddy/Cucumber1/src/test/resources/Features",glue={"StepDefinition"},monochrome=true,
plugin={"pretty","junit:target/JUnitReports/report.junit"})
public class Runnerclass {

}
