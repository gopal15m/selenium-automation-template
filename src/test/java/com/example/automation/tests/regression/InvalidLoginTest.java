package com.example.automation.tests.regression;
import com.example.automation.base.BaseTest; import com.example.automation.core.config.ConfigManager; import com.example.automation.core.driver.DriverManager; import com.example.automation.workflows.LoginWorkflow; import org.testng.Assert; import org.testng.annotations.*;
@Listeners(com.example.automation.listeners.TestListener.class)
public class InvalidLoginTest extends BaseTest { @Test(groups={"regression","ui"}) public void invalidLogin(){ String message=new LoginWorkflow(DriverManager.getDriver(),ConfigManager.get().baseUrl()).login("bad-user","bad-password"); Assert.assertTrue(message.contains("Your username is invalid!"),message); } }
