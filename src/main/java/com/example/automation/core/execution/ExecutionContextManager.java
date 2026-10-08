package com.example.automation.core.execution;
import java.util.UUID;
public final class ExecutionContextManager {
  private static final ThreadLocal<ExecutionContext> CTX=new ThreadLocal<>(); private ExecutionContextManager(){}
  public static void start(String testId){ CTX.set(new ExecutionContext(System.getProperty("runId",UUID.randomUUID().toString()),testId,UUID.randomUUID().toString(),System.getProperty("env","qa"),System.getProperty("browser","chrome"))); }
  public static ExecutionContext get(){ return CTX.get(); } public static void clear(){ CTX.remove(); }
}
