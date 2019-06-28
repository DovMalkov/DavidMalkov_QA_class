import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class wikipediaWebTest {

 WebDriver wd;

 @BeforeMethod
public void SetUp (){

 wd=new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     wd.get("https://ru.wikipedia.org/wiki/");
 }
 @Test
 public void FindSomethingOnWiki() throws InterruptedException{
    //click search field
  //  wd.findElement(By.name("search")).click();
    // Thread.sleep(10000);
     //type query
     wd.findElement(By.name("search")).sendKeys("dog");
     Thread.sleep(5000);
     //press search
     wd.findElement(By.name("go")).click();
     Thread.sleep(5000);
 }



   @AfterMethod
   public void tearDown(){
        wd.quit();
    }
}
