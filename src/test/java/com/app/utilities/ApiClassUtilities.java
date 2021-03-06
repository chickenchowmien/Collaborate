package com.app.utilities;

import com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.apache.commons.lang.RandomStringUtils;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiClassUtilities {

    public JsonObject jsonObject  = new JsonObject();
    public String baseuri = "";
    public String endPoint = "";
    public String uri = "";



    public Response put(Map<String, String> headers, JsonObject body){
        uri=baseuri+endPoint;
        return given().headers(headers).body(body.toString()).when().put(uri);
    }

    public Response put( JsonObject body){
        uri=baseuri+endPoint;
        return given().contentType("application/json").body(body.toString()).when().put(uri);
    }

    public Response post( JsonObject body){
        uri=baseuri+endPoint;
        return given().contentType("application/json").body(body.toString()).when().post(uri);
    }

    public Response post(Map<String, String> headers, JsonObject body){
        uri=baseuri+endPoint;
        return given().headers(headers).body(body.toString()).when().post(uri);
    }


    public void addName(){
        jsonObject.getAsJsonObject("name").addProperty("name", RandomStringUtils.random(10,true,false));
    }
    public void addName(String name){
        jsonObject.getAsJsonObject("name").addProperty("name", name);
    }



}
