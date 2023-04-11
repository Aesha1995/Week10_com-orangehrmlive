package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        WebDriver driver = new ChromeDriver(); //setup Chrome browser
        driver.manage().window().maximize(); // it will give maximise view of the screen
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5)); //it will give order to implicit wait to browser
        driver.get(baseUrl); //open URL
        System.out.println("Title of Website is : " + driver.getTitle()); //print title of the website
        System.out.println("URL of current webpage is : " +driver.getCurrentUrl()); //print current url of webpage
        System.out.println("Source code of webpage : " +driver.getPageSource()); //print source code of webpage
        driver.findElement(By.name("username")).sendKeys("Aesha Panchal"); // send emailid to email field
        driver.findElement(By.name("password")).sendKeys("aesha12345"); //send password to password field
        driver.close(); //it will close the browser

    }
}
