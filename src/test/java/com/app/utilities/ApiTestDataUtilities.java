package com.app.utilities;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.testng.Assert;

public class ApiTestDataUtilities {

    public JsonObject getJsonFromFile(String file){
        JsonParser jsonParser = new JsonParser();
        try{
            Object object = jsonParser.parse(file);
            return (JsonObject)object;
        }catch (Exception exception){
            Assert.fail("File Path Invalid - "+file);
        }
        return null;
    }
}
