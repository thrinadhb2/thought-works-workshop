package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practise {

    static WebDriver driver = new ChromeDriver();

    public static void main(String args[]) {

        driver.get("https://www.google.co.in");
        driver.get("https://www.facebook.com");
        // driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        System.out.println(driver.getTitle());

    }
}
