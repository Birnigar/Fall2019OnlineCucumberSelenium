package com.vytrack.pages;


import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPageBase {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,15);


    @FindBy(css = "#user-menu > a")
    private WebElement currentUser ;

    @FindBy(css = "[class='btn-group pull-right'] > button")
    protected WebElement saveAndClose;


    public void clickOnSaveAndClose() {
        BrowserUtils.wait(10);
        wait.until(ExpectedConditions.elementToBeClickable(saveAndClose)).click();
        BrowserUtils.wait(10);
    }

    public String getCurrentUserName(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(currentUser));
        return  currentUser.getText().trim();
    }


    public AbstractPageBase() {
        PageFactory.initElements(driver, this);
    }
    /**
     * Method for vytrack navigation. Provide tab name and module name to navigate
     * @param tabName, like Dashboards, Fleet or Customers
     * @param moduleName, like Vehicles, Vehicles Odometer and Vehicles Costs
     */
    public void navigateTo(String tabName, String moduleName) {
        String tabNameXpath = "//span[@class='title title-level-1' and contains(text(),'" + tabName + "')]";
        String moduleXpath = "//span[@class='title title-level-2' and text()='" + moduleName + "']";

        BrowserUtils.wait(5);
        WebElement tabElement = driver.findElement(By.xpath(tabNameXpath));
        BrowserUtils.wait(4);
        WebElement moduleElement = driver.findElement(By.xpath(moduleXpath));

        Actions actions = new Actions(driver);
        BrowserUtils.wait(4);
        actions.moveToElement(tabElement).
                pause(2000).
                click(moduleElement).
                pause(2000).
                build().perform();


        BrowserUtils.wait(10);
        waitForLoaderMask();

    }

    public void waitForLoaderMask(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[class*='loader-mask']")));
    }
}
