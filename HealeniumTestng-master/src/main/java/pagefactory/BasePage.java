package pagefactory;


import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
    protected String mainPageUrl = "https://sha-test-app.herokuapp.com/";
    protected String ajaxLoadPageUrl = "https://stephanwagner.me/loading-spinner-with-animation";
    protected String yandexPageUrl = "https://yandex.ru/";
    protected SelfHealingDriver driver;

    public BasePage(SelfHealingDriver driver) {
        this.driver = driver;
    }

    public static void sleepForSecondsToSeeTheAlertWhileTestIsRunning(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getAlertText() {
        sleepForSecondsToSeeTheAlertWhileTestIsRunning(1);
        String foundAlertText = "";
        WebDriverWait wait = new WebDriverWait(driver, 0 /*timeout in seconds*/);
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            foundAlertText = driver.switchTo().alert().getText();
        } catch (TimeoutException eTO) {
            foundAlertText = "no alert text";
        }
        return foundAlertText;
    }

    public void confirmAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    
    public void assertToCheckFieldAvailability(WebElement webElement, String text) {
		waitUntilElementVisible(webElement);
		Assert.assertTrue((isEnabled(webElement) || isDisplayed(webElement)), text);
	}
	public void click(WebElement webElement) {
        waitUntilElementClickable(webElement);
        webElement.click();
    }
	public void sendKeys(WebElement webElement, String text) {
        waitUntilElementVisible(webElement);
        webElement.sendKeys(text);
    }
	public void waitUntilElementClickable(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
	public Boolean isEnabled(WebElement webElement) {
		return webElement.isEnabled();
	}
	public Boolean isDisplayed(WebElement webElement) {
    	waitUntilElementVisible(webElement);
		return webElement.isDisplayed();
	}
	public void waitUntilElementVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
	public void clickUsingJavascriptExecutor(WebElement webElement) {
    	waitUntilElementClickable(webElement);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", webElement);
	}
}
