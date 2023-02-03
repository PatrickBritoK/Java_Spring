package com.example.demo.model;

import lombok.Data;

@Data
public class funcionarioModel {
    funcionarioModel(){}
    private int id;
    private String nome;
    private String cpf;
    public funcionarioModel(int id, String nome, String cpf){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

}
