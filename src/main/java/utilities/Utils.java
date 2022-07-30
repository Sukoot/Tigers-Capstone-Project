package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import io.cucumber.java.Scenario;

public class Utils extends Base {
	
	

	public static Scenario verify;
	
	public static void hoverMouseOverElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public static String getTextFromUI(WebElement element) {
		String textFromUI = element.getText();
		return textFromUI;
	}
	/**
	 * 
     *this method is click on radio button
	*/
	public static void clickOnRadioButton(WebElement element) {
		try {
		if(element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
		element.click();
		}else {
		System.out.println("One of the conditions did not return expected velue");
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
     // this method is click on check box button.

public static void clickOnCheckBoxButton(WebElement element) {
	try {
	if(element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
	element.click();
	}else {
	System.out.println("One of the conditions did not return expected velue");
	}
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
    //  methods for taking screenshot with date . we should call it in Initializer afterhoock and it take screenshot
    // at end of each scenarios.
   public static String screenshotName() {
	   Date date = new Date();
	   String screenShot = date.toString().replace(":", "_").replace(" ", "_");
	   return screenShot;
   }
   public static void takeScreenshotWithFileUtils () {
	   File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   try {
		  FileUtils.copyFile(file, new File(".\\output\\screenshots\\"+screenshotName()+".png")); 
	   }catch (IOException e) {
		   e.printStackTrace();
	   }
   }
 

    //  method that take screenshot for specific steps.
   
       public static void takeScreenshotsForSteps() {
	   final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	   verify.attach(screenshot, "image/png", "Step Screenshot");
	   
        }


	/* JSExecutor methods start
	 *.click()
	* if the .click() does not work, then we get the help JSExecuter
	*/
	public static void clickWithJSE(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", element);
	}


	// how to sendkeys with JSExecutor
	public static void sendKeysWithJSE(WebElement element, String value) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].value='" + value + "'", element);
	}



	/**
	* This method will select the value from static Dropdown by visible value
	*/
	public static void selectByVisibleText(WebElement element, String text) {
	Select select = new Select(element);
	select.selectByVisibleText(text);
	}

	/**
	* This method will select value from static Dropdown by index
	*/
	public static void selectByIndex(WebElement element, int index) {
	Select select = new Select(element);
	select.selectByIndex(index);
	}

	/**
	* This method will select value from static dropdown by value
	*/
	public static void selectByValue(WebElement element, String value) {
	Select select = new Select(element);
	select.selectByValue(value);
	}

	/**
	* This method accepts alerts
	*/
	public static void acceptAlert() {
	driver.switchTo().alert().accept();
	}

	public static void dismissAlert() {
	driver.switchTo().alert().dismiss();
	}

	/**
	* This method will switch webdriver from parent window to child
	*/
	public static void switchToWindow() {
	Set<String> WindowsHandles = driver.getWindowHandles();
	Iterator<String> it = WindowsHandles.iterator();
	String window = it.next();
	driver.switchTo().window(window);
	}

	/**
	* This method will return text of element
	*/
	public static String getText(WebElement ele) {
	String ElementText = ele.getText();
	return ElementText;
	}

	/**
	* This method will drag and drop using Actions class
	*/
	public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
	Actions action = new Actions(driver);
	action.dragAndDrop(sourceElement, targetElement).perform();

	}

   
 //read test data from testData.properties file
   // once we make the method here, we can make (testData.properties) under input folder save our emails and passwords or any other data
   // then go to StepDefinition class(in here stepLogin) call the metods under email and pass.
   public static String getData(String key) {
   String testDataPath = ".\\src\\test\\resources\\input\\testData.properties";
   Properties property = null;
   try {
   FileReader reader = new FileReader(testDataPath);
   property = new Properties();
   property.load(reader);
   } catch (FileNotFoundException e) {
   e.printStackTrace();
   } catch (IOException e) {
   e.printStackTrace();
   }
   return property.getProperty(key);
  
	   
   }
   public static void hardWait() {
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	} 
   }
   
   

}


