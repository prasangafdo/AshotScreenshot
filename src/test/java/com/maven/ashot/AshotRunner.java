package com.maven.ashot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AshotRunner {

	//public static void main(String[] args) {
	@Test
	public void VerifyTest() throws IOException  {
		// TODO Auto-generated method stub
		
		
			System.setProperty("webdriver.chrome.driver", "C:/Users/Prasanga Fernando/Documents/Eclipse/TestNG_PageTitle/chromedriver/chromedriver.exe");
			
		
		   WebDriver driver = new ChromeDriver();
			
			driver.get("http://google.com");
			driver.manage().window().maximize();
					
			Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

			ImageIO.write(screenshot.getImage(), "jpg", new File("C:\\Users\\Prasanga Fernando\\Desktop\\ElementScreenshot.jpg"));
		
		driver.close();
			
	}

}
