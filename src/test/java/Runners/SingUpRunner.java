package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features", 
glue= {"SignupStepDefinitions2"},
monochrome = true,
plugin = {"pretty", "junit:target/JunitReports/login_report.xml",
		"json:target/JSONReports/login_report.json",
		"html:target/HtmlReports/login_report.html"
}
		)
public class SingUpRunner {

}
