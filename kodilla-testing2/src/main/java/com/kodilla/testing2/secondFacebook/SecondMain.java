/*
package com.kodilla.testing2.secondFacebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class SecondMain {
    public static final String XPATH_WAIT_FOR = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span";
    public static final String XPATH_COOKIES = "//div[contains(@class, \"_9xo5\")]/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_BIRTHMONTH = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[1]";
    public static final String XPATH_BIRTHDAY = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[2]";
    public static final String XPATH_BIRTHYEAR = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[3]";
    public static final String FULL_XPATH_MONTH = "//html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        //cookies
        WebElement selectCookies = driver.findElement(By.xpath(XPATH_COOKIES));
        selectCookies.click();

        //nowe konto - X-Path relative
        */
/*WebElement createNewAccount = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        createNewAccount.click();*//*


        //Natomiast wyszukanie przycisku tworzenia nowego konta po jego id  nie działa
        WebElement createNewAccount1 = driver.findElement(By.id("u_0_2_St"));
        createNewAccount1.click();

        Thread.sleep(5000);

        //nie do konca rozumiem opcji opóźnienia wybrania miesiąca poniższą metodą
        //while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        //wybór miesiąca X-Path Relative
        WebElement chooseMonth = driver.findElement(By.xpath(XPATH_BIRTHMONTH));
        Select selectMonth1 = new Select(chooseMonth);
        selectMonth1.selectByIndex(2);

        //wybór dnia
        WebElement chooseDay = driver.findElement(By.xpath(XPATH_BIRTHDAY));
        Select selectDay = new Select(chooseDay);
        selectDay.selectByVisibleText("20");

        //wybór roku
        WebElement chooseYear = driver.findElement(By.xpath(XPATH_BIRTHYEAR));
        Select selectYear = new Select(chooseYear);
        selectYear.selectByVisibleText("2000");

        */
/*przechodzi poniższa opcja - z pełnym X-Path, skopiowanym z Chrome - tak jak pokazałaś na spotkaniu
        WebElement chooseMonth2 = driver.findElement(By.xpath(FULL_XPATH_MONTH));
        Select select2 = new Select(chooseMonth2);
        select2.selectByIndex(4);

        przechodzi również opcja z szukaniem po ID = month
        WebElement birthMonthInput = driver.findElement(By.id("month"));
        Select selectMonth = new Select(birthMonthInput);
        selectMonth.selectByVisibleText("Feb");

        oraz z szukaniem miesiąca po jego nazwie: name
        WebElement birthInput = driver.findElement(By.name("birthday_month"));
        Select selectMonth3 = new Select(birthInput);
        selectMonth3.selectByIndex(10);*//*

    }
}


*/
