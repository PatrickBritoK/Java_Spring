package com.example.demo.controller;

import com.example.demo.model.pessoaModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //ele vai fazer com o que a Spring saiba que essa classe tem rotas para ele listar.
public class pessoaController {
    @GetMapping("/pessoa") //anotação para indicar que é uma rota do tipo get, que vai ser acessada pelo /pessoa
    public ResponseEntity<List<pessoaModel>> pessoa(){
        //ResponseEntity é um objeto a ser retornado
        //List<pessoaModel> é o tipo de dado que vai ser retornado
        //o ResponseEntity transforma a lista em um objeto json com os dados.

        List<pessoaModel> pessoas = new ArrayList<>(); //cria a lista de pessoas


        pessoaModel pessoa1 = new pessoaModel();//adiciona pessoas usando o construtor de pessoaModel.
        pessoaModel pessoa2 = new pessoaModel();//o mesmo de cima mas com dados diferentes.

        pessoa1.setId(1);
        pessoa1.setNome("Joao");
        pessoa1.setIdade(20);

        pessoa2.setId(2);
        pessoa2.setNome("Maria");
        pessoa2.setIdade(32);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        return ResponseEntity.ok(pessoas); //da o retorno da lista de pessoas

        //pessoas.add(new pessoaModel(1, "joao", 20));
    }

}
