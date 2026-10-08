package com.example.automation.core.driver;
public enum BrowserType { CHROME, FIREFOX, EDGE;
  public static BrowserType from(String value) { return valueOf(value.trim().toUpperCase()); }
}
