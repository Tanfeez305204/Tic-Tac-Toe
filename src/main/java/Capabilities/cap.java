package Capabilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class cap {

public static AndroidDriver<AndroidElement> cap () throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"My_emulator");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.twismart.games.tictactoe");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.twismart.games.tictactoe.MainActivity");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
		return driver;
	}
	
}
