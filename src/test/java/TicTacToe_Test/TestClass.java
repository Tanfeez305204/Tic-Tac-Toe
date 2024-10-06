package TicTacToe_Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Capabilities.cap;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TestClass extends cap {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void bt() throws MalformedURLException {
		
		driver = cap();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	// Touch or tap on single player
	@Test(priority = 2)
	public void Touch() {
		driver.findElement(MobileBy.id("com.twismart.games.tictactoe:id/player1")).click();
		// press back button
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		// touch or tap on two player
		driver.findElement(MobileBy.id("com.twismart.games.tictactoe:id/player2")).click();
	}
	@Test(priority = 3)
	public void Gameplay() {
			// playing tic toe game
		driver.findElement(MobileBy.id("com.twismart.games.tictactoe:id/player1")).click();
		driver.findElement(MobileBy.id("com.twismart.games.tictactoe:id/facil")).click();
		driver.findElement(MobileBy.id("com.twismart.games.tictactoe:id/imageView")).click();
		driver.findElement(MobileBy.id("com.twismart.games.tictactoe:id/imageView9")).click();
		driver.findElement(MobileBy.id("com.twismart.games.tictactoe:id/imageView3")).click();
		driver.findElement(MobileBy.id("com.twismart.games.tictactoe:id/imageView2")).click();
		driver.findElement(MobileBy.id("com.twismart.games.tictactoe:id/imageView6")).click();
		driver.findElement(MobileBy.id("com.twismart.games.tictactoe:id/imageView7")).click();
		driver.findElement(MobileBy.id("com.twismart.games.tictactoe:id/newgame")).click();
		
		driver.findElement(MobileBy.AccessibilityId("com.twismart.games.tictactoe:id/menu")).click();
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK)); // click on back button

		
	}
	
	@Test(priority = 1)
    public void openNotifications() throws InterruptedException {
	    
        // Open notifications or interact with elements in a list
        driver.openNotifications();
     
        
        // cliked on do not disturb option
        driver.findElements(MobileBy.className("android.widget.ImageView")).get(2).click();
        driver.findElement(MobileBy.id("android:id/button1")).click();
      
             
    }
	
	@Test
	public void switchapp() throws InterruptedException {
	    // Switched to generalStore app
        driver.activateApp("com.androidsample.generalstore");
           
        // get the message text from the messaging app

        String msg = driver.findElement(MobileBy.id("com.androidsample.generalstore:id/toolbar_title")).getText();
        System.out.println(msg);
       	        
        // Perform app switch and press the Home button
        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));

     
	}
	
	@AfterTest
    public void tearDown() {
        // Close the app and quit the driver session
            driver.quit();
        }

}
