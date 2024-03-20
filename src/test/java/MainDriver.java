import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MainDriver{
    WebDriver driver;
    @BeforeMethod
    public void before(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @AfterMethod
    public void tearDown(){

        //driver.quit();
    }
}