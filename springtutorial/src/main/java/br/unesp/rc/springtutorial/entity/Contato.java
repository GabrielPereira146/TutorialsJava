package br.unesp.rc.springtutorial.entity;

import lombok.Data;


@Data
public class Contato {

    private long idContato;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String celular;
    private String email;

    public Contato() {
    }
}