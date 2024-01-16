package br.unesp.rc.springtutorial.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper=true, includeFieldNames=true)
public class Juridica extends Pessoa {

    private String cnpj;

    public Juridica() {
    }
} 
