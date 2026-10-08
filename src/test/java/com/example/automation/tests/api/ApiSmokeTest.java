package com.example.automation.tests.api;
import com.example.automation.api.services.PostService; import com.example.automation.core.config.ConfigManager; import org.testng.Assert; import org.testng.annotations.Test;
public class ApiSmokeTest { @Test(groups={"smoke","api"}) public void postCanBeRetrieved(){ var response=new PostService(ConfigManager.get().apiBaseUrl()).getPost(1); Assert.assertEquals(response.statusCode(),200); Assert.assertEquals(response.jsonPath().getInt("id"),1); } }
