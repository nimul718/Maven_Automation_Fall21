package ActionItem;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class ActionItem_4 {

    public static void main(String[] args) throws InterruptedException {

        //call the webdrivermanager
        WebDriverManager.chromedriver().setup();
        //call chromeoptions
        ChromeOptions options = new ChromeOptions();
        //set incognito the driver
        options.addArguments("incognito");
        options.addArguments("maximize");

        //set my webdriver
        WebDriver driver = new ChromeDriver(options);


         //ArrayList for zipcode

        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11210");
        zipCode.add("10001");
        zipCode.add("11345");


        for(int i = 0; i < zipCode.size(); i++) {

            //navigate to weightWatchers
            driver.navigate().to("https://www.weightwatchers.com");
            Thread.sleep(2000);

            try{
                //click on attend
                driver.findElement(By.xpath("//*[text()='Attend']")).click();
                Thread.sleep(2000);
            }catch (Exception e) {
                System.out.println("Unable to click on Attend " + e);
            }

            try{
                //click on unlimited workshops
                driver.findElement(By.xpath("//*[@data-e2e-name='unlimited_workshops']")).click();
                Thread.sleep(2000);
            }catch (Exception e) {
                System.out.println("Unable to click on unlimited workshops " + e);
            }

            try{
                //click on Find a studio link
                driver.findElement(By.xpath("//*[text()='Studio']")).click();
                Thread.sleep(1000);
            }catch (Exception e) {
                System.out.println("Unable to click on Studio " + e);
            }

            try{
                //enter zipCode and hit search
                driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys(zipCode.get(i));
                driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
                Thread.sleep(2000);
            }catch (Exception e) {
                System.out.println("Unable to enter zipCode " + e);
            }

        }


        //quit driver
        driver.quit();

    }//end of main method




}//end of java class
