package com.example.automation.pages;
import com.example.automation.core.element.ElementActions; import org.openqa.selenium.WebDriver;
public abstract class BasePage { protected final WebDriver driver; protected final ElementActions actions; protected BasePage(WebDriver driver){this.driver=driver;this.actions=new ElementActions(driver);} }
