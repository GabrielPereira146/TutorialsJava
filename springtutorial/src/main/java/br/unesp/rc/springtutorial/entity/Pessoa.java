package br.unesp.rc.springtutorial.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity(name = "Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Pessoa {

     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPessoa;

    private String nome;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "pessoa_idpessoa")
    private List<Endereco> endereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "acesso_idAcesso")
    private Acesso acesso;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contato_idContato")
    private Contato contato;

    public Pessoa() {
        this.endereco = new ArrayList<>();
    }

    public void setEndereco(Endereco endereco) {
        this.endereco.add(endereco);
    }
}