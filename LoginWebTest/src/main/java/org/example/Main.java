package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/pelin/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("modal-close")).click();
        Thread.sleep(1000);

        driver.findElement(By.className("link-text")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("login-email")).sendKeys("Aaaaa");
        Thread.sleep(1000);
        driver.findElement(By.id("login-password-input")).sendKeys("Bbbbbbbb");
        Thread.sleep(1000);
        driver.findElement(By.className("q-primary")).click();
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);

        driver.findElement(By.id("login-email")).sendKeys("Ccccccc");
        Thread.sleep(1000);
        driver.findElement(By.id("login-email")).clear();
        Thread.sleep(1000);

        driver.findElement(By.id("login-email")).sendKeys("Dddddd@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("login-password-input")).sendKeys("Eeeeeee");
        Thread.sleep(1000);

        driver.findElement(By.className("q-primary")).click();
        Thread.sleep(1000);

        driver.quit();
    }
}