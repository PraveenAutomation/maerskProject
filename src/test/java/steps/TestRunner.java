package steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue = {"steps"},
	monochrome = true,
	plugin = {"pretty","junit:target\\JunitReport\\junitReport.xml"
			,"json:target\\jsonReport\\jsonReport.json","html:target\\htmlReport\\htmlReport.html"}
	)
public class TestRunner {
	

}
