package com.restapiexample.dummy.restapiexampleinfo;

import com.restapiexample.dummy.model.RestCreatePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestapiPutTest extends TestBase {

    @Test
    public void updateEmployeesWithPut() {

        RestCreatePojo restCreateUserPojo = new RestCreatePojo();
        restCreateUserPojo.setEmployee_name("Bina Shah");
        restCreateUserPojo.setEmployee_salary("65000");
        restCreateUserPojo.setEmployee_age("34");
        restCreateUserPojo.setProfile_image("http://update.jpg");

        Response response = given()
                .header("Content-Type", "application/json")
                .basePath("/update")
                .pathParam("id", 1236)
                .body(restCreateUserPojo)
                .when()
                .put("{id}");

        response.prettyPrint();
        response.then().statusCode(200);
    }
}




