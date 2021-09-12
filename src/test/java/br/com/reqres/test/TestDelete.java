package br.com.reqres.test;

import br.com.reqres.model.DeleteModel;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDelete extends DeleteModel {

/* DELETA UM USUARIO */
    @Test
    void testDeleteUserStatus204() {
        Response response = deleteUser();
        assertEquals(HttpStatus.SC_NO_CONTENT, response.statusCode());
        System.out.println("Teste DELETE Realizado com Sucesso! ");
    }

}
