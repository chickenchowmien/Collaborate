package com.app.steps;

import com.app.utilities.ApiClassUtilities;
import com.app.utilities.ApiTestDataUtilities;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne {

    private ApiClassUtilities apiClassUtilities = new ApiClassUtilities();
    private ApiTestDataUtilities apiTestDataUtilities = new ApiTestDataUtilities();


    @Test
    public void sample(){
        apiClassUtilities.jsonObject = apiTestDataUtilities.getJsonFromFile("src/test/Resources/testData/example.json");
        apiClassUtilities.baseuri = "baseuri";
        apiClassUtilities.endPoint = "endpoint";
        JsonPath jsonPath = (JsonPath) apiClassUtilities.post(apiClassUtilities.jsonObject);
        Assert.assertEquals(jsonPath.get("name"),"james");
    }
}
