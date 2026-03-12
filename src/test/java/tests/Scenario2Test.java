import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario2Test {

    @Test
    public void sliderTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lambdatest.com/selenium-playground");

        driver.findElement(By.linkText("Drag & Drop Sliders")).click();

        WebElement slider = driver.findElement(By.xpath("//input[@value='15']"));

        Actions actions = new Actions(driver);

        actions.dragAndDropBy(slider, 215, 0).perform();

        String value = driver.findElement(By.id("rangeSuccess")).getText();

        Assert.assertEquals(value, "95");

        driver.quit();
    }
}
