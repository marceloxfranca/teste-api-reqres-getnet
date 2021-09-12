package br.com.reqres.test;

import br.com.reqres.model.PatchModel;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPatch extends PatchModel {

/* ATUALIZA UM USUARIO COM PATCH */
    @Test
    void testUpdateUserPatchStatus200() {
        Response response = updateUserPatch();
        assertEquals(HttpStatus.SC_OK, response.statusCode());
    }
}
