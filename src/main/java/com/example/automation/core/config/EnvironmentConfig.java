package com.example.automation.core.config;
import java.time.Duration;
public record EnvironmentConfig(String baseUrl, String apiBaseUrl, Duration timeout) {}
