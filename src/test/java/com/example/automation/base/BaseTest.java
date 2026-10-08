package com.example.automation.base;
import com.example.automation.core.driver.*; import com.example.automation.core.execution.ExecutionContextManager; import org.testng.annotations.*;
public abstract class BaseTest {
 @BeforeMethod(alwaysRun=true) public void setup(java.lang.reflect.Method method){ExecutionContextManager.start(method.getName()); DriverManager.setDriver(DriverFactory.create());}
 @AfterMethod(alwaysRun=true) public void teardown(){try{DriverManager.quitDriver();}finally{ExecutionContextManager.clear();}}
}
