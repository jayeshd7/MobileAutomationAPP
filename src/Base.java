import java.io.File;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		//Appium code (I put apk inside src)
		File f = new File("src");
		File fs = new File(f,"com.vuclip.android_2016-07-06.apk");
		
		//Launch the app
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "jayesh");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;			
		
		
			
		
	}

}
