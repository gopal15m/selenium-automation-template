package com.example.automation.core.wait;
import com.example.automation.core.config.ConfigManager; import org.openqa.selenium.*; import org.openqa.selenium.support.ui.*;
public final class WaitManager {
  private final WebDriverWait wait;
  public WaitManager(WebDriver driver){ wait=new WebDriverWait(driver, ConfigManager.get().timeout()); }
  public WebElement visible(By locator){ return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); }
  public WebElement clickable(By locator){ return wait.until(ExpectedConditions.elementToBeClickable(locator)); }
}
