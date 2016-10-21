package com.fannie;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Selenium can help to open the request on any browser 
 * by default we have firefox
 * @author Administrator
 *
 */
public class FireFoxDriverDemo {

	
	public static  void main (String[] arg){
		
		WebDriver driver =new FirefoxDriver();
		String url="http://yahoo.com";
		
		driver.get(url);
		
		try{
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
	}
	
	
	
	
}
