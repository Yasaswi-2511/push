package org.example;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

    public class demo {
        @Test
        public void test(){
            System.out.println("welcome");
            WebDriver driver;
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.credly.com/users/sign_in");
           driver.findElement(By.id("email_4")).sendKeys("2000030718@kluniversity.in");
           driver.findElement(By.name("password")).sendKeys("aparna");
          // driver.findElement(By.linkText("Forgot your password?")).click();
            driver.findElement(By.linkText("Forgot your password?")).click();
           driver.findElement(By.className("input-feedback"));








    }
}
