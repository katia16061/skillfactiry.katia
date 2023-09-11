package SkillFactoryTest;

import org.example.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.MainPage.higher_education;

public class MainPageTest {
    private static WebDriver driver;

    @Before
    public void setUp() {
        MainPage mainPage = new MainPage();
        mainPage.open();
        mainPage.maximizeWindow();
    }

    @After
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void test_a() {
        driver.findElement(higher_education).click();
        //WebDriver driver = new ChromeDriver();
        //MainPage mainPage = new MainPage(driver);
        // MainPage mainPage = new MainPage(driver);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
    }

    @Test
    public void test_b() {
        WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open = driver.findElement("mainPage.higher_education").click();

        //MainPage.maximizeWindow();
        driver.findElement(higher_education).click();//кнопка высшее образование
        driver.quit();
    }
    @Test
    public void test_с() {
        WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.maximizeWindow();
        WebElement allCoursesButton = driver.findElement(By.linkText("Все курсы"));
        allCoursesButton.click();
        driver.quit();
    }
}


