package com.testersconnect.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestCaseBase {

	public static WebDriver driver;
	
	@BeforeTest
	public void init() {
		Properties prop=new Properties();
		System.out.println("Executing init");
		try {
			File f=new File(System.getProperty("user.dir")+"//TestConfig//config.properties");
			System.out.println(System.getProperty("user.dir")+"//TestConfig//config.properties");
			prop.load(new FileInputStream(f));
			System.setProperty("webdriver.chrome.driver", prop.getProperty("CHROME_DRIVER_PATH"));
			driver=new ChromeDriver();
			
			driver.navigate().to(prop.getProperty("AUT_URL"));
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	@AfterTest
	public void cleanup() {
		
	}
	
	
}
