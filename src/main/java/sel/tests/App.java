package sel.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.firefox.MarionetteDriver;
import java.util.concurrent.TimeUnit;

/**
 * Let's configure selenium to do something
 *
 */
public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/home/r/bin/geckodriver.exe");
        MarionetteDriver driver = new MarionetteDriver();
        driver.manage().timeouts().implicitlyWait(250, TimeUnit.MILLISECONDS);
        driver.get("http://localhost:8080/pweb");

        LoginPage page = PageFactory.initElements(driver, LoginPage.class);
        page.login("user", "password");

        // (new WebDriverWait(driver, 10))
            // .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[value=logout]")));

        StartPage start = PageFactory.initElements(driver, StartPage.class);
        start.logout();

        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        driver.quit();
    }
}
