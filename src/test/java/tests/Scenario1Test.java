import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario1Test {

    @Test
    public void simpleFormTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lambdatest.com/selenium-playground");

        driver.findElement(By.linkText("Simple Form Demo")).click();

        String message = "Welcome to TestMu";

        driver.findElement(By.id("user-message")).sendKeys(message);

        driver.findElement(By.id("showInput")).click();

        String output = driver.findElement(By.id("message")).getText();

        Assert.assertEquals(output, message);

        driver.quit();
    }
}

