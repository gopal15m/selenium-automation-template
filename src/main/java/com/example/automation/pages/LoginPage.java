package com.example.automation.pages;
import org.openqa.selenium.*;
public final class LoginPage extends BasePage {
  private final By username=By.id("username"), password=By.id("password"), login=By.cssSelector("button[type='submit']"), flash=By.id("flash");
  public LoginPage(WebDriver driver){super(driver);} public LoginPage open(String baseUrl){driver.get(baseUrl+"/login");return this;}
  public LoginPage username(String v){actions.type(username,v);return this;} public LoginPage password(String v){actions.type(password,v);return this;} public LoginPage submit(){actions.click(login);return this;} public String message(){return actions.text(flash);}
}
