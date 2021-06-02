import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BaseMethod extends BaseDriver{
    public void waitUntilElementAppear(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public WebElement findElement(By by){
        waitUntilElementAppear(by);
        return driver.findElement(by);
    }
    public void clickElement(By by){
        waitUntilElementAppear(by);
        findElement(by).click();
    }
    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }
    public void findElementAccesibility(By by) {
        driver.findElementByAccessibilityId(String.valueOf(by));
    }}


