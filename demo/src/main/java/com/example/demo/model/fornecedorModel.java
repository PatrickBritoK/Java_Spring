package com.example.demo.model;

import lombok.Data;

@Data
public class fornecedorModel {
    fornecedorModel(){}
    private int id;
    private String nome;
    private String cnpj;
    public fornecedorModel(int id, String nome, String cnpj){
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }
}
