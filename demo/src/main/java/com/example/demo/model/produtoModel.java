package com.example.demo.model;

import lombok.Data;

@Data
public class produtoModel {

    produtoModel(){}
    private int id;
    private String nome;
    private double preço;
    public produtoModel(int id, String nome, double preço){
        this.id = id;
        this.nome = nome;
        this.preço = preço;
    }
}
