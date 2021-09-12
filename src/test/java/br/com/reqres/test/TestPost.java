package br.com.reqres.test;

import br.com.reqres.model.PostModel;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPost extends PostModel {

/* CRIA USUARIO */
    @Test
    void testCreateStatus201() {
        Response response = createUser();
        assertEquals(HttpStatus.SC_CREATED, response.statusCode());
        System.out.println("Teste CREATE Com POST Realizado com Sucesso! ");
    }

/* REGISTRA UM USUARIO */
    @Test
    void testRegisterSuccessfulStatus200() {
        Response response = registerSuccessful();
        assertEquals(HttpStatus.SC_OK, response.statusCode());
        System.out.println("Teste REGISTER SUCCESSFUL Com POST Realizado com Sucesso! ");
    }

/* TENTA REGISTRAR UM USUARIO COM DADOS INCOMPLENTO */
    @Test
    void testRegisterUnSuccessfulStatus400() {
        Response response = registerUnsuccessful();
        assertEquals(HttpStatus.SC_BAD_REQUEST, response.statusCode());
        System.out.println("Teste REGISTER UNSUCCESSFUL Com POST Realizado com Sucesso! ");
    }

/* REALIZA LOGIN COM SUCESSO */
    @Test
    void testLoginSuccessfulStatus200() {
        Response response = loginSuccessful();
        assertEquals(HttpStatus.SC_OK, response.statusCode());
        System.out.println("Teste LOGIN SUCCESSFUL Com POST Realizado com Sucesso! ");
    }

/* TENTA REALIZAR LOGIN COM DADOS INCOMPLETO */
    @Test
    void testLoginUnSuccessfulStatus400() {
        Response response = loginUnSuccessful();
        assertEquals(HttpStatus.SC_BAD_REQUEST, response.statusCode());
        System.out.println("Teste LOGN UNSUCCESSFUL Com POST Realizado com Sucesso! ");
    }
}
