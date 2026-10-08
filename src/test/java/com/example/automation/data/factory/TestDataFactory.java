package com.example.automation.data.factory;
import com.example.automation.data.models.UserData; import java.util.UUID;
public final class TestDataFactory { private TestDataFactory(){} public static UserData validLogin(){return new UserData("tomsmith","SuperSecretPassword!");} public static String uniqueId(){return "AUTO-"+UUID.randomUUID();} }
