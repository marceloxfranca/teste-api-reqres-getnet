package br.com.reqres.core;

import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.*;

public class BaseTest {

    @BeforeAll
    public static void baseApi () {
        baseURI = "https://reqres.in/api/";
    }
}
