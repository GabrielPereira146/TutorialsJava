package br.unesp.rc.springtutorial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import lombok.ToString;

@Entity
@Table(name = "PessoaJuridica")
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true, includeFieldNames = true)
public class Juridica extends Pessoa {

    private static final long serialVersionUID = 1L;

    @Column(name = "cnpj", unique = true)
    private String cnpj;

    public Juridica() {
    }
}
