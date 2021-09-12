package br.com.reqres.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DadosModel {

    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String name;
    private String job;
    private String supportUrl;

    public DadosModel(int id, String email, String firstName, String lastName, String name, String job, String supportUrl) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = name;
        this.job = job;
        this.supportUrl = supportUrl;
    }
}
