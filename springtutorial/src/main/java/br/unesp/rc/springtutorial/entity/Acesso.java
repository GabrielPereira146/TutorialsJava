package br.unesp.rc.springtutorial.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Embeddable
@Entity(name="Acesso")
@Data

public class Acesso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAcesso;

    @Column(name = "acesso_usuario", unique = true)
    private String usuario;

    @Column(name = "acesso_senha")
    private String senha;

    public Acesso() {
    }
}

