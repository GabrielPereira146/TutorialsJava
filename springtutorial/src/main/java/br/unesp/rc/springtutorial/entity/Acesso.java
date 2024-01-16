package br.unesp.rc.springtutorial.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data

public class Acesso {

    private String usuario;
    private String senha;

    public Acesso() {
    }

}
