package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class facebook {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String inEmail = scanner.nextLine();

        System.out.print("Enter your password: ");
        String inPass = scanner.nextLine();

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://facebook.com");

        WebElement email = driver.findElement(By.name("email"));
        WebElement pass = driver.findElement(By.name("pass"));

        email.clear();
        //email.sendKeys(Credential.Y_EMAIL);
        email.sendKeys(inEmail);

        pass.clear();
        //pass.sendKeys(Credential.FACEBOOK_PASS);
        pass.sendKeys(inPass);

        pass.submit();

        Integer notifications;

        WebElement notificationsCountValue = driver.findElement(By.id("notificationsCountValue"));

        if(!notificationsCountValue.getText().equals("")){
            notifications = Integer.parseInt(notificationsCountValue.getText());
            System.out.println("You have " + notifications.toString() + " new notification(s).");
        } else{
            System.out.println("You have no new notifications.");
        }

        driver.close();
    }
}