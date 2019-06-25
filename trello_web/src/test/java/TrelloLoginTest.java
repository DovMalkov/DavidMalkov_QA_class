import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TrelloLoginTest {
    WebDriver wd;

@BeforeMethod
public void setUp(){
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    wd.get("https://trello.com");
}

@Test
public void loginTest() throws InterruptedException {
    // click login button
    wd.findElement(By.cssSelector("[href='/login']")).click();
    // type email
    wd.findElement(By.id("user")).sendKeys("dovmalkov@gmail.com");
    //type passw
    wd.findElement(By.name("password")).sendKeys("iamdavid25");
    Thread.sleep(3000);
    //confirm login
    wd.findElement(By.id("login")).click();
    Thread.sleep(10000);
}


@AfterMethod
    public void tearDown(){
    wd.quit();
}

}





