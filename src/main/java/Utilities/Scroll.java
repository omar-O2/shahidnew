package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Scroll {

    public static void Scroll(WebDriver driver){

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//img[@title='El-Podcasters']")));
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.not(ExpectedConditions.attributeToBeNotEmpty(Utility.By_To_WebElement(driver,By.xpath("//img[@title='El-Podcasters']")),"diabled")));
        driver.findElement(By.xpath("//img[@title='El-Podcasters']")).click();

    }
}