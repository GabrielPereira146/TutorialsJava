package br.unesp.rc.springtutorial.entity;

import lombok.Data;

@Data
public class Endereco {

    private long idEndereco;
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco() {
    }
}