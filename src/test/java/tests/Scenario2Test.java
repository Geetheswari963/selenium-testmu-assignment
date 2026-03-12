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

       ChromeOptions browserOptions = new ChromeOptions();
browserOptions.setPlatformName("Windows 10");
browserOptions.setBrowserVersion("dev");
HashMap<String, Object> ltOptions = new HashMap<String, Object>();
ltOptions.put("username", "geethamagapu963");
ltOptions.put("accessKey", "LT_sI4P1oEfz34w7mmjPtRE2OLCMrORR6l8biWyiya8jAoyH8Y");
ltOptions.put("visual", true);
ltOptions.put("video", true);
ltOptions.put("network", true);
ltOptions.put("build", "TestMu Selenium Assignment");
ltOptions.put("project", "Selenium 101 Assignment");
ltOptions.put("name", "Scenario Tests");
ltOptions.put("selenium_version", "4.0.0");
ltOptions.put("w3c", true);
ltOptions.put("accessibility", true);
browserOptions.setCapability("LT:Options", ltOptions);

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
