package com.example.automation.reporting;
import com.example.automation.core.execution.ExecutionContextManager;
public final class ReportManager { private ReportManager(){} public static void log(String message){ System.out.println("[AUTOMATION] "+(ExecutionContextManager.get()==null?"":ExecutionContextManager.get()+" ")+message); } }
