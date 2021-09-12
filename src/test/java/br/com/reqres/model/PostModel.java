package br.com.reqres.model;

import br.com.reqres.core.BaseTest;
import br.com.reqres.utils.DadosUtil;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

import static br.com.reqres.core.Constantes.*;
import static io.restassured.RestAssured.*;

public class PostModel extends BaseTest {

        JSONObject usuarioObj = new JSONObject();
        JSONObject registerObj = new JSONObject();

        JSONObject usuarioJson() {
            usuarioObj.append("name", "Candidato Número: " + DadosUtil.aleatorio(20));
            usuarioObj.append("job", "QA" );
            return usuarioObj;
        }
        JSONObject registroJson() {
            registerObj.accumulate("email", "eve.holt@reqres.in");
            registerObj.accumulate("password", "pistol");
            return registerObj;
        }
        JSONObject registroSemSucessoJson() {
            registerObj.accumulate("email", "sydney@fife");
            return registerObj;
        }
        JSONObject loginJson() {
            registerObj.accumulate("email", "eve.holt@reqres.in");
            registerObj.accumulate("password", "cityslicka");
            return registerObj;
        }
        JSONObject loginSemSucessoJson() {
            registerObj.accumulate("email", "peter@klaven");
            return registerObj;
        }

    protected Response createUser() {
        return given()
                .when()
                .body(usuarioJson().toString())
                .contentType(ContentType.JSON)
                .post(PATH_CREATE)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }

    protected Response registerSuccessful() {
        return given()
                .when()
                .contentType(ContentType.JSON)
                .body(registroJson().toString())
                .post(PATH_REGISTER)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }

    protected Response registerUnsuccessful() {
        return given()
                .when()
                .contentType(ContentType.JSON)
                .body(registroSemSucessoJson().toString())
                .post(PATH_REGISTER)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }

    protected Response loginSuccessful() {
        return given()
                .when()
                .contentType(ContentType.JSON)
                .body(loginJson().toString())
                .post(PATH_LOGIN)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }

    protected Response loginUnSuccessful() {
        return given()
                .when()
                .contentType(ContentType.JSON)
                .body(loginSemSucessoJson().toString())
                .post(PATH_LOGIN)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }

}
