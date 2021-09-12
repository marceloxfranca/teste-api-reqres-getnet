package br.com.reqres.model;

import br.com.reqres.core.BaseTest;
import br.com.reqres.utils.DadosUtil;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

import static br.com.reqres.core.Constantes.PATH_UP_DEL;
import static io.restassured.RestAssured.given;

public class PatchModel extends BaseTest {

    JSONObject usuarioObj = new JSONObject();

    JSONObject atualizaComPatch() {
        usuarioObj.append("name", "Candidato Número: " + DadosUtil.aleatorio(20));
        usuarioObj.accumulate("job", "QA Specialist");
        return usuarioObj;
    }

    protected Response updateUserPatch () {
        return given()
                .when()
                .body(atualizaComPatch().toString())
                .contentType(ContentType.JSON)
                .patch(PATH_UP_DEL)
                .then()
                .extract()
                .response()
                .prettyPeek();
    }

}
