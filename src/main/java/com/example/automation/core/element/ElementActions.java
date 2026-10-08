package com.example.automation.core.element;
import com.example.automation.core.wait.WaitManager; import org.openqa.selenium.*;
public final class ElementActions {
  private final WaitManager waits;
  public ElementActions(WebDriver driver){ waits=new WaitManager(driver); }
  public void click(By locator){ waits.clickable(locator).click(); }
  public void type(By locator,String value){ WebElement e=waits.visible(locator); e.clear(); e.sendKeys(value); }
  public String text(By locator){ return waits.visible(locator).getText(); }
}
