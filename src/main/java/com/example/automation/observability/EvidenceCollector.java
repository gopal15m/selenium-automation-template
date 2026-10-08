package com.example.automation.observability;
import com.example.automation.core.execution.*; import java.nio.file.*; import org.openqa.selenium.*;
public final class EvidenceCollector { private EvidenceCollector(){}
  public static void capture(WebDriver driver,String testName){ try { Files.createDirectories(Paths.get("target","evidence")); byte[] png=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES); String id=ExecutionContextManager.get()==null?"unknown":ExecutionContextManager.get().correlationId(); Files.write(Paths.get("target","evidence",testName+"-"+id+".png"),png); } catch(Exception ignored){} }
}
