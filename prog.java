package Assertion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class prog {
    WebDriver driver;

    @Test

    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zubair\\Desktop\\NewAutomation\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.google.co.uk/");


        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("cerner");

        element.submit();

            String actastr = driver.findElement(By.xpath("//*[@id=\"abar_button_opt\"]")).getText();
            String  expec ="Settings";

        Assert.assertEquals(actastr,expec);
        
        }
        }

