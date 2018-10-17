import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class actualUIAutomation extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		AndroidDriver<AndroidElement>driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Click on Hindi icon(using X path)
		
		/*
		 * xpath syntax
		 * tagname = class name
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Hindi']").click();
		
		//Select one program
		driver.findElementByXPath("//android.widget.TextView[@text='WTD Harbhajan singh']").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Search the serial
		WebElement search  =driver.findElementByXPath("//android.widget.TextView[@text='Search']");
		 search.sendKeys("Kaushiki");
		 //wait for 10 seconmds
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		
		//Click on download
		 driver.findElementByXPath("//android.widget.TextView[@text='Download']").click();
		
		//Play the video
		 WebElement video = driver.findElementById("videoPlayer");
		 
		 JavascriptExecutor js =( JavascriptExecutor) driver ;
		 js.executeScript("arguments[0].play();", video);
		 
		//pause the video
		
		 AndroidElement START_STOP_VIDEO_BUTTON = driver.findElementByXPath("//android.widget.Button[@text=‘Play’]"); // Appium found
		
		 START_STOP_VIDEO_BUTTON.click();
		 //Wiat for 10 secounds and click on pause button
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 START_STOP_VIDEO_BUTTON.click();
		
		 System.out.println("\tPlay / Pause video process completed : " );
		 
		 
		 //Close the Player
		 js.executeScript("arguments[0].close();", video);
	
		
		//
		
		
		
		
		
	}

}
