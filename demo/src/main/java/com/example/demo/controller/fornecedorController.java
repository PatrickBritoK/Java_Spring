package com.example.demo.controller;

import com.example.demo.model.fornecedorModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class fornecedorController {
    @GetMapping("/fornecedor")
    public ResponseEntity<List<fornecedorModel>> fornecedor(){
        List<fornecedorModel> fornecedor = new ArrayList<>();

                fornecedor.add(new fornecedorModel(3,"Maria","09.739.644/0001-70"));
        return ResponseEntity.ok(fornecedor);
    }
}
