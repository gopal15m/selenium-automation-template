package com.example.automation.core.driver;
import java.net.*; import org.openqa.selenium.*; import org.openqa.selenium.chrome.*; import org.openqa.selenium.firefox.*; import org.openqa.selenium.edge.*; import org.openqa.selenium.remote.RemoteWebDriver;
public final class DriverFactory {
  private DriverFactory() {}
  public static WebDriver create() {
    BrowserType browser=BrowserType.from(System.getProperty("browser","chrome"));
    boolean headless=Boolean.parseBoolean(System.getProperty("headless","true"));
    String execution=System.getProperty("execution","local");
    MutableCapabilities options = options(browser, headless);
    if ("grid".equalsIgnoreCase(execution)) {
      try { return new RemoteWebDriver(new URI(System.getProperty("gridUrl","http://localhost:4444/wd/hub")).toURL(), options); }
      catch(Exception e){ throw new IllegalStateException("Unable to create Grid driver", e); }
    }
    return switch(browser){ case CHROME -> new ChromeDriver((ChromeOptions)options); case FIREFOX -> new FirefoxDriver((FirefoxOptions)options); case EDGE -> new EdgeDriver((EdgeOptions)options); };
  }
  private static MutableCapabilities options(BrowserType b, boolean headless) {
    return switch(b) {
      case CHROME -> { ChromeOptions o=new ChromeOptions(); if(headless)o.addArguments("--headless=new","--window-size=1920,1080"); yield o; }
      case FIREFOX -> { FirefoxOptions o=new FirefoxOptions(); if(headless)o.addArguments("-headless"); yield o; }
      case EDGE -> { EdgeOptions o=new EdgeOptions(); if(headless)o.addArguments("--headless=new","--window-size=1920,1080"); yield o; }
    };
  }
}
