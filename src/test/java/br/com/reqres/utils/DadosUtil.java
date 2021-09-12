package br.com.reqres.utils;

import java.util.Random;

public class DadosUtil {

    public static int aleatorio(int maximo) {
        return new Random().nextInt(maximo);
    }
}
