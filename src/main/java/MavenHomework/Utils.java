package MavenHomework;


//import org.apache.xpath.operations.String;
import java.lang.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//import static com.sun.tools.javac.util.Constants.format;
//import static sun.plugin.util.ProgressMonitor.get;


public class Utils extends BasePage {

    public static void ClickOnElement(By by) {
        driver.findElement(by).click();


    }

    public static void entertext(By by, java.lang.String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static java.lang.String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static void waitForElementToBeClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);

    }

    public static String generateEmail() {
        Calendar time = Calendar.getInstance();
        // Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        // String curTime= String.format("%02d_%02d_%02d",time.get(Calendar.HOUR_OF_DAY),time.get(Calendar.MINUTE),time.get(Calendar.SECOND));
        String curTime = sdf.format(time.getTime());
        String email = "Meghna" + curTime + "@hotmail.com";
        return email;

    }

    public static void selectFromDropDown(String dropDown, String chooseValue) {
           Select droplist = new Select(driver.findElement(By.name(dropDown)));
    }
}
