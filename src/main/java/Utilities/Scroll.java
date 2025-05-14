package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

import java.time.Duration;

public class Scroll {

    public static void Scroll_Click_On_Element(WebDriver driver, By Locator){

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Utility.By_To_WebElement(driver, Locator));
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.not(ExpectedConditions.attributeToBeNotEmpty(Utility.By_To_WebElement(driver,Locator),"diabled")));
        driver.findElement(Locator).click();

    }
}