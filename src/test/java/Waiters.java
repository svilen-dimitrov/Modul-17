import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Waiters extends MainDriver{


//    @Test
//            public void waitVisability(){
//        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']/button"));
//        startButton.click();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//        WebElement helloWorld = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish")));
//
//        Assert.assertTrue(helloWorld.isDisplayed());
//
//    }
    @Test
    public void sauceDemoGlitch(){
        WebElement usernameField = driver.findElement(By.cssSelector("[name = 'user-name']"));
        WebElement passwordField = driver.findElement(By.cssSelector("[name = 'password']"));

        usernameField.sendKeys("performance_glitch_user");
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.cssSelector("[name = 'login-button']"));
        loginButton.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(0));
        WebElement productsPageTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
        Assert.assertEquals(productsPageTitle.getText(), "Products");
    }
}
