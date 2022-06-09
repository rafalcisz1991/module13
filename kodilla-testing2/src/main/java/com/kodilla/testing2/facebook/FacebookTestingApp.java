package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "//div[contains(@class, \"_9xo5\")]/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_BIRTHMONTH = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[1]";
    public static final String XPATH_BIRTHDAY = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[2]";
    public static final String XPATH_BIRTHYEAR = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectCookies = driver.findElement(By.xpath(XPATH_COOKIES));
        selectCookies.click();

        WebElement createNewAccount = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        createNewAccount.click();

        Thread.sleep(5000);

        WebElement chooseMonth = driver.findElement(By.xpath(XPATH_BIRTHMONTH));
        Select selectMonth1 = new Select(chooseMonth);
        selectMonth1.selectByIndex(2);

        WebElement chooseDay = driver.findElement(By.xpath(XPATH_BIRTHDAY));
        Select selectDay = new Select(chooseDay);
        selectDay.selectByVisibleText("20");

        WebElement chooseYear = driver.findElement(By.xpath(XPATH_BIRTHYEAR));
        Select selectYear = new Select(chooseYear);
        selectYear.selectByVisibleText("2000");
    }
}
