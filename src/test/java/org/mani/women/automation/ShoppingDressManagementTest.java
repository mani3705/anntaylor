package org.mani.women.automation;

import org.mani.women.utils.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingDressManagementTest extends SetUp {
    @Test
    public void selectDress(){
        setUpDriver();
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//a[@id='cata00002']/strong"));
        actions.moveToElement(element).build().perform();
        Assert.assertEquals(driver.findElement(By.xpath("//a[@id='my-bag-icon']/span/strong")).getText(),"0");
    }
}
