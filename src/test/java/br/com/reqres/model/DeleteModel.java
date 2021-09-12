package br.com.reqres.model;

import br.com.reqres.core.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static br.com.reqres.core.Constantes.*;
import static io.restassured.RestAssured.given;

public class DeleteModel extends BaseTest {

    public DeleteModel () {

    }

    protected Response deleteUser() {
        return given()
                .when()
                .contentType(ContentType.JSON)
                .delete(PATH_UP_DEL)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }
}
