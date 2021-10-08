package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class HRLeaveApplication {

    @Test
    public static void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "D:\\Calyx_GIT\\calyx-automation-ftd\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Opening HR leaves Portal : ");
        driver.get("https://hrleaves.hyd.ftd.com/login.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(ByName.name("name")).sendKeys("tkatikal");
        driver.findElement(ByName.name("pswd")).sendKeys("Fresh@201904");
        driver.findElement(ByXPath.xpath("//*[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.close();
        driver.quit();
        Thread.sleep(5000);
        System.setProperty("webdriver.ie.driver",
                "D:\\Calyx_GIT\\calyx-automation-ftd\\src\\test\\resources\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.get(
                "https://nonprod-gke-primary-1-web-front-end-qa1.gcp.ftd.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();

        WebElement p = driver
                .findElement(By.xpath("//*[text()='Delivery Zip Code']"));
        p.click();
        p.sendKeys("60515");
        System.out.println("Hello");
        Thread.sleep(2000);
    }

    /*
     * @AfterTest public void postTest(){ driver.quit(); }
     */

}
