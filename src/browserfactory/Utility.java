package browserfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    /**
     * This method will click on element
     */



    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    /**
     * This method will get text from element
     */



    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text to element
     */


    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    /**
     * This method will select the option by visible text
     */

    //Alert method 5 need to create




    //Select class method
    public void selectByVisibleTextFromDropDown(By by, String text) {
        /** WebElement dropDown = driver.findElement(by);
         Select select = new Select(dropDown);
         select.selectByVisibleText(text);**/

        new Select(driver.findElement(by)).selectByVisibleText(text);
    }
    public void selectByValueFromDropDown(By by, String value) {
        new Select(driver.findElement(by)).selectByValue(value);
    }
    public void selectOptionFromDropDown(By by, int index) {
        new Select (driver.findElement(by)).selectByIndex(index);
    }

    /**
     * Action ---  mouseHover
     */

    public void mouseHoverOnElement (By by,By by1){
        WebElement text1 = driver.findElement(by);
        WebElement text2 = driver.findElement(by1);
        Actions actions = new Actions(driver);
        actions.moveToElement(text1).moveToElement(text2).click().build().perform();
    }
}


