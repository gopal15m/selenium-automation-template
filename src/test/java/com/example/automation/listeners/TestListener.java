package com.example.automation.listeners;
import com.example.automation.core.driver.DriverManager; import com.example.automation.observability.EvidenceCollector; import org.testng.*;
public final class TestListener implements ITestListener { @Override public void onTestFailure(ITestResult r){ try{EvidenceCollector.capture(DriverManager.getDriver(),r.getName());}catch(Exception ignored){} } }
