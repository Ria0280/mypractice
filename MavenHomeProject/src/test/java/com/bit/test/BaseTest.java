package com.bit.test;



	
	
	import java.io.IOException;
	import java.util.Properties;

	import org.junit.Before;
	import org.openqa.selenium.WebDriver;

import com.db.ReadFile;



	public class BaseTest {
		
		//1.open a browser 
			//2.open a browser using properties file
			//3. navigate to url.
			//4. close a browser(4 steps )
		
		WebDriver dr;
		Properties prop;
		@Before
		public void startBrowser() throws IOException {
			
			prop=ReadFile.readprop("C:\\Users\\ria02\\OneDrive\\Desktop\\BTC07312021M\\MavenHomeProject\\maven.properities");
		String	browser=prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.out.println("opened chrome browser");
		}else if (browser.equals("safari")){
			System.out.println("opened safari browser");
		}else if (browser.equals("firefox")) {
			System.out.println("opned firefox browser");
		}
		
		dr.get(prop.getProperty("url"));
			
		}
		
	   //from command line through maven file
		
		String	browser=System.getProperty("browser");{
		if(browser.equals("chrome")) {
			System.out.println("opened chrome browser");
		}else if (browser.equals("safari")){
			System.out.println("opened safari browser");
		}else if (browser.equals("firefox")) {
			System.out.println("opned firefox browser");
		}
		
		//src/test/java 
		//package> com.bit.test
		//baseTest
		//smokeTest
		
		
	}}














