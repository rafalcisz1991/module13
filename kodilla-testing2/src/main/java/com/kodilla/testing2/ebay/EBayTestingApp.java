package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.com/");

        //Tutaj próbowałem automatycznego zaakceptowania warunków cookies - bez rezultatu
        //driver.findElement(By.id("gdpr-banner-accept")).click();

        WebElement element = driver.findElement(By.name("_nkw"));
        element.sendKeys("Laptop");
        element.submit();
    }
}
