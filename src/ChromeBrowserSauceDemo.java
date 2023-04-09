import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserSauceDemo {

    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        //Launch the chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();// maximize the browser
        // Open the url into browser
        driver.get(baseUrl);

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //get current url
        System.out.println("Current Url :- " + driver.getCurrentUrl());

        // get page source
        System.out.println(driver.getPageSource());

        // Enter username

        driver.findElement(By.id("user-name")).sendKeys("Admin");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("Admin&1423");

        // close the driver
        driver.close();

    }
}