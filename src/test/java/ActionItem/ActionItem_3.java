package ActionItem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionItem_3 {

    public static void main(String[] args) throws InterruptedException {

        //set an array for sports
        String[] sports= new String[4];
        sports[0] = "Football";
        sports[1] = "Tennis";
        sports[2] = "Soccer";
        sports[3] = "Hockey";

        //set the property of chromedriver we are using
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);

        for(int i = 0; i < sports.length; i++) {

            //navigate to Bing
            driver.navigate().to("https://www.bing.com");
            //wait few seconds
            Thread.sleep(3000);
            //enter keyword on search
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sports[i]);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[contains(@class,'sb_form_q')]")).submit();
            Thread.sleep(2000);

            //capture the search result and store it as a variable
            String result = driver.findElement(By.xpath("//*[contains(@class,'sb_count')]")).getText();
            String[] arrayResult = result.split(" ");
            System.out.println("My search result for " + sports[i] + " is "  + arrayResult[0]);
        }//end of foorloop

            //quit driver
            driver.quit();


    }//end of main method






}//end of java class
