package br.unesp.rc.springtutorial.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Pessoa {

    private long idPessoa;
    private String nome;
    private List<Endereco> endereco;
    private Acesso acesso;
    private Contato contato;

    public Pessoa() {
        this.endereco = new ArrayList<>();
    }

    public void setEndereco(Endereco endereco) {
        this.endereco.add(endereco);
    }
}