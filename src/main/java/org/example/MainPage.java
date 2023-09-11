package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class MainPage {
    public WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public static final String factory = "https://skillfactory.ru/";

    public static final By higher_education = By.xpath("//*[@id='rec623700412']/div/div/div/section/div[1]/div/div[2]/div[1]/div/ul/li[5]/a/span");

    public static void open() {
        driver.get(factory);

    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void choiceEducation() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(higher_education));
        driver.findElement(higher_education).click();
    }
}






