package com.dice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dice20Keywords extends DiceJobSearch {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(DiceJobSearch.url);
		
		List <String> keywords = new ArrayList <> ();
		
		        keywords.add("User interface (UI) developer");
		        keywords.add("Business intelligence developer");
				keywords.add("Systems analyst");
				keywords.add("Data analyst");
				keywords.add("Data engineer");
				keywords.add("Reliability engineer");
				keywords.add("Process engineer");
				keywords.add("Solutions architect");
				keywords.add("User experience (UX) designer");
				keywords.add("Database administrator");
				keywords.add("Quality assurance (QA) manager");
				keywords.add("Hardware engineer");
				keywords.add("Software engineer");
				keywords.add("Analytics manager");
				keywords.add("Site reliability engineer");
				keywords.add("Front end engineer");
				keywords.add("Product manager");
				keywords.add("Mobile developer");
				keywords.add("Software development");
				keywords.add("Data scientist");
			
		
				
				//driver.findElement(By.id("search-field-keyword")).sendKeys(keywords.get(i));
			for (int i = 0; i < keywords.size(); i++) {
				
				driver.findElement(By.id("search-field-keyword")).sendKeys(keywords.get(i));
				driver.findElement(By.id("search-field-location")).clear();
				driver.findElement(By.id("search-field-location")).sendKeys(DiceJobSearch.location);
				driver.findElement(By.id("findTechJobs")).click();		
		
				String count = driver.findElement(By.id("posiCountId")).getText();
				
				keywords.set(i,(keywords.get(i) + "-" + count));
				
				//driver.navigate().back();
				
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
				
				System.out.println(keywords.get(i));
				
			}
				driver.close();
				
				
				List<String> newKeywords = new ArrayList <> ();
				
				FileReader reader;
				try {
					reader = new FileReader("TechJobsList.txt");
					BufferedReader bReader = new BufferedReader(reader);

					
					
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
	}

}
