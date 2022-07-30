package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			// make sure when we type classpath:feature, all letters are lower case 
			
			features = "classpath:feature",
			glue = "step.definition",
			tags = "@smokeTest",
			dryRun = false,
			strict = true,
			monochrome = true,
			plugin = {
					"pretty",
					"html:target/site/cucumber-pretty",
					"json:target/cucumber.json"
			},
			// if we set this in false, it will not generate report for us
			publish = true
			
			)
	
        public class TestRunner {
		
		@AfterClass
		public static void generateConfig() {
			CucumberReportingConfig.reportConfig();
			
		}
		
	}	
		




