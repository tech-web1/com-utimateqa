package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {
        String baseurl="https://courses.ultimateqa.com/users/sign_in";

        //Launch the Chrome Browser
        WebDriver driver=new ChromeDriver();
        driver.get(baseurl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        //Get the Title of the page
        String title=driver.getTitle();
        System.out.println("Page Title is"+title);
        //Print the Current Url
        System.out.println("Current URL"+driver.getCurrentUrl());

        //Print the page Source
        System.out.println("Page Source"+driver.getPageSource());

        //Find the Email Field Element
        WebElement emailField=driver.findElement(By.id("user[email]"));
        emailField.sendKeys("prime123@gmail.com");

        //Type the Password field and type the Password
        driver.findElement(By.name("user[password]"));

        //Close The Browser
        driver.close();
    }
}
