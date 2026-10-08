package com.example.automation.components;
import org.openqa.selenium.*;
public final class HeaderComponent { private final WebDriver driver; public HeaderComponent(WebDriver driver){this.driver=driver;} public String title(){return driver.getTitle();} }
