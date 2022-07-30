package step.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Utils;

public class Initializer extends Base {
	

	//In Initializer class we will write or define our beforeHooks and afterHooks method and they are
		//both coming from io.cucumber
		
		//@Before = when we add the @Before annotations on top of our beforeHooks method, this method will
		//run before every scenario
		//cucumber Before and After hooks
		@Before
		public void beforeHooks(Scenario scenario) {
			//we used the logger to log when the scenario started
			logger.info("Scenario " + scenario.getName() + " started");
			//the method are coming from base class
			//browser() will get the browser
			browser();
			//openBrowser() will launch the url for us and launch the browser
			openBrowser();
			Utils.verify = scenario;
			
		}
		
		@After
		public void afterHooks(Scenario scenario) {
			
			Utils.takeScreenshotWithFileUtils();
			
				tearDown();
				logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
			}
		}
		

