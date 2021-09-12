package br.com.reqres.model;

import br.com.reqres.core.BaseTest;
import br.com.reqres.utils.DadosUtil;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

import static br.com.reqres.core.Constantes.*;
import static io.restassured.RestAssured.*;

public class PutModel extends BaseTest {


    JSONObject usuarioObj = new JSONObject();

    JSONObject atualizaUsuario() {
        usuarioObj.accumulate("name", "Candidato Número: " + DadosUtil.aleatorio(20));
        usuarioObj.accumulate("job", "QA Matrix");
        return usuarioObj;
    }

    protected Response updateUser() {
        return given()
                .when()
                .body(atualizaUsuario().toString())
                .contentType(ContentType.JSON)
                .put(PATH_UP_DEL)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }
}
