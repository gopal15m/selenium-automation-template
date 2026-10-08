package com.example.automation.core.driver;
import org.openqa.selenium.WebDriver;
public final class DriverManager {
  private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();
  private DriverManager() {}
  public static void setDriver(WebDriver driver) { DRIVER.set(driver); }
  public static WebDriver getDriver() { WebDriver d=DRIVER.get(); if(d==null) throw new IllegalStateException("Driver not initialized"); return d; }
  public static void quitDriver() { WebDriver d=DRIVER.get(); try { if(d!=null) d.quit(); } finally { DRIVER.remove(); } }
}
