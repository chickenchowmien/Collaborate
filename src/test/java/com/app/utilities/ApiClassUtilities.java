package com.app.utilities;

import com.google.gson.JsonObject;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiClassUtilities {

    public JsonObject jsonObject  = new JsonObject();
    public String baseuri = "";
    public String endPoint = "";




    public Response put(Map<String, String> headers, JsonObject body, String uri){
        return given().headers(headers).body(body.toString()).when().put(uri);
    }

    public Response put( JsonObject body, String uri){
        return given().contentType("application/json").body(body.toString()).when().put(uri);
    }

    public Response post( JsonObject body, String uri){
        return given().contentType("application/json").body(body.toString()).when().post(uri);
    }

    public Response post(Map<String, String> headers, JsonObject body, String uri){
        return given().headers(headers).body(body.toString()).when().post(uri);
    }
}
