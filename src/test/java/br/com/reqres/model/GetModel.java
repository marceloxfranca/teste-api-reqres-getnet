package br.com.reqres.model;

import br.com.reqres.core.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static br.com.reqres.core.Constantes.*;
import static io.restassured.RestAssured.*;

public class GetModel extends BaseTest {

    public GetModel() {

    }

    protected Response listUsers () {
        return given()
                .when()
                .contentType(ContentType.JSON)
                .get(PATH_LIST_USERS)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }

    protected Response singleUser () {
        return given()
                .when()
                .contentType(ContentType.JSON)
                .get(PATH_SINGLE_USER)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }

    protected Response singleUserNotFound () {
        return given()
                .when()
                .contentType(ContentType.JSON)
                .get(PATH_SINGLE_USER_NOT_FOUND)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }

    protected Response listResource () {
        return given()
                .when()
                .contentType(ContentType.JSON)
                .get(PATH_LIST_RESOURCE)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }

    protected Response singleResource () {
        return given()
                .when()
                .contentType(ContentType.JSON)
                .get(PATH_SINGLE_RESOURCE)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }

    protected Response singleResourceNotFound () {
        return given()
                .when()
                .contentType(ContentType.JSON)
                .get(PATH_SINGLE_NOT_FOUND)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }

    protected Response delayedResponse () {
        return given()
                .when()
                .contentType(ContentType.JSON)
                .get(PATH_DELAYED)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }
}
