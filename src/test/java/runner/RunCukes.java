package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Spandana on 01/14/2018.
 */

@CucumberOptions(features = {"src/test/resources/features"} ,
				 monochrome = true,
				 glue = "steps",
				 //tags = "@forgotPassword",
				 plugin= {"pretty",
					        "html:target/site/cucumber-report-html",
					        "json:target/cucumber.json",
					        "pretty:target/cucumber-pretty.txt",
					        "usage:target/cucumber-usage.json" })

public class RunCukes extends AbstractTestNGCucumberTests{

}
