package com.example.automation.api.services;
import com.example.automation.api.client.ApiClient; import io.restassured.response.Response;
public final class PostService { private final ApiClient client; public PostService(String baseUrl){client=new ApiClient(baseUrl);} public Response getPost(int id){return client.get("/posts/"+id);} }
