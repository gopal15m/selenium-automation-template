package com.example.automation.workflows;
import com.example.automation.pages.LoginPage; import org.openqa.selenium.WebDriver;
public final class LoginWorkflow { private final LoginPage page; private final String baseUrl; public LoginWorkflow(WebDriver d,String baseUrl){page=new LoginPage(d);this.baseUrl=baseUrl;} public String login(String u,String p){return page.open(baseUrl).username(u).password(p).submit().message();} }
