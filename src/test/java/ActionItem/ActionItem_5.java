package ActionItem;

import Day9_010822.Reusable_Actions;
import com.sun.source.tree.ContinueTree;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import static java.awt.SystemColor.scrollbar;
import static java.awt.SystemColor.window;

public class ActionItem_5 {


    /*
    precondition - set the driver and navigate to Hulu website
    test 1 - Navigate to Hulu website. Verify title. Click on select button. Enter email, password, name.
   */
    //declare the webdriver outside of the annotation methods, so it can be called on all methods
    WebDriver driver;

    @BeforeSuite
    public void setTheDriver() {
        driver = AI_ReusableActions.setDriver();
        driver.navigate().to("https://www.hulu.com");
    }//end of precondition

    @Test(priority = 1)
    public void verifyTitle() throws InterruptedException {
        //verify title says 'Stream TV and Movies'
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("Stream TV and Movies")) {
            System.out.println("Title matches as 'Stream TV and Movies'");
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }
        //scroll to the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0,3300)");

        //click on select for hulu trial
        AI_ReusableActions.clickMethod(driver, "//*[@class='button--cta button--black plan-card__cta plan-card__0_cta button--black ']", "SELECT");

        //enter email
        AI_ReusableActions.sendKeysMethod(driver,"//*[@id='email']","nemz11211@me.com","Enter Email");
        //enter password
        AI_ReusableActions.sendKeysMethod(driver,"//*[@id='password']","123nemzZ","Enter Password");
        //enter name
        AI_ReusableActions.sendKeysMethod(driver,"//*[@id='firstName']","Nemz One","Name");
        //select birth month
        AI_ReusableActions.clickMethod(driver,"//*[text()='Month']","Month");
        AI_ReusableActions.clickMethod(driver,"//*[@id='birthdayMonth-item-0']","January");
        //select birthday
        AI_ReusableActions.clickMethod(driver,"//*[text()='Day']","Day");
        AI_ReusableActions.clickMethod(driver,"//*[@id='birthdayDay-item-8']","8");
        //select birth year
        AI_ReusableActions.clickMethod(driver,"//*[text()='Year']","Year");
        AI_ReusableActions.clickMethod(driver,"//*[@id='birthdayYear-item-36']","1986");
        //select gender
        AI_ReusableActions.clickMethod(driver,"//*[text()='Select']","Male");
        AI_ReusableActions.clickMethod(driver,"//*[@id='gender-item-1']","Male");

        //scroll to the middle of the page
        WebElement Element = driver.findElement(By.xpath("//*[text()='CONTINUE']"));
        js.executeScript("arguments[0].scrollIntoView();", Element);

        // click on continue
        AI_ReusableActions.clickMethod(driver,"//*[@class='button button--continue ']","CONTINUE");

        //wait few seconds capture your subscription amount and store it in a variable and print the amount
        Thread.sleep(5000);
        String subValue = AI_ReusableActions.getTextMethod(driver, "//*[@class='ledger__content']", "Capture Text");

        //Capture the text 'Total Due Today $0.00' and print the amount
        String totalDue = AI_ReusableActions.getTextMethod(driver, "//*[@class='ledger__summary']", "Capture Total Due Today");




    }//end of test

    @AfterSuite
    public void quitSession() {
        //driver.quit();
    }

    @BeforeMethod
    public void beforeTest() {
        System.out.println("This executes before each test");
    }

    @AfterMethod
    public void afterTest() {
        System.out.println("This executes after each test");
    }


}//end of java class