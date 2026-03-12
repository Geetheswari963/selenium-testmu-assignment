import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario3Test {

    @Test
    public void formSubmitTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lambdatest.com/selenium-playground");

        driver.findElement(By.linkText("Input Form Submit")).click();

        driver.findElement(By.name("name")).sendKeys("Geetha");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password")).sendKeys("12345");
        driver.findElement(By.name("company")).sendKeys("TestCompany");
        driver.findElement(By.name("website")).sendKeys("test.com");

        Select country = new Select(driver.findElement(By.name("country")));
        country.selectByVisibleText("United States");

        driver.findElement(By.name("city")).sendKeys("New York");
        driver.findElement(By.name("address1")).sendKeys("Street 1");
        driver.findElement(By.name("state")).sendKeys("NY");
        driver.findElement(By.name("zip")).sendKeys("10001");

        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        String message = driver.findElement(By.className("success-msg")).getText();

        Assert.assertTrue(message.contains("Thanks for contacting us"));

        driver.quit();
    }
}
