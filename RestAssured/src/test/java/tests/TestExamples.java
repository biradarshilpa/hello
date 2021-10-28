package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExamples {
    @Test
    public void test_1() {

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Status Code " + response.getStatusCode());
        System.out.println("Time " + response.getTime());
        System.out.println("Response Body " + response.getBody().asString());
        System.out.println("Response Header " + response.getHeader("content_type"));

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }
}
