package br.com.reqres.test;

import br.com.reqres.model.PutModel;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPut extends PutModel {

/* ATUALIZA UM USUARIO*/
    @Test
    void testUpdateUserStatus200() {
        Response response = updateUser();
        assertEquals(HttpStatus.SC_OK, response.statusCode());
        System.out.println("Teste UPDATE Com PUT Realizado com Sucesso! ");
    }
}
