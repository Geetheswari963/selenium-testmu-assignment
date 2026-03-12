import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario3Test {

    @Test
    public void formSubmitTest() {

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
