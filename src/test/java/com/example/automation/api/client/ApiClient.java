package com.example.automation.api.client;
import static io.restassured.RestAssured.given; import io.restassured.response.Response;
public final class ApiClient { private final String baseUrl; public ApiClient(String baseUrl){this.baseUrl=baseUrl;} public Response get(String path){return given().baseUri(baseUrl).when().get(path);} }
