package com.example.automation.core.config;
import java.io.*; import java.nio.file.*; import java.time.Duration; import java.util.Properties;
public final class ConfigManager {
  private static EnvironmentConfig config;
  private ConfigManager() {}
  public static synchronized EnvironmentConfig get() {
    if (config == null) {
      String env = System.getProperty("env", "qa"); Properties p = new Properties();
      Path path = Paths.get("config", env + ".properties");
      try (InputStream in = Files.newInputStream(path)) { p.load(in); } catch (IOException e) { throw new IllegalStateException("Cannot load " + path, e); }
      config = new EnvironmentConfig(p.getProperty("baseUrl"), p.getProperty("apiBaseUrl"), Duration.ofSeconds(Long.parseLong(p.getProperty("timeoutSeconds", "15"))));
    }
    return config;
  }
}
