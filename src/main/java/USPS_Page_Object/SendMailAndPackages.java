package USPS_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotation;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



    public class SendMailAndPackages extends Reusable_Annotation {

        //constructor is helper method that allows you to identify objects in your pom
        //so, later you can class those methods in your test class
        //because your pom class is not static
        ExtentTest logger;
        public SendMailAndPackages(WebDriver driver) {
            PageFactory.initElements(driver,this);
            this.logger = Reusable_Annotation.logger;
        }//end of the constructor method

        @FindBy(xpath = "//*[text()='Print a Label']")
        WebElement PrintLabelButton;

        //click on print a label button
        public void clickOnPrintLabelButton(){
            Reusable_Actions_Loggers_POM.clickMethod(driver,PrintLabelButton,logger,"Print");
        }





    }//end of java class




