import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FaceBookDropdown  {



        public static void main(String args[]) {


            System.setProperty("webdriver.chrome.driver", "/Users/srutiveda/Downloads/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
            ((ChromeDriver) driver).findElementByXPath("//*[@id=\'u_0_l\']").sendKeys("Alia");
            ((ChromeDriver) driver).findElementByXPath("//*[@id=\'u_0_n\']").sendKeys("Kora");
            ((ChromeDriver) driver).findElementByXPath("//*[@id=\'u_0_q\']").sendKeys("aliakora14@gmail.com");
            WebDriverWait d= new WebDriverWait(driver,20);
            d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'u_0_t\']"))).sendKeys("aliakora14@gmail.com");
            ((ChromeDriver) driver).findElementByXPath("//*[@id=\'u_0_x\']").sendKeys("AliaKora@17");
            WebElement monthdata= ((ChromeDriver) driver).findElementById("month");
            Select monthobj=new Select(monthdata);
            monthobj.selectByIndex(7);
            WebElement daydata= ((ChromeDriver) driver).findElementById("day");
            Select dayobj=new Select(daydata);
            dayobj.selectByIndex(17);
            WebElement yeardata= ((ChromeDriver) driver).findElementById("year");
            Select yearobj=new Select(yeardata);
            yearobj.selectByValue("1995");
             // Thread.sleep(10);

            //d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

            WebElement femaleBtn= ((ChromeDriver) driver).findElementByXPath("//*[@id=\'u_0_8\']");
            femaleBtn.click();
           ((ChromeDriver) driver).findElementById("u_0_15").click();




        }



    }

