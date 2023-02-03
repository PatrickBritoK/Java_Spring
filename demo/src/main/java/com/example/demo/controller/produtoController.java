package com.example.demo.controller;

import com.example.demo.model.produtoModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class produtoController {

    @GetMapping("/produto")
    public ResponseEntity<List<produtoModel>> produto(){
        List<produtoModel> produto = new ArrayList<>();

                produto.add(new produtoModel(1, "sla", 841));
                        return ResponseEntity.ok(produto);
    }
}
