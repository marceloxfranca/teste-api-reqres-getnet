package br.com.reqres.test;

import br.com.reqres.model.GetModel;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestGet extends GetModel {

/* LISTA TODOS OS USUÁRIOS DA PAGINA 2*/
    @Test
     void testeListUsersStatus200 () {
        Response response = listUsers ();
        assertEquals(HttpStatus.SC_OK, response.statusCode());
        System.out.println("Teste LIST USERS Realizado com Sucesso! ");
    }

/* LISTA UM UNICO USUARIO */
    @Test
    void testeSingleUserStatus200 () {
        Response response = singleUser();
        assertEquals(HttpStatus.SC_OK, response.statusCode());
        System.out.println("Teste SINGLE USER Realizado com Sucesso! ");
    }
/* LISTA UM USUARIO NAO ENCONTRADO NA API */
    @Test
    void testeSingleUserNotFoundStatus404 () {
        Response response = singleUserNotFound();
        assertEquals(HttpStatus.SC_NOT_FOUND, response.statusCode());
        System.out.println("Teste SINGLE USER NOT FOUND Realizado com Sucesso! ");
    }

/* LISTA TODOS OS USUARIOS DESCONHECIDOS */
    @Test
    void testeListResourceStatus200 () {
        Response response = listResource();
        assertEquals(HttpStatus.SC_OK, response.statusCode());
        System.out.println("Teste LIST RESOURCE Realizado com Sucesso! ");
    }

/* LISTA UM USUARIO DESCONHECIDO */
    @Test
    void testeSingleResourceStatus200 () {
        Response response = singleResource();
        assertEquals(HttpStatus.SC_OK, response.statusCode());
        System.out.println("Teste SINGLE RESOURCE Realizado com Sucesso! ");
    }

/* LISTA UM USUARIO DESCONHECIDO NAO ENCONTRADO */
    @Test
    void testeSingleResourceNotFoundStatus404 () {
        Response response = singleResourceNotFound();
        assertEquals(HttpStatus.SC_NOT_FOUND, response.statusCode());
        System.out.println("Teste SINGLE RESOURCE NOT FOUND Realizado com Sucesso! ");
    }

/* LISTA USUARIOS COM RESPOSTA ATRASADA */
    @Test
    void testeDelayedStatus200 () {
        Response response = delayedResponse();
        assertEquals(HttpStatus.SC_OK, response.statusCode());
        System.out.println("Teste DELAYED Realizado com Sucesso! ");
    }
}
